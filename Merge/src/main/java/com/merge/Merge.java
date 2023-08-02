package com.merge;
//import java.sql.Connection;

//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Merge {

	public static void main(String[] args) {
		DbResUtil ds=new DbResUtil();
		List<PrimaryData> pd=ds.getPd();
		List<SecondaryData> pd2=ds.getPd1();
		Map<Integer, PrimaryData> primaryMap=new HashMap<>();
        	
		if(!pd.isEmpty()) {
			for(PrimaryData p:pd) {
				if(p!=null) {
					primaryMap.put(p.getMobile_number(),p);
				}
			}
		}

		if(!pd2.isEmpty()) {
			for(SecondaryData p1:pd2) {
				if(p1!=null) {
					PrimaryData pdd=primaryMap.get(p1.getMobile_number());
					System.out.println("Mobile_number: "+" "+pdd.getMobile_number());
					System.out.println("Address: "+" "+p1.getAddress());
					System.out.println("Name: "+pdd.getName());
				}}} }}


