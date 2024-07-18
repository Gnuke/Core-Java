package com.example;

import java.util.List;

public class Output {
	private List<Product> list;
	
	public Output(List<Product> list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}

	public void print() {
		// TODO Auto-generated method stub
		labelPrint();
		for(Product p : this.list ) {
			System.out.println( p ); //p.toString
		}
	}
	
	private void labelPrint() {
		System.out.println( "                   <<제품관리프로그램>>");
		System.out.println("------------------------------------------------------------");
		System.out.println("제품명\t수량\t판매단가\t매입단가\t운송료\t이익금\t이익률\t");
		System.out.println("------------------------------------------------------------");
	}

}
