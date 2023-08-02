package com.merge;


public class PrimaryData {
private Integer Mobile_number;
private String Name;
public PrimaryData() {}
public Integer getMobile_number() {
	return Mobile_number;
}

public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public void setMobile_number(Integer mobile_number) {
	Mobile_number = mobile_number;
}
@Override
public String toString() {
	return "PrimaryData [Mobile_number=" + Mobile_number + ", Name=" + Name + "]";
}

}

