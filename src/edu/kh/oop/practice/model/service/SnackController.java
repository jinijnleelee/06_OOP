package edu.kh.oop.practice.model.service;

import edu.kh.oop.method.model.vo.Snack;

public class SnackController {

	private  Snack s = new Snack();
	
	public SnackController() { //기본 생성자
			
	}
	
	
	public String saveData(String kind, String name, String flavor, int numOd, int price) { 
	
		
		
		s.setFlavor(flavor);
		
		
		
		return "저장완료되었습니다";
	}
	
	
	public String confirmData() {
		//저장된 데이터를 반환함
		return "";
	}
}
