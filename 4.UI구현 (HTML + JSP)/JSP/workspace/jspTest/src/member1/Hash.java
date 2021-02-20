package member1;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {

	public static String getHash(String pw) {
		
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");	
			md.reset();
			md.update(pw.getBytes("UTF-8"));
			String ret = String.format("%0128x", new BigInteger(1, md.digest()));
			return ret;
			
		} catch (NoSuchAlgorithmException e) {
			System.out.println("그런 알고리즘은 없습니다 : " + e);
		} catch (UnsupportedEncodingException e) {
			System.out.println("그런 인코딩은 없습니다 : " + e);
		}
		
		return null;
	}
	
}
