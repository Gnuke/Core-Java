package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {
	private List<Product> list;
	private Scanner sc;
	private File file;
	
	public Input(List<Product> list) {
		// TODO Auto-generated constructor stub
		this.list = list;
		this.file = new File( "./productdata.txt" );
		try {
			this.sc = new Scanner(this.file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println( "파일을 찾을 수 없습니다" );
			System.exit(0);
		}
	}

	public void fileInput() {
		// TODO Auto-generated method stub
		while( this.sc.hasNextLine()) {
			String line = this.sc.nextLine(); // NOTEBOOK		36000	5000		4700		2000 ...
			//System.out.println( line );
			/*
			 * Parsing
			 * 1.String's split()
			 * 2.Scanner's useDelemeter()
			 * 3. StringTokenizer
			 * */
			Scanner scLine = new Scanner(line).useDelimiter( "\\s+" );
			Product p = new Product(scLine.next(), scLine.nextInt(), scLine.nextInt(),
					scLine.nextInt(), scLine.nextInt() );
			this.list.add(p);
		}
		//System.exit(0);
	}

}
