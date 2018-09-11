package org.unewe.Exercise_2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PhoneBookImplTest {

	@Test
	public void test() {
		assertEquals(new ArrayList<String>() {{add("+79873457589"); add("+79801693412"); add("+79874436622");}}, new PhoneBookImpl().getPhoneNumbersFrom("Иванов И.И."));
	}

}
