package org.unewe.Exercise_1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InetAddress ipLow = null, ipHigh = null;
		try {
			System.out.print("Введите наименьший ip фдрес (например: 192.168.1.2): ");
			ipLow = InetAddress.getByName(sc.nextLine());
		
			System.out.print("Введите наибольший ip фдрес (например: 192.168.1.5): ");
			ipHigh = InetAddress.getByName(sc.nextLine());
			sc.close();
		} catch(UnknownHostException e) {
			System.err.println("Адреса введены неверно.");
			System.exit(0);
		}
		
		
		for(String s : IpWriter.write(ipLow, ipHigh)) {
			System.out.println(s);
		}
	}
}
