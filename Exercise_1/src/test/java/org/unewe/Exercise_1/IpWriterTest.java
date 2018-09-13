package org.unewe.Exercise_1;

import static org.junit.Assert.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedList;
import org.junit.Test;

public class IpWriterTest {

	@Test
	public void testWrite() throws UnknownHostException {
		assertEquals(new LinkedList<String>(){{add("192.168.1.4");add("192.168.1.5");add("192.168.1.6");}},
					IpWriter.write(InetAddress.getByName("192.168.1.3"), InetAddress.getByName("192.168.1.7")));
	}

}
