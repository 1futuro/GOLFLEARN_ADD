//package com.golflearn.domain.entity;
//
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.DynamicInsert;
//import org.hibernate.annotations.DynamicUpdate;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//
//import lombok.AllArgsConstructor;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter @Setter
//@EqualsAndHashCode(of = {"lsnNo"})
//@Entity
//@Table(name="lesson")
//@DynamicInsert
//@DynamicUpdate
//public class Lesson {
//	
//	@Id
//	@Column(name="lsn_no")
//	private int lsnNo;
//	
//	@Column(name="user_id")
//	private String userId;
//	
//	@Column(name="loc_no")
//	private String locNo;
//	
//	@Column(name="lsn_title")
//	private String lsnTitle;
//	
//	@Column(name="lsn_lv")
//	private String lsnLv;	//고치기
//	
//	@Column(name="lsn_days")
//	private int lsnDays;
//	
//	@Column(name="lsn_intro")
//	private String lsnIntro;
//	
//	@Column(name="lsn_price")
//	private int lsnPrice;
//	
//	@Column(name="lsn_per_time")
//	private int lsnPerTime;
//	
//	@Column(name="lsn_cnt_sum")
//	private int lsnCntSum;
//	
//	@Column(name="lsn_star_sum")
//	private int lsnStarSum;
//	
//	@Column(name="lsn_star_ppl_cnt")
//	private int lsnStarPplCnt;
//	
//	@Column(name="lsn_status")
//	private int lsnStatus;
//	
//	@JsonFormat(pattern = "yy/MM/dd", timezone = "Asia/Seoul")
//	@Column(name="lsn_req_dt")
//	private Date lsnReqDt;
//	
//	@JsonFormat(pattern = "yy/MM/dd", timezone = "Asia/Seoul")
//	@Column(name="lsn_apv_Dt")
//	private Date lsnApvDt;
//	
//	@Column(name="lsn_rjt_reason")
//	private String lsnRjtReason;
//	
//	private float lsnStarScore;	//레슨별점(DB존재X) -레슨상세보기페이지
//	private float proStarScore;	//프로별점(DB존재X) -레슨상세보기페이지
//	
//	@Column
//	private int lsnStarPoint;
//  
//	private List<LessonClassification> lsnClassifications;
//	
//	private UserInfo userInfo;
//
//	private List<LessonLine> lsnLines;//하나의 레슨에 여러 레슨내역
//
//	private LessonLine lsnLine;
//	private LessonReview lsnReview;
//}
