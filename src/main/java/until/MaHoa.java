package until;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Properties;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class MaHoa {
	
	public static String encrypt(String input, String myKey) {
	      try {
	            MessageDigest sha = MessageDigest.getInstance("SHA-1");
	            byte[] key = myKey.getBytes("UTF-8");
	            key = sha.digest(key);
	            key = Arrays.copyOf(key, 16);
	            SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
	            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
	            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	            return Base64.getEncoder().encodeToString(cipher.doFinal(input.getBytes("UTF-8")));
	      } catch (Exception e) {
	            System.out.println(e.toString());
	      }
	      return null;
	}
	
	public static String decrypt(String output, String myKey) {
	      try {
	            MessageDigest sha = MessageDigest.getInstance("SHA-1");
	            byte[] key = myKey.getBytes("UTF-8");
	            key = sha.digest(key);
	            key = Arrays.copyOf(key, 16);
	            SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
	            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
	            cipher.init(Cipher.DECRYPT_MODE, secretKey);
	            return new String(cipher.doFinal(Base64.getDecoder().decode(output)));
	      } catch (Exception e) {
	            System.out.println(e.toString());
	      }
	      return null;
	}
}
