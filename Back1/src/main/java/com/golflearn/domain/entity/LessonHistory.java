//package com.golflearn.domain.entity;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter @Setter
////@EqualsAndHashCode(of = {"lsnLineNo, lsnChkDt"})
//@Entity
//@Table(name="lesson_history")
//public class LessonHistory {
//	private LessonLine lsnLine;
//
//	@JsonFormat(pattern = "yy/MM/dd", timezone = "Asia/Seoul")
//	@Id
//	@Column(name="lsn")
//	private Date lsnChkDt;
//	
//	@Column(name="lsn_line_no")
//	private int lsnLineNo;
//	
//	private Lesson lsn;
//	
//	private Date minChkDt;
//	private int cntChkDt;
//}
