package org.unewe.Exercise_1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class IpWriterTest extends junit.framework.Assert {

	@Test
	public void testWrite() {
		assertEquals(new ArrayList<String>(){{add("192.168.0.2");add("192.168.0.3");add("192.168.0.4");}}, IpWriter.write(new String[] {"192.168.0.1", "192.168.0.5"}));
	}

}
