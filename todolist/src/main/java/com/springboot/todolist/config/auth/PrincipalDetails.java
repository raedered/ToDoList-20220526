package com.springboot.todolist.config.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springboot.todolist.domain.User;

import lombok.Data;

@Data
public class PrincipalDetails implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	
	private User user;
	
	public PrincipalDetails(User user) {
		this.user = user;
	}
	
	public PrincipalDetails(User user, Map<String, Object> attributes) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() { //권한담고있는 Collection
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		return authorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}
	
	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {	//계정이 만료되었는 확인
		return true;
	}

	@Override
	public boolean isAccountNonLocked() { //비밀번호가 지정한 횟수 이상 틀리면 잠김
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() { //자격 증명이 만료가 되면 계정사용 불가
		return true;
	}

	@Override
	public boolean isEnabled() { //휴먼계정
		return true;
	}

}
