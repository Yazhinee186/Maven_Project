package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuraton_Reader {
	
	public static Properties p;
	
	public Configuraton_Reader() throws IOException {
		
		File f=new File("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Configuratoin.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		p=new Properties();
		
		p.load(fis);
		
	}
		
		public String getUrl() throws Throwable {			
			
		String url=	p.getProperty("url");
		
		return url;
			
			
		}
		
		public String getUsername() throws Throwable {
			
			String username = p.getProperty("username");
			return username;
			
		}
		
		public String getPassword() throws Throwable {
			
			String password = p.getProperty("password");
			
			return password;
		
		
		
	}
		
		public String getUrl1() {

			String url1 = p.getProperty("url1");
			
			return url1;
			
		}

		
		public String getUsername1() {

			String username1 = p.getProperty("username1");
			
			return username1;
		}
		
		public String getPassword1() {
			
			String password1 = p.getProperty("password1");
			
			return password1;
		}
		
		public String getPath1() {
			
			String path1 = p.getProperty("path1");
			return path1;
		}
}
