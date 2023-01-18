package com.golflearn.common;

public enum UserType {
	수강생(0),
	프로(1),
	관리자(2);
	Integer devType;
	
	UserType(Integer devType){
		this.devType = devType;
	}
	public Integer getValue(){
		return this.devType;
	}
	
	public static UserType toLoginType(Integer code) {
		for (UserType value : UserType.values()) {
			if (value.getValue().equals(code)) {
				return value;
			}
		}
		return null;
	}
	
}
