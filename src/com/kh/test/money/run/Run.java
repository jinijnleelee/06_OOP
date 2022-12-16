package com.kh.test.money.run;

import com.kh.test.money.model.vo.Money;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//money에 10000원
//기본생성자를 만들어서 
//setter을 이용해서
//출력값에 10000원 
		
		
		Money m = new Money(10000);
		
	
		System.out.println(m.getMoney()+ m.UNIT());
		
		
		
		
	}

}
