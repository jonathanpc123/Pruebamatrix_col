package com.javamatrixpru.ws.rest.service;

import com.javamatrixpru.ws.rest.vo.VOUsuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL; 
import org.json.JSONObject;


public class RestClientMatrix {

	public static void main(String[] args) {
		
		VOUsuario vo = new  VOUsuario();
		vo.setApellidos("pinilla");
		vo.setPassword("1234");
		vo.setEmail("jonathan@gmail.com");
		vo.setNombres("jonathan");
		vo.setNumtel("31334564");
		vo.setNuser(105334527);
		vo.setPaís("colombia");
		vo.setCiudad("bogota");
	    vo.setUserValido(false);
	    
	    ClientConfig clientconfig = new DefaultClientConfig();
	    clientconfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,Boolean.true);
	    Client client = Client.create(clientconfig);
	    WebResource webResource= client.resource("https://629919657b866a90ec36c777.mockapi.io/api_matrix");
	    ClientResponse response = webResource.type("application/json").post(ClientResponse.class,vo);
	    vo= response.getEntity(VOUsuario.class);
	    System.out.println("!!!! response:[usaurio:"+vo.getEmail()+"]");
	    System.out.println("!!!! response:[usaurio:"+ vo.isUserValido()+"]");
	    	
	}
}
