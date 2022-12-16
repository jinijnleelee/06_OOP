package edu.kh.oop.method.model.servise;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemverService {//클래스
	//속성(필드)
	//필드는 기본적으로 캡슐화 원칙에 의해 private이라는 접근제한자를 꼭 작성
	//필드에 변수를 하나 작성하면,클래스 어디에서든 사용가능
private Scanner sc = new Scanner(System.in);
//System.in 자바에서 기본적으로 지정해준 입력장치(키보드)



private Member memberInfo = null;//가입한 회원의 정보를 지정할 변수


private Member loginMember = null;//로그인한 회원의 정보를 저장할 변수

//기능(생성자,메서드)
//여러기능을 하나의 메소드에 모두 작성하지 말것
//되도록 하나의 기능만 수행하도록 작성
//메소드는 메소드당 딱 하나의 기능만 가지고 있는것이 좋다


//왜?
//기능별로 세분화 해놔야 필요한 기능만 호출하며 쓸수있다
//public void today() {
	//1.밥먹는행위
	//2.일하는 행위
	
//}
//public void eat( ) {}
//public void work( ) {}
//두가지를 나눠서 메소드를 만들고
//eat();work() 하나씩 불러서 쓸수 있게 된다

public MemverService() {
}
//public MemberService(int a) {} //기본생성자 미작성시 에러

//메서드 작성법
//[접근제한자] [예약어] 반환형 메소드명([매개변수]){}
//public static 	기본자료형
//protected final	참조형(배열,클래스)
//(default) abtract	 void
//private static final



//반환형 void
//반환(return)이란?
//		메서드 수행 후 호출부로 돌아가는 것
//		반환값 : 돌아가면서 가져갈 결과 값
//		반환형 : 반환 값의 자료형
//		void(텅빈,없는,무효의):돌려보낼값이 (반환 값)없다

//메뉴화면 출력 기능
public void displayMenu() {
	//일은 하는데 결과 값은 없음
	int menuNum = 0; //지역변수
	
	do {
	System.out.println("====회원 정보 관리 프로그램====");
	System.out.println("1.회원가입");
	System.out.println("2.로그인");
	System.out.println("3.회원정보조회");
	System.out.println("4.회원정보수정");
	System.out.println("0.프로그램 종료");
	
	System.out.printf("메뉴입력 >>>");
	menuNum = sc.nextInt();
	sc.nextLine();//입력버퍼에 남은 개행문자 제거
	
	switch(menuNum){
		
		case 1 : 
			System.out.println(signUp());
			break;
		case 2 : 
			System.out.println(login());
			break;
		case 3 : break;
		case 4 : break;
		case 0 : break;
		default:System.out.println("잘못입력하셨습니다 다시 눌러주세요");
	}
	
	
	}while(menuNum != 0 );//menuNum이 0이면 반복종료
	
}




//회원 가입 기능
		public String signUp() {
		//(반환형)
			
			System.out.println("***회원가입***");
			
			System.out.print("아이디: ");
			String memberId =sc.next();//지역변수
			//user01입력하면 
		//	1qjs위에 String memberId
			System.out.print("비밀번호:");
			String memberPw =sc.next();

			System.out.print("비밀번호확인:");
			String memberPw2 =sc.next();
			System.out.print("이름: ");
			String memberName =sc.next();
			System.out.print("나이:");
			String memberAge =sc.next();
			
			//비밀번호,비밀번호 확인이 일치하면 회원가입
			//일치하지 않으면 회원가입 실패
			
			if(memberPw.equals(memberPw2)) {
				//일치하는 경우
				memberInfo = new Member(memberId,memberPw,memberName,memberAge);
		//									2번
		return "회원가입 성공";
			}else {
				return "회원가입 실패";
				//자료형 맴버객체의 형탤르 띄고있는 애들만 넣을수있음
			//	매개변수생성자를 통해서 맴버형태의 자료형을 띄고있는 객체를 만든다
			}
		return "";
}
		
//로그인 메서드(기능)
		
		
	public String login() {
		System.out.println("----로그인----");
		//회원가입을 했는지 부터 확인
//==memberInfo가 객체를 참조하고 있는지 확인
	if(memberInfo == null) {
		return "회원가입부터 진행하세요";
		
	}
	
	System.out.println("아이디 입력:");
	String memberId = sc.next();
	
	System.out.println("비번 입력:");
	String memberPw = sc.next();
	
	
	if (memberId.equals(memberInfo.getMemberId()) &&
	(memberPw.equals(memberInfo.getMemberPw()))){
	
		loginMember = memberInfo;
		
		return "loginmember.get = memberInfo";
	}else {
		return "아이디 또는 비밀번호가 맞지않다";
		
	}
	}
		
//회원정보 조회 기능
//회원정보 수정(update) 기능
}

