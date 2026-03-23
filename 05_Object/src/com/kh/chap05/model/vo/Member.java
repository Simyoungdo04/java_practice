package com.kh.chap05.model.vo;

public class Member {
	// 웹사이트를 만들건데 회원의 정보를 어딘가에 저장해두어야 한다.
	// [필드부]
	// 아이디, 비밀번호, 닉네임
	private String userId;
	private String userPwd;
	private String nickName;
	
	// [생성자부]
	
	// [메소드부]
	// getter() / setter() / info()
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public String info() {
		String info ="아이디 : " + userId + "\n비밀번호 : " + userPwd + "\n닉네임 : " + nickName;
		return info;
	}
	
	
	
	
	
	
	
	
}
