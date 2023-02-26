package DAO;
import Connect.Connect;
import Model.Nguoi_choi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
public class PlayerDAO {
    private static Connection conn = Connect.getConnect();

    public static ArrayList<Nguoi_choi> getListPlayer() {
        ArrayList<Nguoi_choi> listPlayer = new ArrayList<>();
        String sql = "SELECT * FROM players";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Nguoi_choi nguoi_choi = new Nguoi_choi();
                nguoi_choi.setID_NguoiChoi(rs.getInt("id"));
                nguoi_choi.setTen_NguoiChoi(rs.getString("username"));
                nguoi_choi.setMatKhau_NguoiChoi(rs.getString("password"));
                nguoi_choi.setNapTien(rs.getInt("money"));
                listPlayer.add(nguoi_choi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listPlayer;
    }

    public static Vector getData() {
        ArrayList<Nguoi_choi> nguoi_chois = PlayerDAO.getListPlayer();
        Vector result = new Vector<>();
        for (Nguoi_choi nguoi_choi: nguoi_chois) {
            Vector temp = new Vector<>();
            temp.add(nguoi_choi.getID_NguoiChoi());
            temp.add(nguoi_choi.getTen_NguoiChoi());
            temp.add(nguoi_choi.getMatKhau_NguoiChoi());
            temp.add(nguoi_choi.getNapTien());

            result.add(temp);
        }
        return result;
    }

    public static boolean addPlayer(Nguoi_choi nguoi_choi){
        String sql = "INSERT INTO players(id, username, password, money) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nguoi_choi.getID_NguoiChoi());
            ps.setString(2, nguoi_choi.getTen_NguoiChoi());
            ps.setString(3, nguoi_choi.getMatKhau_NguoiChoi());
            ps.setInt(4, nguoi_choi.getNapTien());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();// trùng id hay lỗi j đó nó báo ở đây
        }
        return false;
    }
    public static boolean napTien(int id, int tien){
        String sql = "UPDATE players SET money = money + ? WHERE id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, tien);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean delete(int id){
        String sql = "DELETE FROM players WHERE id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static ResultSet checkLogin(String username, String password){
        String sql = "SELECT * FROM players WHERE username=? AND password=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static boolean update(int id, Nguoi_choi nguoi_choi){
        String sql = "UPDATE players set id=?,username=?, password=?," + "money=? where id=?  ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, nguoi_choi.getTen_NguoiChoi());
            ps.setString(3, nguoi_choi.getMatKhau_NguoiChoi());
            ps.setInt(4, nguoi_choi.getNapTien());
            ps.setInt(5, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        PlayerDAO.addPlayer(new Nguoi_choi(1, "hh", "222", 222));
        for (Nguoi_choi nguoi_choi: PlayerDAO.getListPlayer())
            System.out.println(nguoi_choi);
    }
}
