package com.golflearn.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode(of = {"userInfo"})
@Entity
@Table(name="pro_info")
public class ProInfo {
	
	@Id
	@Column(name="user_id")
	private String userId;
	
	@Column(name="pro_career")
	private String proCareer;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private UserInfo userInfo;
}
