package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.BookService;
import model.ServiceMan;

public class BookingDao {
	public static void bookService(BookService b) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql ="insert into book_services(cid,sid,sname,semail,stype,status) values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, b.getCid());
			pst.setInt(2, b.getSid());
			pst.setString(3, b.getSname());
			pst.setString(4, b.getSemail());
			pst.setString(5, b.getStype());
			pst.setString(6, b.getStatus());
			pst.executeUpdate();
			System.out.println("service booked");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<BookService> pendingServicesBySid(int id){
		List<BookService> list = new ArrayList<BookService>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql ="select * from book_services where status='pending' and sid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				BookService b = new BookService();
				b.setBid(rs.getInt("bid"));
				b.setCid(rs.getInt("cid"));
				b.setSid(rs.getInt("sid"));
				b.setSname(rs.getString("sname"));
				b.setSemail(rs.getString("semail"));
				b.setStype(rs.getString("stype"));
				b.setStatus(rs.getString("status"));
				list.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void approveStatus(int bid) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql ="update book_services set status='approved' where bid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, bid);
			pst.executeUpdate();
			System.out.println("status approved");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<BookService> approvedServicesBySid(int id){
		List<BookService> list = new ArrayList<BookService>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql ="select * from book_services where status='approved' and sid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				BookService b = new BookService();
				b.setBid(rs.getInt("bid"));
				b.setCid(rs.getInt("cid"));
				b.setSid(rs.getInt("sid"));
				b.setSname(rs.getString("sname"));
				b.setSemail(rs.getString("semail"));
				b.setStype(rs.getString("stype"));
				b.setStatus(rs.getString("status"));
				list.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
