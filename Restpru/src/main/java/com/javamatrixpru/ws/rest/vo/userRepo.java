package com.javamatrixpru.ws.rest.vo;

import org.springframework.boot.json.JsonParser;

public interface userRepo  extends JsonParser{

	Object findAll();


}
