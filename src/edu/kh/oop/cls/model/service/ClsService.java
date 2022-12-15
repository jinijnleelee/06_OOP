package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService {

		// 클래스 접근자 확인
		public void ex1() {
		Student std = new Student();
		//public class인 Student는 import 가능
		
		//TestVO test = new TestVO();
	//	(default )  class인 TestVO는 import 불가(다른패키지여서)
		
		System.out.println(std.v1);
		//다른 패키지에서도 접근가능한 public만 에러가 없다
		
	
}
	public void ex2() {
	//static 필드 확인 예제
	
	//학생 객체 2개 생성

	Student std1 = new Student();
	Student std2 = new Student();
	
	
	
	//public 이기 때문에 직접 접근 가능
	System.out.println(std1.schoolName);
	
	

	
	
	System.out.println("변경전 " +std1.getName());

	std1.setName("조미현");
	System.out.println("변경전 " +std1.getName());

	
	
	System.out.println("변경전 " + std1.schoolName);
	std1.schoolName = "kh고등학교";
	System.out.println("변경후 " + std1.schoolName);

	Student.schoolName = "KH";
	System.out.println("Student.schoolName :" + Student.schoolName);


	
	/* static
	 * 
	 * 1) 공유 메모리 영억(또는 정적 메모리 영역) 이라고 함
	 * 
	 * => 프로그램 시작시 static 이 붙은 코드들이
	 * 모두 static 영역에 생성되고
	 * 프로그램이 종료될 때 까지 사라지지않음.(정적)
	 * 그리고 static 영역에 생성되 ㄴ변수는 어디서든 공유가능(공유)
	 * 
	 * 2)사용법 :  클래스명,변수명
	 * 
	 * 
	 * */
}

	
	
	public void ex3() {
		//생성자 확인 테스트
		Student s1 = new Student();
					//기본 생성자
		
		// User 기본 생성자를 이용해 객체생성
		User u1 = new User();
		
		User u2 = new User();
	
		//User 객체 필드 초기화 확인
		System.out.println("=============1=========");
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserGender());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserId());
		//클래스에서 메서드에 getter  setter 미작성시 
		//간접접근 불가능
		
	
		
		
		
		
		//문제점 : u1이 참조하고있는 User객체와
		//u1가 참조하고있는 User2객체가 필드의 값이 모두 동일함
		// 같은 기본생성자로 User객체 생성했기 때문에...
		
		//해결방법 ` : setter를 이용해서 새로운 값 대입
		
		u2.setUserId("afnk2");
		u2.setUserPw("5446");
		u2.setUserName("이진영");
		u2.setUserAge(20);
		u2.setUserGender('f');
		System.out.println("=============2=========");
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserGender());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserId());
		
		
		User u3 = new User("test22","pw123");
		System.out.println("=============3=========");
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		System.out.println(u3.getUserGender());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserId());
		
		

		User u4 = new User("flfkfk","pw54564566");
		
		System.out.println("=============4=========");
		System.out.println(u4.getUserId());
		System.out.println(u4.getUserPw());
		System.out.println(u4.getUserGender());
		System.out.println(u4.getUserAge());
		System.out.println(u4.getUserId());
		
	
		
	}
	
	
}

