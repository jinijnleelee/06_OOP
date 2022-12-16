package edu.kh.oop.cls.model.vo;

public class User {
	
	//필드
	//==속성
	
	//아이디,비번,이름,나이,성별(추상화)

	
	//스태딕 이 써져있으면 클래스 변수
	//인스턴스 변수
	
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	
	
	//생성자
	//기본생성자 
	public User() {
	//	
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
	
	public User(String userId, String userPw ) {
		this.userId = userId;
		this.userPw = userPw;

		
		//매개변수로전달받은 값을 필드에 초기화(this 참조변수)
		
		//***this 참조변수***
		// - 객체가 자기자신을 참조할수있도록 하는 변수
		// - 모든 객체 내부에 숨겨져있음
		// - 사용 하는 이유-
		//=>필드명과 매개변수명이 같을경우
		//이름 구분하기 위해서 주로 사용.
		
		
	}
	
	//필드를 전부 초기화 하는 목적의 매개변수 생성자
	public User(String userId, String userPw, String userNAme, int userAge,char userGender ) {
		
		//User(userId,userPw) User는 자기를 3인칭으로 부르는거 싫어함
		this(userId,userPw); //this() 생성자
		// -같은 클래스의 다른 생성자를 호출할때 
		//생성자 내에 반드시 첫째줄에 작성되어야한다.
		//왜사용?
		//코드길이 감소,재사용성 증가,가독성의 문제로 잘 사용하지는 않음
		
		this.userAge = userAge;
		this.userName = userNAme;
		this.userGender = userGender;
	}
	
	//***자바***
	//자바는 기본적으로 필드명, 생성자명,메소드명,변수명의 중복을 허용하지않음
	
	
//	오버로딩(overloading)
//	클래스 내에 동일한 이름의 메서드(생성자도 포함)를 여러개 작성하는 방법
//	하나의 이름으로 여러 기능을 수행할 수 있게 한다
//	
//	오버로딩 조건
//	1) 메서드(생성자 포함)의 이름이 동일
//	2)매개변수의 갯수, 타입,순서 중 1개라도 달라야함
	
	
//	public User() {} //기본 생성자가 이미 작성되어 있어 중복으로 인식
	
	public User(String userId) {}//매개변수의 갯수가 같은 생성자 없음
//								-> 오버로딩 성립
	
	public User(int userAge) {}//매개변수 갯수는 같지만 타입이 다름
//								-> 오버로딩 성립
	public User(String userId, int userAge) {}
//매개변수 갯수는 같은게 위에있으나 타입이 다름
//				-> 오버로딩 성립
	public User(int userAge, String userId ) {}	
//매개변수 갯수와 타입은 같으나 순서가 다름 
//	-> 오버로딩 성립	

	/*
	public User(int userAge, String userName ) {}	
	//매개변수 갯수와 타입이 모두 같아서 오버로딩 불가.
//		-> 변수명은 신경쓰지 않는다 
	*/
	

//	public User(String userId, int userAge,char userGender ) {
//	}
//	
	
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
