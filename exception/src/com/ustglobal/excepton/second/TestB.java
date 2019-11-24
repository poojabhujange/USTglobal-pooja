package com.ustglobal.excepton.second;

import java.io.IOException;
import java.sql.SQLException;

public class TestB {
	public static void main(String[] args)//dont throw a exception in main method
	{
		System.out.println("main started");
		
		FileTest ft = new FileTest();
	try{
		try {
			try {
				ft.open();
			} catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
			    e.printStackTrace();
		}
			finally{
				
			}
		}
		
	}

	}
