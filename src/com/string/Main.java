package com.string;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Istrue istrue = new Istrue();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the following string");
		System.out.println("\n Hey its me");
		
		String string = scan.nextLine();
		
		System.out.println(istrue.check("Hey its me"));
		
		
		
		

	}

}
