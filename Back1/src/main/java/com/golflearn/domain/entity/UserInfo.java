package com.golflearn.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name="user_info")
@DynamicInsert
@DynamicUpdate
public class UserInfo {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private String userId;

	@Column(name="user_name")
	private String userName;

	@Column(name="user_nickname")
	private String userNickname;

	@Column(name="user_pwd")
	private String userPwd;

	@Column(name="user_phone")
	private String userPhone;

	@JsonFormat(pattern = "yy/MM/dd", timezone = "Asia/Seoul")
	@Column(name="user_join_dt")
	private Date userJoinDt;
	
	@Column(name="user_type")
	private int userType;
	
	@Column(name="user_quit_status")
	private int userQuitStatus;

	@OneToOne(mappedBy="userInfo")
	@JoinColumn(name="user_id")
	private ProInfo proInfo;

}
