package com.golflearn.utility;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
	public static String encryptSHA256(String value) throws NoSuchAlgorithmException {
		StringBuffer encryptData = new StringBuffer();
		MessageDigest sha = MessageDigest.getInstance("SHA-256");

		sha.update(value.getBytes());

		byte[] digest = sha.digest();

		for (int i = 0; i < digest.length; i++) {
			System.out.println(digest[i]);
			encryptData.append(String.format("%02x", digest[i] & 0xFF));
		}

		return encryptData.toString();
	}

	/**
     * SHA-256 암호화 함
     * @param source 원본
     * @param salt SALT 값
     * @return
     */
    public static String encryptSHA256(String value, String salt) throws NoSuchAlgorithmException {
    	StringBuffer encryptData = new StringBuffer();
		MessageDigest sha = MessageDigest.getInstance("SHA-256");
		sha.update(salt.getBytes());
		sha.update(value.getBytes());

		byte[] digest = sha.digest();

		for (int i = 0; i < digest.length; i++) {
			encryptData.append(String.format("%02x", digest[i] & 0xFF));
		}

		return encryptData.toString();
    }

}