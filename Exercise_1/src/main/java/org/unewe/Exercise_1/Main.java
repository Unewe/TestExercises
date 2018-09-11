package org.unewe.Exercise_1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		if(args.length == 2) {
			for(String s : IpWriter.write(args)) {
				System.out.println(s);
			}
		} else {
			
			String[] newArgs = new String[2];
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Введите наименьший ip фдрес (формат: 192.168.1.2): ");
			newArgs[0] = sc.nextLine();
			System.out.print("Введите наибольший ip фдрес (формат: 192.168.1.5): ");
			newArgs[1] = sc.nextLine();
			
			System.out.println();
			for(String s : IpWriter.write(newArgs)) {
				System.out.println(s);
			}
		}	
	}
}
