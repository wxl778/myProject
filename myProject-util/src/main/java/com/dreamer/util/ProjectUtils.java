package com.dreamer.util;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class ProjectUtils {

    public static void main(String[] args) {
        System.out.println(uuid());
    }
    /*
    md5加密
     */
    public static String md5(String str) {
        String newStr;
        try {
            newStr = new BASE64Encoder().encode(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
            return newStr;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("MD5加密失败");
        }
        return str;
    }


    /*
    生成uuid
     */
    public static String uuid(){
        String id= UUID.randomUUID().toString().replace("-","");
        return id;
    }
}
