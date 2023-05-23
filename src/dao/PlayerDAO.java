package dao;
import connect.DBConnection;
import entities.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
public class PlayerDAO {
    private static Connection conn = DBConnection.getConnect();

    public static ArrayList<Player> getListPlayer() {
        ArrayList<Player> listPlayer = new ArrayList<>();
        String sql = "SELECT * FROM player";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Player nguoi_choi = new Player();
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
        ArrayList<Player> nguoi_chois = PlayerDAO.getListPlayer();
        Vector result = new Vector<>();
        for (Player nguoi_choi: nguoi_chois) {
            Vector temp = new Vector<>();
            temp.add(nguoi_choi.getID_NguoiChoi());
            temp.add(nguoi_choi.getTen_NguoiChoi());
            temp.add(nguoi_choi.getMatKhau_NguoiChoi());
            temp.add(nguoi_choi.getNapTien());

            result.add(temp);
        }
        return result;
    }

    public static boolean addPlayer(Player nguoi_choi){
        String sql = "INSERT INTO player(id, username, password, money) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nguoi_choi.getID_NguoiChoi());
            ps.setString(2, nguoi_choi.getTen_NguoiChoi());
            ps.setString(3, nguoi_choi.getMatKhau_NguoiChoi());
            ps.setInt(4, nguoi_choi.getNapTien());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();// duplicate id hay lỗi j đó nó báo ở đây
        }
        return false;
    }
    public static boolean napTien(int id, int tien){
        String sql = "UPDATE player SET money = money + ? WHERE id=?";
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
        String sql = "DELETE FROM player WHERE id=?";
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
        String sql = "SELECT * FROM player WHERE username=? AND password=?";
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
    public static boolean update(int id, Player nguoi_choi){
        String sql = "UPDATE player set id=?,username=?, password=?," + "money=? where id=?  ";
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
        PlayerDAO.addPlayer(new Player(1, "hh", "222", 222));
        for (Player nguoi_choi: PlayerDAO.getListPlayer())
            System.out.println(nguoi_choi);
    }
}
