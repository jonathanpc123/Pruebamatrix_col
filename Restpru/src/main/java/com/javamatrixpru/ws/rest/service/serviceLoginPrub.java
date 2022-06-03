package com.javamatrixpru.ws.rest.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.javamatrixpru.ws.rest.vo.userRepo;

@RestController
public class serviceLoginPrub {

  @Autowired
  private  userRepo vo;
	
  @GetMapping(value="/")
  public String getPage() {
	return null;
	  
  }
  
  public Object getUser() {
	  return vo.findAll();
	  
  }
  
}

