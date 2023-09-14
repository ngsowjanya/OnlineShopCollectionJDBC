package com.cg.onlineshop.main;
import java.sql.Connection;

import com.cg.onlineshop.utills.DBUtil;
public class MainClass {
	public static void main(String[] args) {
		
Connection con = DBUtil.getDBConnection();
System.out.println(con);
	}
}