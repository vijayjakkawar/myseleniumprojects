package EncodeAndDecode;

import org.bouncycastle.util.encoders.Base64;

public class EncodeandDecode {

	public static void main(String[] args) {
		
		String str="vijay143";
		
		byte[] encoding=Base64.encode(str.getBytes());
	System.out.println("encoded String:"+"  "  +new String(encoding));
	
	byte[] decoding=Base64.decode(encoding);
	System.out.println("decoded String:" +"  " +new String(decoding));
		

	}

}
