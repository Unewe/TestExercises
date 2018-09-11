package org.unewe.Exercise_2;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBookImpl implements PhoneBook {
	private HashMap<String , ArrayList<String>> book = new HashMap() {{
		put("Иванов И.И.", new ArrayList() {
			{add("+79873457589"); add("+79801693412"); add("+79874436622");}});
		put("Сидоров В.С.", new ArrayList() {
			{add("+79874458217"); add("+79801257654"); add("+79875548682");}});
		put("Петров Р.Н.", new ArrayList() {
			{add("+79878467574"); add("+79801455654"); add("+79874474568");}});
	}};
	
	public PhoneBookImpl() {
		super();
	}
	

	@Override
	public ArrayList<String> getPhoneNumbersFrom(String name) {	
		return this.book.get(name);
	}
}
