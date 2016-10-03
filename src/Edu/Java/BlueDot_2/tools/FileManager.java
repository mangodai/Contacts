package Edu.Java.BlueDot_2.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Edu.Java.BlueDot_2.Contacts.User;

public class FileManager {
//	private static String fileName = "contacts.txt";
	private static final String insertSql = "INSERT INTO contacts(name,telnum) values (?,?)";
	private static final String updataSql = "UPDATA contacts(name,telnum) values (?,?)";
//	private static File f = new File(fileName);
//	private static FileInputStream fis = null;
//	private static FileOutputStream fos = null;
	private static Connection conn = null;

	private static Connection initi() throws Exception {
		/*
		 * if(!f.exists()){ try { f.createNewFile(); } catch (IOException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); return false;
		 * } }
		 */
		conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(
				"jdbc:mysql://115.159.81.77:3306/cost_management", "root",
				"qwe123QWE123");
//		 Statement s = conn.createStatement();
//		 ResultSet rs = s.executeQuery("select * from contacts");

		// Connection con =DriverManager.getConnection(
		// "jdbc:mysql://127.0.0.1:3306/world",
		// "root", "qwe123QWE123");
		// ResultSet rs = s.executeQuery("select * from city");

//		 while(rs.next()){
//		 System.out.println(rs.getString("name"+"   "+rs.getString("telnum")
//		 ));
//		 System.out.println(rs.getString("name"));
//		 }
		if (conn != null) {
			return conn;
		} else {
			JOptionPane.showMessageDialog(null, "腾讯云服务器连接失败  ");
			System.exit(0);
		}
		return null;
	}

	
//	 public static void main(String args[]) throws Exception{ getAll(); }
	 
	private static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<User> getAll() {
		/*
		 * try { //1.0 file txt fis = new FileInputStream(f); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }finally{ try { fis.close(); } catch
		 * (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */
		ArrayList<User> list = new ArrayList<User>();
		User u = null;
		try {
			conn = initi();
			 Statement s = conn.createStatement();
			 ResultSet rs = s.executeQuery("select * from contacts");
			 while(rs.next()){
				 u =new User();
				 u.setName(rs.getString("name"));
				 u.setTelnum(rs.getInt("telnum"));
				 System.out.println( rs.getString("name"));
				 System.out.println( rs.getInt("telnum"));
				 list.add(u);
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn);
		}
		return list;
	}

	public static boolean addUser(User u) {
/*		try {
			fos = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		try {
			conn = initi();
//			 Statement s = conn.createStatement();
			PreparedStatement prepareS= conn.prepareStatement(insertSql);
			prepareS.setString(1, u.getName());
			prepareS.setInt(2, u.getTelnum());
			if(prepareS.execute()){
				JOptionPane.showMessageDialog(null,"信息新增成功");
				return true;
			}else{
				JOptionPane.showConfirmDialog(null, "信息新增失败","信息",JOptionPane.ERROR_MESSAGE);			
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn);
		}
		return true;
	}
	
	public static boolean removeUser(User u){
		return true;
	}
	
	public static boolean updataUser(User u){
		try {
			conn = initi();
//			 Statement s = conn.createStatement();
			PreparedStatement prepareS= conn.prepareStatement(updataSql);
			prepareS.setString(1, u.getName());
			prepareS.setInt(2, u.getTelnum());
			if(prepareS.execute()){
				JOptionPane.showMessageDialog(null,"信息新增成功");
				return true;
			}else{
				JOptionPane.showConfirmDialog(null, "信息新增失败","信息",JOptionPane.ERROR_MESSAGE);			
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn);
		}
		return true;
	}

}
