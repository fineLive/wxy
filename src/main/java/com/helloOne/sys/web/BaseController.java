package com.helloOne.sys.web;

import java.util.List;

import com.google.gson.Gson;
import com.helloOne.sys.entity.User;

public class BaseController {
	private Gson json;
	
	String jsonSuccess(Object o ){
		
		return json.toJson(o);
	}
	
	
}
