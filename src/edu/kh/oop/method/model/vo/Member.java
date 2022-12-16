package edu.kh.oop.method.model.vo;

public class Member {
	
	//필드

	
	private String memberId;
	private String memberPw;
	private String memberNAme;
	private int memberAge;
	
	
	//생성자
	//기본생성자
	//기본생성자 규칙 : 반환형이 없고 클래스와 이름이 같아야 한다.
	public Member() {}


	public Member(String memberId, String memberPw, String memberNAme, int memberAge) {
		
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberNAme = memberNAme;
		this.memberAge = memberAge;
	}



	
	public String getMemberId() {
					
		return memberId;
	}

	//매개변수 전달받은 값을membeId 필드에 대입
	//(매개변수 ==전달받은 값을 지니고 있는 변수)
	public void setMemberId(String memberId) {
		//set + 필드명
		this.memberId = memberId;
	}


	public String getMemberPw() {
		return memberPw;
	}


	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}


	public String getMemberNAme() {
		return memberNAme;
	}


	public void setMemberNAme(String memberNAme) {
		this.memberNAme = memberNAme;
	}


	public int getMemberAge() {
		return memberAge;
	}


	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	
	
	
	//매개변수 생성자
	
	//매서드

}
