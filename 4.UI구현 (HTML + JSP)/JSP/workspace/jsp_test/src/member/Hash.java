package member;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {

	public static String getHash(String pw) {
		
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-512");
			md.reset();
			md.update(pw.getBytes("UTF-8"));
			String ret = String.format("%0128x", new BigInteger(1, md.digest()));
			
			return ret;
			
		} catch (NoSuchAlgorithmException e) {
			System.out.println("알고리즘이 잘못 되었음 : " + e);
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩이 잘못 되었음 : " + e);
			e.printStackTrace();
		}
		return null;
	}
}
