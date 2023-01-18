package com.golflearn.common;

public enum LessonStatus {
	모집중단(0),
	모집중(1),
	승인대기(2),
	승인반려(3);
	Integer devType;
	
	LessonStatus(Integer devType){
		this.devType = devType;
	}
	public Integer getValue(){
		return this.devType;
	}
	
	public static LessonStatus toLoginType(Integer code) {
		for (LessonStatus value : LessonStatus.values()) {
			if (value.getValue().equals(code)) {
				return value;
			}
		}
		return null;
	}
	
}
