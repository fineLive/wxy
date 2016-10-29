package com.helloOne.sys.service.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.helloOne.sys.dao.UserDao;
import com.helloOne.sys.entity.User;
import com.helloOne.sys.service.UserService;
import com.helloOne.sys.utils.DateUtil;
import com.helloOne.sys.utils.NumberUtil;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	public void createUser(String name, String password,String email,String avatar) {
		User user=new User();
		user.setId(NumberUtil.createId());
		user.setName(name);
		user.setPassword(password);
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		user.setEmail(email);
		user.setAvatar(avatar);
		user.setDelFlag(0);
		userDao.insert(user);
		
	}

	
	
	
	public List<User> findAll() {
		List<User> users = userDao.findAll();
		return users;
		
	
	}



	public void export(HttpServletResponse response) {
		
		
	}
	
	
	
	
}
