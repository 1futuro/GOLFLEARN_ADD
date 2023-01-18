package com.golflearn.common;

public enum LoginType {
	일반로그인(1),
	카카오로그인(2),
	네이버로그인(3);
	Integer devType;
	
	LoginType(Integer devType){
		this.devType = devType;
	}
	
	public Integer getValue(){
		return this.devType;
	}
	
	public static LoginType toLoginType(Integer code) {
		for (LoginType value : LoginType.values()) {
			if (value.getValue().equals(code)) {
				return value;
			}
		}
		return null;
	}
}
