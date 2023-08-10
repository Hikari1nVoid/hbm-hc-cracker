import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.lang.String;

public class Crackmethod{
public String smoosh(String s1, String s2, String s3, String s4) {
		
		Random rand = new Random();
		String s = "";

		byte[] b1 = s1.getBytes();
		byte[] b2 = s2.getBytes();
		byte[] b3 = s3.getBytes();
		byte[] b4 = s4.getBytes();
		
		if(b1.length == 0 || b2.length == 0 || b3.length == 0 || b4.length == 0)
			return "";
		
		s += s1;
		rand.setSeed(b1[0]);
		s += rand.nextInt(0xffffff);
		
		s += s2;
		rand.setSeed(rand.nextInt(0xffffff) + b2[0]);
		rand.setSeed(b2[0]);
		s += rand.nextInt(0xffffff);
		
		s += s3;
		rand.setSeed(rand.nextInt(0xffffff) + b3[0]);
		rand.setSeed(b3[0]);
		s += rand.nextInt(0xffffff);
		
		s += s4;
		rand.setSeed(rand.nextInt(0xffffff) + b4[0]);
		rand.setSeed(b4[0]);
		s += rand.nextInt(0xffffff);
		
		//System.out.println(s);
		
		return getHash(s);
	}
	
	public String getHash(String inp) {
		
		try {
			MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
			byte[] bytes = sha256.digest(inp.getBytes());
			String str = "";
			
		    for(int b : bytes)
		      str = str + Integer.toString((b & 0xFF) + 256, 16).substring(1);
	    
		    return str;
		    
		} catch (NoSuchAlgorithmException e) { }
		
		return "";
	}
}