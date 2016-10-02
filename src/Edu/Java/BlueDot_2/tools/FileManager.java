package Edu.Java.BlueDot_2.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class FileManager {
	private static String fileName = "contacts.txt";
	private static File f = new File(fileName);
	private static FileInputStream fis = null;
	private static FileOutputStream fos = null;
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
		// Statement s = con.createStatement();
		// ResultSet rs = s.executeQuery("select * from contacts");

		// Connection con =DriverManager.getConnection(
		// "jdbc:mysql://127.0.0.1:3306/world",
		// "root", "qwe123QWE123");
		// ResultSet rs = s.executeQuery("select * from city");

		// while(rs.next()){
		// System.out.println(rs.getString("name"+"   "+rs.getString("telnum")
		// ));
		// System.out.println(rs.getString("name"));
		// }
		if (conn != null) {
			return conn;
		} else {
			JOptionPane.showMessageDialog(null, "腾讯云服务器连接失败  ");
			System.exit(0);
		}
		return null;
	}

	/*
	 * public static void main(String args[]){ initi(); }
	 */
	private static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Object[][] getMassage() {
		/*
		 * try { //1.0 file txt fis = new FileInputStream(f); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }finally{ try { fis.close(); } catch
		 * (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */
		try {
			conn = initi();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(conn);
		}
		return null;
	}

	private static boolean addMassege(String name, int number) {
		try {
			fos = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}

}
