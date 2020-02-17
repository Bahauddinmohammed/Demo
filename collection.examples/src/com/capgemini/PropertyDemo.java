package com.capgemini;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyDemo {
	public static void main(String[] args, char[] password) throws FileNotFoundException {
    
	Properties prop = new Properties();	
     FileInputStream  fis = new FileInputStream("data.properties");		
	  
     
     
     try {
     prop.load(fis);
     String username = prop.getProperty("username");
	 String  id = prop.getProperty("id");
	 String pass = prop.getProperty("password");
	 String city = prop.getProperty("city");
	 System.out.println(username);
	 System.out.println(id);
     System.out.println(password);
	 System.out.println(city);
	 prop.setProperty("fyy", "chary");
	 Enumeration<Object> en = prop.keys();
	 while(en.hasMoreElements()) {
	 
     }catch (Exception e) {
	
     e.printStackTrace();
	 
	
	 
     }
		
	}	
		
		
		
		
		
		
			
}
