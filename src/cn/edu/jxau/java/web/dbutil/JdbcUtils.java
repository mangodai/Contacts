package cn.edu.jxau.java.web.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import cn.edu.jxau.java.web.object.Article;

/**
 * 
 * @ClassName: JdbcUtils
 * @Description: ����һ�����ݿ⹤����
 * @author MangoDai 96555734@qq.com
 * @date 2016��11��4�� ����7:33:37
 *
 */
public class JdbcUtils {

	// ��ʾ�������ݿ���û���
	private final String USERNAME = "root";
	// �������ݿ������
	private final String PASSWORD = "qwe123QWE123";
	// �������ݿ��������Ϣ
	private final String DRIVER = "com.mysql.jdbc.Driver";
	// ����������ݿ�ĵ�ַ
	private final String URL = "jdbc:mysql://localhost:3306/blog";
	// �������ݿ������
	private Connection conn;
	// ����sql����ִ�ж���
	private PreparedStatement psmt;
	// �����ѯ���صĽ������
	private ResultSet rs;
	// ʵ������������Ĺ���
	private Statement stmt;

	/**
	 * 
	 * <p>
	 * Title: ���캯��
	 * </p>
	 * <p>
	 * Description: ����ʱ�������ݿ���������
	 * </p>
	 */
	public JdbcUtils() {
		try {
			Class.forName(DRIVER);
			System.out.println("ע�������ɹ�!!");
		} catch (Exception e) {
		}
	}

	/**
	 * 
	 * @Title: getConnection
	 * @Description: // ���������ݿ������
	 * @param @return �趨�ļ�
	 * @return Connection ��������
	 * @throws
	 */
	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			
		}
		return conn;
	}
	/**
	 * 
	* @Title: getObjectSet 
	* @Description: TODO(�õ��������¶���) 
	* @param @return    �趨�ļ� 
	* @return ArrayList<Article>    �������� 
	* @throws
	 */
	public ArrayList<Article> getObjectSet() {
		ArrayList<Article> list = new ArrayList<Article>(10);
		String sql = "select * from article";
		try {
			Statement stmt = conn.createStatement();			
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				int id = rs.getInt("article_id");
				String name = rs.getString("article_name");
				int time = rs.getInt("article_time");
				int click = rs.getInt("article_click");
				int user = rs.getInt("user_id");
				int type = rs.getInt("article_type");
				String content = rs.getString("article_content");
				int up = rs.getInt("article_up");
				Article artitle = new Article(id,name,time,click,user,type,content,up);
				list.add(artitle);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public void releaseConn() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
