package com.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.dao.UserDao;
import com.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private User user;
	private UserDao userDao;
	private String name;
	private List<User> list;
	private Integer id;
	private int count;
	private String age;
	List<String> names;
	String data;
	
	Map<String,String> json;
	List<Map<String,String>> li;



	public List<Map<String, String>> getLi() {
		return li;
	}


	public void setLi(List<Map<String, String>> li) {
		this.li = li;
	}


	public Map<String, String> getJson() {
		return json;
	}


	public void setJson(Map<String, String> json) {
		this.json = json;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public List<String> getNames() {
		return names;
	}


	public void setNames(List<String> names) {
		this.names = names;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public List<User> getList() {
		return list;
	}


	public void setList(List<User> list) {
		this.list = list;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

//保存新增对象
	public String saveuser(){
		try {
			System.out.println(name);
			User user1=new User();
			user1.setName(name);
			System.out.println(user1.getName());
			user1.setAge(age);
			userDao.sa(user1);
			return "save";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return INPUT;
		
		
	}
	//查询所有的数据
	public String findname(){
	 //name=userDao.find("");
		HttpServletRequest re=ServletActionContext.getRequest();
		String name=re.getParameter("name");
		
		list=userDao.find();
	User us=userDao.find().get(0);
		
		
		String name1=us.getName();
		String age=us.getAge();
		
		return "find";
	}
	public String findUser(){
		System.out.println(id+"-====================");

		user=userDao.findUser(id);
		System.out.println(User.class.isInstance(userDao.findUser(id))+"tttttttttttttttttttttt");
		return "user";
	}
	
	public String delete(){
		System.out.println(id);
		userDao.delete(userDao.findUser(id));
		return "delete";
		
	}
	
	public String  delete1(){
		userDao.delete1(id);
		
		return "delete";
	}
public String update(){
	
	
	user.setAge(user.getAge());
	user.setName(user.getName());
	userDao.update(user);
	return "update";
}

public String one(){
	HttpServletRequest re=ServletActionContext.getRequest();
	 name=re.getParameter("name");
	 System.out.println(name);
	list=userDao.findone(name);
	
	return "one";
}
public String count(){
	 count=userDao.count();
	System.out.println(count+"=================");
	
	return "count";
}
/*public void validate(){
	if(user.getName()==null||user.getName().trim().equals("")){
		addFieldError("user.name", "输入用户名");
	}
	if(user.getAge().length()>2){
		addFieldError("user.age", "年龄不对");
	}
}*/
public void ajax() throws IOException{
	names=userDao.username();
	System.out.println(names.size());
	System.out.println(name);	
	
	/*JSONArray json=JSONArray.fromObject(names);
	String jj=json.toString();*/
	//JSONObject json=new JSONObject();
//	json.put("name", "小黄");
//	json.put("age", "22");
//	li.add(json);
	names.add("2222");
	names.add("88888");
	//JSONArray js=JSONArray.fromObject(names);
	//System.out.println(js);
	//String js1=js.toString();
	if(name.equals("哈哈")){
		names.add(0, "已存在");
	}else{
		names.add(0, "不存在");
	}
	HttpServletResponse response=ServletActionContext.getResponse();
    response.setContentType("text/html;charset=utf-8");

	response.setCharacterEncoding("utf-8");
    response.getWriter().write(names.get(0));
}

}
