package cn.edu.jxau.java.web.object;

/**
 * 
* @ClassName: Article 
* @Description: TODO(文章类) 
* @author MangoDai 96555734@qq.com
* @int 2016年11月4日 下午7:44:21 
*
 */
public class Article {
	//文章id
	private int id ;
	//文章标题
	private String name;
	//文章产生时间
	private int date;
	//文章访问次数
	private int click ;
	//用户姓名 ，只是序号，降低冗余度
	private int username;
	//文章是否隐藏
	private int type;
	//文章内容
	private String content;
	//文章是否置顶
	private int up;
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	
	/**
	 * 
	* <p>Title: 有参构造函数</p> 
	* <p>Description: 构造</p> 
	* @param id
	* @param name
	* @param int
	* @param click
	* @param username
	* @param type
	* @param content
	* @param up
	 */
	public Article(int id, String name, int date, int click, int username,
			int type, String content, int up) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.click = click;
		this.username = username;
		this.type = type;
		this.content = content;
		this.up = up;
	}
	
	/**
	 * 
	* <p>Title: 无参构造</p> 
	* <p>Description: 构造</p>
	 */
	public Article() {
		super();
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + "]";
	}
	
	
}
