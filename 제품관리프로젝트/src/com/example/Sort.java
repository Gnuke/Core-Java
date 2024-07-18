package com.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

	private List<Product> list;
	
	public Sort(List<Product> list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}

	public void quickSort() {
		// TODO Auto-generated method stub
		Collections.sort( this.list , new Comparator<Product>() {

			@Override
			public int compare(Product front, Product back) {
				// TODO Auto-generated method stub
				return back.getBenefit() - front.getBenefit(); // 내림차순 정렬
			}
			
		} );
	}
	
}
