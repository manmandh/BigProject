package dao;
import connect.DBConnection;
import entities.Computer;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
public class ComputerDAO {
    private static Connection conn = DBConnection.getConnect();
    public static ArrayList<Computer> getListComputer() {
        ArrayList<Computer> listComputer = new ArrayList<>();
        String sql = "SELECT * computers";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Computer may_tinh = new Computer();
                may_tinh.setTen_may(rs.getString("TypeOfName"));
                may_tinh.setTimeVao(rs.getDate("timeIn"));
                may_tinh.setTimeRa(rs.getDate("timeOut"));
                may_tinh.setTongTien(rs.getDouble("totalMoney"));
                listComputer.add(may_tinh);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listComputer;
    }

    public static Vector getData() {
        ArrayList<Computer> may_tinhs = ComputerDAO.getListComputer();
        Vector result = new Vector<>();
        for (Computer may_tinh: may_tinhs) {
            Vector temp = new Vector<>();
            temp.add(may_tinh.getTen_may());
            temp.add(may_tinh.getTimeVao());
            temp.add(may_tinh.getTimeRa());
            temp.add(may_tinh.getTongTien());
            result.add(temp);
        }
        return result;
    }
    public static boolean addComputer(Computer may_tinh) {
        String sql = "INSERT INTO computers(TypeOfName, timeIn, timeOut, totalMoney, class) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, may_tinh.getTen_may());
            ps.setDate(2, null);
            ps.setDate(3, new Date(may_tinh.getTimeRa().getTime()));
            ps.setDouble(4, may_tinh.getTongTien());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
         //   e.printStackTrace();
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


    public static void main(String[] args) {
     //   ComputerDAO.addComputer(new Computer("may 1", "2023-13-1", "2023-15-1", 222.0));
        for (Computer may_tinh: ComputerDAO.getListComputer())
            System.out.println(may_tinh);
    }
}
