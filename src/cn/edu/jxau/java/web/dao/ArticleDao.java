package cn.edu.jxau.java.web.dao;

import java.util.ArrayList;

import cn.edu.jxau.java.web.dbutil.JdbcUtils;
import cn.edu.jxau.java.web.object.Article;

public class ArticleDao{

	private JdbcUtils jdbcUtils = null;

	public ArrayList<Article> getObjectSet() {
		
		if(jdbcUtils == null){
			jdbcUtils = new JdbcUtils();
		}
		jdbcUtils.getConnection();
		ArrayList<Article> list = jdbcUtils.getObjectSet();
		jdbcUtils.releaseConn();	
		return list;	
	}
	/**
	 * 
	* @Title: main 
	* @Description: TODO(测试dao) 
	* @param @param args    设定文件 
	* @return void    返回类型 
	* @throws
	 */
	public static void main(String[] args){
		ArrayList<Article> list = new ArticleDao().getObjectSet();
		for(Article i : list ){
			System.out.println(i.toString());
		}
		
	}
}
