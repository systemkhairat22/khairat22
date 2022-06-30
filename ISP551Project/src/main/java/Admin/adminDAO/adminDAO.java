package Admin.adminDAO;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import databaseConnection.ConnectionManager;
import modelClass.admin;
//This DAO class provide CRUD database operations for member in database
public class adminDAO {
	Connection con = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	private int id,age;
	private String icnum,name,email,password,phonenum,supervisorid;
	
	//create admin.................
	public void createAdmin(admin bean) {
		try {
			icnum = bean.getAdmin_icnum();
			name = bean.getAdd_name();
			age = bean.getAdd_age();
			email = bean.getAdd_email();
			password = bean.getAdd_password();
			phonenum = bean.getAdd_phonenum();
			supervisorid = bean.getSupervisorid();
			
			System.out.println("-------------------------------");
			System.out.println(icnum);
			System.out.println(name);
			System.out.println(age);
			System.out.println(email);
			System.out.println(password);
			System.out.println(phonenum);
			System.out.println(supervisorid);
			
			//call getConenction() method
			con = ConnectionManager.getInstance().getConnection();
			
			if(con != null)
				System.out.println("Connection OK");
			//create statement-----------
			ps = con.prepareStatement(
			"INSERT INTO admin(admin_icnum,add_name,add_age,add_email,add_password,add_phonenum,supervisorid"
			+ "VALUES(?,?,?,?,?,?,?)");
			ps.setString(1, icnum);
			System.out.println("icnum tried");
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, email);
			ps.setString(5, password);
			ps.setString(6, phonenum);
			ps.setString(7, supervisorid);
			
			//execute query
			ps.executeUpdate();
			System.out.println("Successfull create");
			
			//close conenction
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//get admin by id
	public static admin getAdminById(int adminid) {
		admin a = new admin();
		try {
			//call getconnection() method
			Connection con = ConnectionManager.getInstance().getConnection();
			//create statement
			ps = con.prepareStatement("SELECT * FROM admin WHERE adminid=?");
			ps.setInt(1, adminid);
			
			//execute query
			rs = ps.executeQuery();
			if(rs.next()) {
				a.setAdminid(rs.getInt("adminid"));
				a.setAdmin_icnum(rs.getString("admin_icnum"));
				a.setAdd_name(rs.getString("add_name"));
				a.setAdd_age(rs.getInt("add_age"));
				a.setAdd_email(rs.getString("add_email"));
				a.setAdd_password(rs.getString("add_password"));
				a.setAdd_phonenum(rs.getString("add_phonenum"));
				a.setSupervisorid(rs.getString("supervisorid"));
			}
			//close connection
			con.close();
		}catch(Exception e) {
		e.printStackTrace();
		}
		return a;
	}
	
	//delete admin---------
	public void deleteAdmin(int adminid) {
		try {
			//call getConnection() method
			con = ConnectionManager.getInstance().getConnection();
			
			// create statement
			ps = con.prepareStatement("DELETE FROM admin WHERE adminid=?");
			ps.setInt(1, adminid);
			
			//execute query
			ps.executeUpdate();
			
			//close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//update admin------
	public void updateAdmin(admin bean) {
		icnum = bean.getAdmin_icnum();
		name = bean.getAdd_name();
		age = bean.getAdd_age();
		email = bean.getAdd_email();
		password = bean.getAdd_password();
		phonenum = bean.getAdd_phonenum();
		supervisorid = bean.getSupervisorid();
		
		try {
			//call getConenction() method
			con = ConnectionManager.getInstance().getConnection();
			
			//create statement
			ps = con.prepareStatement("UPDATE admin SET admin_icnum=?,add_name=?,add_age=?,add_email=?,add_password=?,add_phonenum?,supervisorid=?")
			
			ps.setString(1, icnum);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setInt(4, age);
			ps.setString(5, password);
			ps.setString(6, phonenum);
			ps.setString(7, supervisorid);
			
			//execute query
			ps.executeUpdate();
			System.out.println("Successfully Update");
			
			//close connection()
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
