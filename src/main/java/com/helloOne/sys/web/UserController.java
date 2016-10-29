package com.helloOne.sys.web;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.helloOne.sys.entity.User;
import com.helloOne.sys.service.UserService;
import com.helloOne.sys.utils.NumberUtil;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	
	@RequestMapping("/downLoad")
	public String downLoad(HttpServletResponse response){
		userService.export(response);
		return "down";
	}

	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll(){
		List<User>list=new ArrayList<User>();
		User user=new User();
		user.setId(NumberUtil.createId());
		list.add(user);
		return list.toString();
	}
	
	
	
	
	
	@RequestMapping("/register")
	@ResponseBody
	public String CreateUser(){
		userService.createUser("ldin", "sss","sdadsa","./1dsfdsfd.jpg");
		
		return "success";
	}
	
	
	
	

}
