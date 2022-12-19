package edu.kh.oop.practice.model.service;

import java.util.Scanner;

public class SnackMenu {

	
	
	private Scanner sc= new Scanner(System.in);
	private SnackController scr = new SnackController();
	

	public void menu() {
		
		System.out.println("스낵류를 입력하세요");
		
		System.out.print("종류 : ");
		String kind = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("맛 : ");
		String fiavar = sc.next();
		System.out.print("갯수 : ");
		int numOf = sc.nextInt();
		System.out.print("가격 : ");
		 int price= sc.nextInt();
		
		scr.set
		
	//스낵류를 입력사에요
		//스캐너로 빵 이름 맛 갯수 가격 을 받아서
		//1 지역변수 생성후 그곳에 대입.....하면 되는구나......
		// set에 받아서 저장.
		//2 세이브데이터에서 set을 불러서 그곳에서 값을 저장
		//해서 saveData에 저장
		//저장완료 되엉ㅆ습니다
		//저장한 정보를 확인하시겠습니가?
		//confirmData에로 반환해서 화면에 보여주는거같은데
		
		
		
	}
	
}
