package com.golflearn.service;

import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.golflearn.domain.entity.ProInfo;
import com.golflearn.domain.entity.QUserInfo;
import com.golflearn.domain.entity.UserInfo;
import com.golflearn.domain.repository.UserInfoRepository;
import com.golflearn.exception.AddException;
import com.golflearn.exception.FindException;
import com.golflearn.exception.ModifyException;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor //final 필드에 대해 생성자를 만들어 줌
public class UserInfoService {
	
	@Autowired // 빈 객체 주입받음
	private UserInfoRepository repo;
	
	private final JPAQueryFactory queryFactory;
	
	//아이디 찾기
	public UserInfo selectByUserNameAndPhone(String userName, String userPhone) throws FindException{
//		UserInfo userInfo = repo.selectByUserNameAndPhone(userName, userPhone);
//		return u
//		QUserInfo quserInfo = QUserInfo.
//		UserInfo userInfo = queryFactory.selectFrom(null)
		return null;
	}
	
	//핸드폰번호조회
	public UserInfo selectByUserIdAndPhone(String userId, String userPhone) throws FindException, JsonProcessingException, InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, URISyntaxException{
//		UserInfo userInfo = repo.selectByUserIdAndPhone(userId, userPhone);	
//		return userInfo;
		return null;
	}
	
	//비밀번호 변경
	public void updateByUserPwd(String userId, String userPwd) throws ModifyException{
//		repo.updateByUserPwd(userId, userPwd);
		
	}
	
	// 회원가입 - 수강생
	public void signupStdt(UserInfo userInfo) throws AddException {
//		repo.insertStdt(userInfo);
		
	}
	
	// 회원가입 - 프로
	public void signuppro(UserInfo userInfo, ProInfo proInfo) throws AddException{
//		repo.insertPro(userInfo, proInfo);
	}
	
	// 아이디 중복확인
	public Optional<UserInfo> iddupchk(String userId) throws FindException {
		return repo.findById(userId);
	}	
	
	// 닉네임 중복확인
	public UserInfo nicknamedupchk(String userNickname)throws FindException {
//		return repo.selectByUserNickName(userNickname);
		QUserInfo qUserInfo = QUserInfo.userInfo;
		queryFactory.selectFrom(qUserInfo).where(qUserInfo.userNickname.eq(userNickname));
		return null;
	
	}
	
	// 로그인
	public UserInfo login(String userId, String userPwd) throws FindException {
//		UserInfo userInfo = repo.selectByUserIdAndPwd(userId, userPwd);
//		if(!userInfo.getUserPwd().equals(userPwd)) {
//			throw new FindException("비밀번호가 일치하지 않습니다.");
//		}
//		System.out.println(userInfo);
//		return userInfo;
		return null;
	}
	
}