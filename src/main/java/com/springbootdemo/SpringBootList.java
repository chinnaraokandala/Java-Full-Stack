package com.springbootdemo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.springbootdemo.beans.StudentBean;

public class SpringBootList {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chinna", "root", "root");
		Statement statement =con.createStatement();
		ResultSet rs = ((java.sql.Statement) statement).executeQuery("select*from chinna.student");
		List<StudentBean> obj = new ArrayList<StudentBean>();
		while (rs.next()) {
			StudentBean sbobj = new StudentBean(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
			obj.add(sbobj);
		}
		System.out.println("List size of=" + obj.size());
		for(StudentBean sbobj : obj) {
			System.out.println(sbobj.getId() + " " + sbobj.getName() + " " + sbobj.getAge() + " " + sbobj.getMarks()
					+ " " + sbobj.getCity());
		}

	}
}
