package org.hafsa.Keccak;

import java.security.MessageDigest;
import org.bouncycastle.jcajce.provider.digest.SHA3.DigestSHA3;
import org.bouncycastle.jcajce.provider.digest.SHA3.Digest256;
public class Keccak {
	 public static void main(String[] args) {
	        System.out.println(sha3("123456"));
	    }

	    public static String sha3(final String input) {
	        final DigestSHA3 sha3 = new Digest256();

	        sha3.update(input.getBytes());

	        return Keccak.hashToString(sha3);
	    }

	    public static String hashToString(MessageDigest hash) {
	        return hashToString(hash.digest());
	    }

	    public static String hashToString(byte[] hash) {
	        StringBuffer buff = new StringBuffer();

	        for (byte b : hash) {
	            buff.append(String.format("%02x", b & 0xFF));
	        }

	        return buff.toString();
	    }
}
