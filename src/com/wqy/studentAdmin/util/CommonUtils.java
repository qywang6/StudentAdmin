package com.wqy.studentAdmin.util;

import java.util.Scanner;

public class CommonUtils {
	private static Scanner scanner;

	public static Scanner getScanner() {
		if(scanner==null){
			scanner = new Scanner(System.in);
		}
		return scanner;
	}

//	public void setScanner(Scanner scanner) {
//		this.scanner = scanner;
//	}
}
