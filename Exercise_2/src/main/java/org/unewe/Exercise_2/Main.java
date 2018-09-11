package org.unewe.Exercise_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String fio;
		if(args.length < 2) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Введите ФИО пользователя (формат: Иванов И.И.): ");
			fio = sc.nextLine();
		} else {
			fio = args[0] + " " + args[1];
		}
		
		PhoneBook phoneBook = new PhoneBookImpl();
		ArrayList<String> list = phoneBook.getPhoneNumbersFrom(fio);
		try {
			for(int i = 0; i < list.size(); i++) {
				System.out.println((i + 1) + ". " + list.get(i));
			}
		} catch(NullPointerException e) {
			System.err.println("Error: Пользователь не найден");
		}
	}
}
