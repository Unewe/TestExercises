package org.unewe.Exercise_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBookImpl();
		
		System.out.println("Введите ФИО формата: Иванов.И.И");
		ArrayList<String> list = phoneBook.getPhoneNumbersFrom(
								new Scanner(System.in).nextLine());
	
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				System.out.println((i + 1) + ". " + list.get(i));
			}
		} else {
			System.err.println("Пользователь не найден.");
		}
	}
}
