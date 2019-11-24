package com.ustglobal.filehandaling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesfFileReader {
public static void main(String[] args) {
	String path ="text.properties";
	FileReader reader = null;
	try{
		reader = new FileReader(path);
		Properties properties = new Properties();
		properties.load(reader);
		String name = properties.getProperty("name");
		String company = properties.getProperty("company");
		String father = properties.getProperty("father");


		System.out.println("Name:"+name);
		System.out.println("company:"+company);
		System.out.println("father:"+father);
	}catch(Exception e){
		e.printStackTrace();
	}
}




}
