
package com.helloOne.sys.utils;

import java.security.MessageDigest;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

public class NumberUtil {

	public static String md5(String src) throws Exception {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] output = md.digest(src.getBytes());
		String s = Base64.encodeBase64String(output);
		return s;

	}

	public static String createUuid() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}

	public static Long createId() {
		Random rand = new Random();
		Long id = Long.valueOf(rand.nextInt(1000000000));
		return id;
	}

}
