package cn.edu.jxau.java.web.object;

/**
 * 
* @ClassName: Article 
* @Description: TODO(������) 
* @author MangoDai 96555734@qq.com
* @int 2016��11��4�� ����7:44:21 
*
 */
public class Article {
	//����id
	private int id ;
	//���±���
	private String name;
	//���²���ʱ��
	private int date;
	//���·��ʴ���
	private int click ;
	//�û����� ��ֻ����ţ����������
	private int username;
	//�����Ƿ�����
	private int type;
	//��������
	private String content;
	//�����Ƿ��ö�
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
	* <p>Title: �вι��캯��</p> 
	* <p>Description: ����</p> 
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
	* <p>Title: �޲ι���</p> 
	* <p>Description: ����</p>
	 */
	public Article() {
		super();
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + "]";
	}
	
	
}
