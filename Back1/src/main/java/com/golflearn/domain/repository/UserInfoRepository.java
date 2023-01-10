package com.golflearn.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.golflearn.domain.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

}
