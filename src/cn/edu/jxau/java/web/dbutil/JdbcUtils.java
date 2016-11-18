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
 * @Description: 创建一个数据库工具类
 * @author MangoDai 96555734@qq.com
 * @date 2016年11月4日 下午7:33:37
 *
 */
public class JdbcUtils {

	// 表示定义数据库的用户名
	private final String USERNAME = "root";
	// 定义数据库的密码
	private final String PASSWORD = "qwe123QWE123";
	// 定义数据库的驱动信息
	private final String DRIVER = "com.mysql.jdbc.Driver";
	// 定义访问数据库的地址
	private final String URL = "jdbc:mysql://localhost:3306/blog";
	// 定义数据库的链接
	private Connection conn;
	// 定义sql语句的执行对象
	private PreparedStatement psmt;
	// 定义查询返回的结果集合
	private ResultSet rs;
	// 实现批处理操作的功能
	private Statement stmt;

	/**
	 * 
	 * <p>
	 * Title: 构造函数
	 * </p>
	 * <p>
	 * Description: 创建时测试数据库连接问题
	 * </p>
	 */
	public JdbcUtils() {
		try {
			Class.forName(DRIVER);
			System.out.println("注册驱动成功!!");
		} catch (Exception e) {
		}
	}

	/**
	 * 
	 * @Title: getConnection
	 * @Description: // 定义获得数据库的链接
	 * @param @return 设定文件
	 * @return Connection 返回类型
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
	* @Description: TODO(得到所有文章对象) 
	* @param @return    设定文件 
	* @return ArrayList<Article>    返回类型 
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
