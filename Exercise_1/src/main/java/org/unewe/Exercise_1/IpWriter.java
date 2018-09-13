package org.unewe.Exercise_1;

import java.net.InetAddress;
import java.util.LinkedList;

public class IpWriter 
{
	//Returns the linked list of strings(ip)  between low and high ip's
	public static LinkedList<String> write(InetAddress low, InetAddress high) {
		
		byte[] ipLow = low.getAddress();
		byte[] ipHigh = high.getAddress();
		
		long ipLowLong = ipToLong(ipLow);
		long ipHighLong = ipToLong(ipHigh);
		
		LinkedList<String> result = new LinkedList<String>();
		
		for(long l = ipLowLong + 1; l < ipHighLong; l++) {
			result.add(IpWriter.ipToString(l));
		}
        return result;
    }
	
	//convert byte array to long value
	private static long ipToLong(byte[] ip) {
		
		long longIP = 0;
		for(byte b : ip) {
			longIP <<= 8;
			longIP |= b & 0xff;
		}
		return longIP;
	}
	
	//convert long value to string(ip)
	private static String ipToString(long l) {
		int[] ip = new int[4];
		for(int i = 3; i >= 0; i--) {
			byte b = 0;
			ip[i] = (b |= l) & 0xff;
			l >>= 8;
		}
		return ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3];
	}
}
