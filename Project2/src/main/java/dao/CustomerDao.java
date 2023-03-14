package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.Customer;
import model.ServiceMan;

public class CustomerDao {
	public static void insertCustomer(Customer c) {
		try {
			Connection con = DBConnection.createConnection();
			String sql = "insert into customer(name,contact,address,email,password) values(?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, c.getName());
			pst.setLong(2, c.getContact());
			pst.setString(3, c.getAddress());
			pst.setString(4, c.getEmail());
			pst.setString(5, c.getPassword());
			pst.executeUpdate();
			System.out.println("customer inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Customer customerLogin(Customer c) {
		System.out.println(c);
		Customer c1 = null;
		try {
			Connection con = DBConnection.createConnection();
			String sql = "select * from customer where email=? and password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, c.getEmail());
			pst.setString(2, c.getPassword());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				c1 = new Customer();
				c1.setId(rs.getInt("id"));
				c1.setName(rs.getString("name"));
				c1.setContact(rs.getLong("contact"));
				c1.setAddress(rs.getString("address"));
				c1.setEmail(rs.getString("email"));
				c1.setPassword(rs.getString("password"));
				System.out.println(c1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c1;
	}

	public static Customer getCustomerById(int id) {
		Customer c1 = null;
		try {
			Connection con = DBConnection.createConnection();
			String sql = "select * from customer where id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				c1 = new Customer();
				c1.setId(rs.getInt("id"));
				c1.setName(rs.getString("name"));
				c1.setContact(rs.getLong("contact"));
				c1.setAddress(rs.getString("address"));
				c1.setEmail(rs.getString("email"));
				c1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c1;
	}
	public static List<Customer> getAllCustomer() {
		List<Customer> list = new ArrayList<Customer>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from customer";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Customer s1 = new Customer();
				s1.setId(rs.getInt("id"));
				s1.setName(rs.getString("name"));
				s1.setContact(rs.getLong("contact"));
				s1.setAddress(rs.getString("address"));
				s1.setEmail(rs.getString("email"));
				s1.setPassword(rs.getString("password"));
				list.add(s1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
