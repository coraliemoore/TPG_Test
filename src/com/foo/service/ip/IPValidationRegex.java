package com.foo.service.ip;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class IPValidationRegex {

	private static final String IPADDRESS_PATTERN =
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	
	private static final String INPUT_FILE = "resources/ipAddresses.txt";
	
	private static final String OUTPUT_FILE = "resources/ipAddressesOutput.txt";
	
	public static void main(String[] args) {	
		
		Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(INPUT_FILE)));
	
			StringBuffer outputString = new StringBuffer();
			String strLine;
	
			//read file line by line
			while ((strLine = br.readLine()) != null)   {
				if(pattern.matcher(strLine).matches()){
					//if valid add to ouput
					outputString.append(strLine+ "\n");
				}
			}	
		
			//write output to new file
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(OUTPUT_FILE)));
	    	bos.write(outputString.toString().getBytes());
			
	    	//close input/output streams
	    	br.close();
	    	bos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
