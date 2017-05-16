package com.hi.action;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.hi.dao.UserDao;
import com.hi.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
private	UserDao userDao;
	private User user;
	private String name;
	private String cha;
	private List<String> findnames;
	
public List<String> getFindnames() {
		return findnames;
	}

	public void setFindnames(List<String> findnames) {
		this.findnames = findnames;
	}

public String getCha() {
		return cha;
	}

	public void setCha(String cha) {
		this.cha = cha;
	}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

public UserDao getUserDao() {
		return userDao;
	}

	public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

public String save(){
	userDao.save(user);
	
	return "save";
}
public void cha() throws IOException{
	System.out.println(name);
	boolean flag=false;
	findnames=userDao.findname();
	System.out.println(findnames);
	for (String names : findnames) {
		if(name.equals(names)){
			flag=true;
		}
	}
	
	if(flag==true){
		cha="已存在";
	}else {
		cha="不存在";
	}
	HttpServletResponse response=ServletActionContext.getResponse();
	response.setContentType("text/html;charset=utf-8");
	response.setCharacterEncoding("utf-8");
	response.getWriter().write(cha);
	
	
}
}
