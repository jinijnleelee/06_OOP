package edu.kh.oop.cls.model.vo;

public class User {
	
	//필드
	//==속성
	
	//아이디,비번,이름,나이,성별(추상화)
	
	
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	
	
	//생성자
	//기본생성자
	public User() {
		
		System.out.println("기본생성자로 User 객체 생성");
		//필드 초기화 +  기능
		 userId = "user01";
		 userPw = "pass01";
		 userName = "홍길동";
		 userAge = 20;
		 userGender = 'M';
			
		 
		 // ==> 
	}
	
	//매개변수 생성자
	//** 사용되는 기술,변수 : 매개변수,overloading(오버로딩),this
	
	//**매개변수 : 생성자나 메서드 호출시 () 안에 작성되며 
	//전달되어지는 값을 저장하는 변수
	//전달받은 값을 저장하고 있는 매개체(지니고있는) 역할의 변수
	
	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
		
		
		
	}
	
	
	//메서드
	
	//캡슐화로 입한 간접 접근 기능( getter/ setter )
	public String getUserId() {
		
		//userId의 getter
		//반환할 값의 자료형을 쓰는것
		return userId;
	}
	
	
	public void setUserId(String userId) {
		
		this.userId = userId;
		//userId의 setter
		//(매개변수 받아올 자료형)
	}

	public String getUserPw() {
		
		//userId의 getter
		//반환할 값의 자료형을 쓰는것
		return userPw;
	}
	
	
	public void setUsePw(String userPw) {
		
		this.userPw = userPw;
		//userId의 setter
		//(매개변수 받아올 자료형)
	}
	public String getUserName() {
		
		//userId의 getter
		//반환할 값의 자료형을 쓰는것
		return userName;
	}
	
	
	public void setUserName(String userName) {
		
		this.userName = userName;
		//userId의 setter
		//(매개변수 받아올 자료형)
	}
	public int getUserAge() {
		
		//userId의 getter
		//반환할 값의 자료형을 쓰는것
		return userAge;
	}
	
	
	public void setUserAge(int userAge) {
		
		this.userAge = userAge;
		//userId의 setter
		//(매개변수 받아올 자료형)
	}


	public char getUserGender() {
		return userGender;
	}


	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}


	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	
	//getter setter 자동완성
	//알트 + 쉬프트 + s
	//제너레이트 게터앤 세터

}
