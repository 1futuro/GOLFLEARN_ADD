package com.golflearn.common;

public enum StudentLessonStatus {
	수강예정(0),
	수강중(1),
	수강완료(2);
	Integer devType;
	
	StudentLessonStatus(Integer devType){
		this.devType = devType;
	}
	public Integer getValue(){
		return this.devType;
	}
	
	public static StudentLessonStatus toLoginType(Integer code) {
		for (StudentLessonStatus value : StudentLessonStatus.values()) {
			if (value.getValue().equals(code)) {
				return value;
			}
		}
		return null;
	}
	
}
