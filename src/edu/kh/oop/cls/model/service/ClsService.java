package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;

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
		
		
		
		
	}
}

