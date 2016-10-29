package com.helloOne.sys.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.helloOne.sys.entity.User;

@Service
public interface UserService {
	public void createUser(String name, String password,String eamil,String avatar);
	public  List<User>  findAll();
	public void  export(HttpServletResponse response);

}
