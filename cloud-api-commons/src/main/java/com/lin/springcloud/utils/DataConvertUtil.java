package com.lin.springcloud.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataConvertUtil {

    /**
     * InputStream转为byte[]
     * @param inputStream
     * @return
     */
    public static byte[] inputStream2Bytes(InputStream inputStream)
    {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        try
        {
            while ((len = inputStream.read(buffer)) != -1)
            {
                outStream.write(buffer, 0, len);
            }
            outStream.close();
            inputStream.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return outStream.toByteArray();
    }


    /**
     * InputStream转String
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static String inputStream2String(InputStream inputStream) throws IOException
    {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buffer = new byte[2048];
        int length = 0;
        while ((length = inputStream.read(buffer)) != -1)
        {
            bos.write(buffer, 0, length);//写入输出流
        }
        inputStream.close();//读取完毕，关闭输入流

        return new String(bos.toByteArray(), "UTF-8");
    }


    /**
     * String转为InputStream
     * @param str
     * @return
     */
    public static InputStream string2InputStream(String str)
    {
        InputStream inputStream = new ByteArrayInputStream(str.getBytes());
        return inputStream;
    }


    /**
     * byte[]转为16进制的字符串
     * @param src
     * @return
     */
    public static String bytes2HexString(byte[] src)
    {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0)
        {
            return null;
        }
        for (int i = 0; i < src.length; i++)
        {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2)
            {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }


    /**
     * 16进制字符串转为byte[]
     * @param s
     * @return
     */
    public static byte[] hexString2Bytes(String s)
    {
        int len = s.length();
        byte[] d = new byte[len / 2];
        for (int i = 0; i < len; i += 2)
        {
            // 两位一组，表示一个字节,把这样表示的16进制字符串，还原成一个进制字节
            d[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character
                    .digit(s.charAt(i + 1), 16));
        }
        return d;
    }




}
