package com.merge;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbResUtil{
	public List<PrimaryData> getPd(){
		List<PrimaryData> pl=new ArrayList<PrimaryData>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","Happy12345**");
			Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery("select * from PrimaryData");
			while(rs.next()) {
				Integer mobile_number=rs.getInt("Mobile_number");
				String name=rs.getString("Name");
				
				PrimaryData pd=new PrimaryData();
				pd.setMobile_number(mobile_number);
				pd.setName(name);
				pl.add(pd);
			}}
			catch(Exception e) {
				System.out.println(e.getMessage());
				}
		return pl;
	}
	public List<SecondaryData> getPd1(){
		List<SecondaryData> pl1=new ArrayList<SecondaryData>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School","root","Happy12345**");
			Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery("select*from SecondaryData");
			while(rs.next()) {
				Integer mobile_number=rs.getInt("Mobile_number");
				String address=rs.getString("Address");
				
				SecondaryData pd1=new SecondaryData();
				pd1.setMobile_number(mobile_number);
				pd1.setAddress(address);
				pl1.add(pd1);
			}}
			catch(Exception e) {
				System.out.println(e.getMessage());
				}
		return pl1	;
	}

}

