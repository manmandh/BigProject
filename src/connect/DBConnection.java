package connect;
import entities.Computer;
import entities.Player;

import java.sql.*;
import java.util.ArrayList;
import static java.sql.DriverManager.getConnection;
public class DBConnection {
    private static Connection conn = null;
    private static String DB_URL = "jdbc:mysql://localhost:3306/netshop";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";

    public DBConnection() {
        try {
            conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("Connected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static {
        try {
            conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("Connected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnect() {
        try {
            conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("Connected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static boolean addComputer(Computer may_tinh) {
        String sql = "INSERT INTO computers(computer_name, computer_timeIn, computer_timeOut, totalMoney, class) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, may_tinh.getTen_may());
            ps.setDate(2, null);
            ps.setDate(3, new Date(may_tinh.getTimeRa().getTime()));
            ps.setDouble(4, may_tinh.getTongTien());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static ArrayList<Computer> getListComputer() {
        ArrayList<Computer> listComputer = new ArrayList<>();
        String sql = "SELECT * computers";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Computer may_tinh = new Computer();
                may_tinh.setTen_may(rs.getString("computer_name"));
                may_tinh.setTimeVao(rs.getDate("computer_timeIn"));
                may_tinh.setTimeRa(rs.getDate("computer_timeOut"));
                may_tinh.setTongTien(rs.getDouble("computer_totalMoney"));
                listComputer.add(may_tinh);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listComputer;
    }
    public static boolean addPlayer(Player nguoi_choi){
        String sql = "INSERT INTO players(player_id, player_name, player_password, player_recharge, class) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, nguoi_choi.getID_NguoiChoi());
            ps.setString(2, nguoi_choi.getTen_NguoiChoi());
            ps.setString(3, nguoi_choi.getMatKhau_NguoiChoi());
            ps.setInt(4, nguoi_choi.getNapTien());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static ArrayList<Player> getListPlayer() {
        ArrayList<Player> listPlayer = new ArrayList<>();
        String sql = "SELECT * players";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Player nguoi_choi = new Player();
                nguoi_choi.setID_NguoiChoi(rs.getInt("player_id"));
                nguoi_choi.setTen_NguoiChoi(rs.getString("player_name"));
                nguoi_choi.setMatKhau_NguoiChoi(rs.getString("player_password"));
                nguoi_choi.setNapTien(rs.getInt("player_recharge"));
                listPlayer.add(nguoi_choi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listPlayer;
    }
    public static void main(String[] args) {
        System.out.println(DBConnection.getConnect());
    }
}






