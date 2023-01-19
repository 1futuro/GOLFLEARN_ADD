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
import com.golflearn.domain.repository.ProInfoRepository;
import com.golflearn.domain.repository.UserInfoRepository;
import com.golflearn.exception.AddException;
import com.golflearn.exception.FindException;
import com.golflearn.exception.ModifyException;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor //final 필드에 대해 생성자를 만들어 줌
public class UserInfoService {
	
	@Autowired // 빈 객체 주입받음
	private UserInfoRepository userRepo;
	
	@Autowired
	private ProInfoRepository proRepo;
	
	private final JPAQueryFactory queryFactory;
	
	//아이디 찾기
	public UserInfo selectByUserNameAndPhone(String userName, String userPhone) throws FindException{
//		UserInfo userInfo = userRepo.selectByUserNameAndPhone(userName, userPhone);
//		return u
//		QUserInfo quserInfo = QUserInfo.
//		UserInfo userInfo = queryFactory.selectFrom(null)
		return null;
	}
	
	//핸드폰번호조회
	public UserInfo selectByUserIdAndPhone(String userId, String userPhone) throws FindException, JsonProcessingException, InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, URISyntaxException{
//		UserInfo userInfo = userRepo.selectByUserIdAndPhone(userId, userPhone);	
//		return userInfo;
		return null;
	}
	
	//비밀번호 변경
	public void updateByUserPwd(String userId, String userPwd) throws ModifyException{
//		userRepo.updateByUserPwd(userId, userPwd);
		
	}
	
	// 회원가입 - 수강생 (완료)
	public void signupStdt(UserInfo userInfo) throws AddException {
//		userRepo.insertStdt(userInfo);
		userRepo.save(userInfo);
		
	}
	
	// 회원가입 - 프로 (완료)
	public void signuppro(UserInfo userInfo, ProInfo proInfo) throws AddException{
//		userRepo.insertPro(userInfo, proInfo);
		userRepo.save(userInfo);
		proRepo.save(proInfo);
	}
	
	// 아이디 중복확인 (완료)
	public Optional<UserInfo> iddupchk(String userId) throws FindException {
		return userRepo.findById(userId);
	}	
	
	// 닉네임 중복확인 (완료)
	public UserInfo nicknamedupchk(String userNickname)throws FindException {
		QUserInfo qUserInfo = QUserInfo.userInfo;
		return queryFactory
				.selectFrom(qUserInfo)
				.where(qUserInfo.userNickname.eq(userNickname))
				.fetchOne();
	
	}
	
	// 로그인 (완료)
	public UserInfo login(String userId, String userPwd) throws FindException {
		QUserInfo qUserInfo = QUserInfo.userInfo;
		log.error("userPwd : ", userPwd);
		log.error("QuserPwd : ", qUserInfo.userPwd);
		if(!qUserInfo.userPwd.equals(userPwd)) {
			throw new FindException("비밀번호 불일치");
		}
		UserInfo loginQuery = queryFactory
				.selectFrom(qUserInfo)
				.where((qUserInfo.userId.eq(userId))
				.and(qUserInfo.userPwd.eq(userPwd)))
				.fetchOne(); // 1행만 반환
		log.error("loginQuery : ",loginQuery);
		return loginQuery;
	}
	
}