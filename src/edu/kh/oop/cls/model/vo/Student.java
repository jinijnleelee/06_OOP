package edu.kh.oop.cls.model.vo;



public class Student { //클래스 선언부
	//[접근제한자 ][예약어] class 클래스명
	
	//접근제한자 public : 같은 프로젝트 내에서 어떤 클래스에서든 import 할 수 있음을 나타냄
	
	
	//필드
	//생성자
	//메소드
	
	
	//필드[field] : 객체의 속성을 작성하는 클래스 내부 영역
	// == 맴버 변ㅅ : 메서드 밖에 작성된 변수
	//1. 인스턴스 변수 : 필드에 작성되는 일반 변수(객체 미생성시 사용불가)
	//2.클래스 변수(== static 변수)필드에 static 예약어가 작성된 변수(객체 생성 안해도 쓸수있음)
	
	
	/*필드구성
	 *  
	 * [접근제한자][예약어]             자료형  변수명 [=초기값];// 대괄호 선택사항
	 * +public    final              기본쟈료형
	 * #protectes static              배열
	 * ~(default)  final static      클래스명
	 * private static final          (참조형)
	 * 
	  =>vlfem=> 필드의 접근제한자는 : 직접 접근 가능한 법위를 나타냄
	  
	  **/
	public int v1 =10;
	 protected int v2 = 20;
	 int v3 = 30;
	 //특별한 경우 아니면 private 사용
	 private int  v4 =0;
	 public void ex() {
	
	 System.out.println(v1);
	 System.out.println(v2);
	 System.out.println(v3);
	 System.out.println(v4);

	 }
	 
	 
	 //static 예약어
	 public static String schoolName = "정보요육원";
	
	 private String name;
	 {
		 name = "홍길동";
	 }
	 
	 
	 
	 
	 
	 public String getName() { 
	
	
	return name;
	
	}

//getter setter
//
public void setName(String name) {
	this.name = name;
}


//생성자(construector)
/*
 * -new 연산자를 통해서 객체를 생성할때
 * 생성된 객체의 필드값 초기화 + 지정된 기능을 수행하는 역할
 * 
 * 
 * -생성자 작성규칙
 * 1)생성자의 이름은 반드시 클래스명과 같아야함
 * 2)반환형이 존재하지 않음
 * 
 * 
 * -생성자 종류
 * 1)기본 생성자
 * 2)매개변수 생성자
 * 
 * */


//기본 생성자
//[접근제한자]클래스명() { }
public Student() {
	//객체가 생성될때 수행할 코드
	System.out.println("기본생성자에 의해   " + " Student 객체가 생성됨");
}


}
