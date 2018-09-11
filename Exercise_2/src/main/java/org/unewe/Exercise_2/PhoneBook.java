package org.unewe.Exercise_2;

import java.util.ArrayList;

public interface PhoneBook {
	/**
	 * Gets all phone numbers of this contact
	 * @param name				contact name, for example "Иванов И.И."
	 * 
	 * @return					ArrayList<String> of phone numbers
	 */
	public ArrayList<String> getPhoneNumbersFrom(String name);
}
