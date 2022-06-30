package Member.memberDAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import modelClass.member;
import databaseConnection.ConnectionManager;
//This DAO class provides CRUD database operations for member in database
public class memberDAO {
	Connection con = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	private int id,age;
	private String icnum,name,gender,address,email,phoneNum,repName,repIcnum;
	
	//create member---------------------------
	public void createMember(member bean) {

		try {
			
			icnum = bean.getMem_icnum();
			name = bean.getMem_name();
			age = bean.getMem_age();
			gender = bean.getMem_gender();
			address = bean.getMem_address();
			email = bean.getMem_email();
			phoneNum = bean.getMem_phonenum();
			repName = bean.getRepresentative_name();
			repIcnum = bean.getRepresentative_icnum();
			
			System.out.println("-------------------------------");
			System.out.println(icnum);
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			System.out.println(address);
			System.out.println(email); 
			
			//call getConnection() method
			con = ConnectionManager.getInstance().getConnection();
			
		if (con != null)
				System.out.println("Connection OK");
			//create-------------------------------------------
			//3. create statement
			ps = con.prepareStatement (
			"INSERT INTO member(mem_icnum, mem_name, mem_age, mem_gender, mem_address, mem_email, mem_phonenum, representative_name, representative_icnum) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);");
			ps.setString(1, icnum);
			System.out.println("icnum tried");
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, gender);
			ps.setString(5, address);
			ps.setString(6, email);
			ps.setString(7, phoneNum);
			ps.setString(8, repName);
			ps.setString(9, repIcnum);
		
			
			//4.execute query
			ps.executeUpdate();
			System.out.println("Successfull create");
			
			//5. close connection
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//get member by id----------------------------------------
	public static member getMemberById(int memberid) {
		member m = new member();
		try {
			// call getconnection() method
			Connection con = ConnectionManager.getInstance().getConnection();
			
			//create statement
			ps = con.prepareStatement("SELECT * FROM member WHERE memberid=?");
			ps.setInt(1, memberid);
			
			//execute query
			//4. execute query
			rs = ps.executeQuery();
			if(rs.next()) {
			m.setMemberid(rs.getInt("id"));
			m.setMem_name(rs.getString("mem_name"));
			m.setMem_age(rs.getInt("mem_age"));
			m.setMem_gender(rs.getString("mem_gender"));
			m.setMem_address(rs.getString("mem_address"));
			m.setMem_email(rs.getString("mem_email"));
			m.setMem_phonenum(rs.getString("mem_phonenum"));
			m.setRepresentative_name(rs.getString("representative_name"));
			m.setRepresentative_icnum(rs.getString("representative_icnum"));
			}
			//5. close connection
				con.close();
			}catch(Exception e) {
			e.printStackTrace();
			}
			return m;
	}
	
	
	//delete member--------------------------------------------------
	public void deleteMember(int memberid) {
		try {
			//call getConnection() method
			con = ConnectionManager.getInstance().getConnection();
			
			// create statement
			ps = con.prepareStatement("DELETE FROM member WHERE memberid=?");
			ps.setInt(1, memberid);
			
			//execute query
			ps.executeUpdate();
			
			//close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//update member-------------------------------------------
	public void updateMember(member bean) {
		icnum = bean.getMem_icnum();
		name = bean.getMem_name();
		age = bean.getMem_age();
		gender = bean.getMem_gender();
		address = bean.getMem_address();
		email = bean.getMem_email();
		phoneNum = bean.getMem_phonenum();
		repName = bean.getRepresentative_name();
		repIcnum = bean.getRepresentative_icnum();
		
		try {
			//call getConnection() method
			con = ConnectionManager.getInstance().getConnection();
			
			//3. create statement
			ps = con.prepareStatement("UPDATE member SET mem_icnum=?,mem_name=?,mem_age=?,mem_gender=?,mem_address=?,mem_email=?,mem_phonenum=?,representative_name=?,representative_icnum=?,WHERE id=?");
		
			ps.setString(1, icnum);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, gender);
			ps.setString(5, address);
			ps.setString(6, email);
			ps.setString(7, phoneNum);
			ps.setString(8, repName);
			ps.setString(9, repIcnum);
			
			//4.execute query
			ps.executeUpdate();
			System.out.println("Successfully Update");
			
			//5. close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
