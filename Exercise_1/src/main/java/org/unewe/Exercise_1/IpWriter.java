package org.unewe.Exercise_1;

import java.util.ArrayList;

public class IpWriter 
{
	
	public static ArrayList<String> write(String[] args)
    {
		int[] firstIP = new int[4];
		int[] secondIP = new int[4];
		ArrayList<String> result = new ArrayList<String>();
		
        fill(firstIP, args[0]);
        fill(secondIP, args[1]);
        
        //перебор всех возможный ip адресов в заданом диапазоне
       for(int a = firstIP[0]; a <= secondIP[0]; a++) {
    	   for(int b = firstIP[1]; b <= secondIP[1]; b++) {
    		   for(int c = firstIP[2]; c <= secondIP[2]; c++) {
    			   for(int d = firstIP[3] + 1; d < secondIP[3]; d++) {
    				   result.add(a + "." + b + "." + c + "." + d);
    			   }
    		   }
    	   }
        }
        
        return result;
    }
	
	
	private static void fill(int[] array, String ip) {
		ip += ".";
		int temp = -1;
		try {
			
			for(int i = 0; i < 4; i++) {
				array[i] =Integer.valueOf(ip.substring(temp + 1,temp = ip.indexOf(".", temp + 1)));
			}
		} catch(NumberFormatException e) {
			System.err.println("Введены некорректные ip адреса.");
			Main.main(new String[0] );
		}
		
	}
	
}
