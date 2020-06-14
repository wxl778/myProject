package com.dreamer.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tools {
    private static Logger logger = LoggerFactory.getLogger(Tools.class);

    /*
    md5
     */
    public static String md5(String str) {
        String newStr = "";
        try {
            newStr = new BASE64Encoder().encode(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
            return newStr;
        } catch (NoSuchAlgorithmException |UnsupportedEncodingException e) {

            logger.warn("md5加密失败:" + str, e);

        }
        return newStr;
    }

    /*
    随机uuid
     */
    public static String uuid() {

        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /*
    object->json
     */
    public String toJsonString(Object object) {
        try {

            return new ObjectMapper().writeValueAsString(object);
        } catch (IOException e) {
            logger.warn("write to json string error:" + object, e);
            return null;
        }
    }
}
