package edu.kh.oop.method.model.vo;

public class Snack {

	
	
	private String kind; //종류
	private String name; //이름
	private String flavor; //맛
	private int numOd; //갯수
	private int price; //가격
	
	public Snack() {}

	public Snack(String kind, String name, String flavor, int numOd, int price) {
	
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOd = numOd;
		this.price = price;
	}
	
	
	
	
	public String getKind() {
			return kind;
		}
	
		public void setKind(String kind) {
			this.kind = kind;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public String getFlavor() {
			return flavor;
		}
	
		public void setFlavor(String flavor) {
			this.flavor = flavor;
		}
	
		public int getNumOd() {
			return numOd;
		}
	
		public void setNumOd(int numOd) {
			this.numOd = numOd;
		}
	
		public int getPrice() {
			return price;
		}
	
		public void setPrice(int price) {
			this.price = price;
		}

		
		
		
		
	public String informarion() {
		
		return "";
	}
	
	
	
}
