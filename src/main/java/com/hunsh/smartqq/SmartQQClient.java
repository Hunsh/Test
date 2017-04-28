package com.hunsh.smartqq;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;

/**
 * @Author : Edward Jia
 * @Description :
 * @Date : 17/4/20
 * @Version :
 */
public class SmartQQClient {

    @Test
    public void test1 () throws Exception{
        //URI uri = new URI(Constants.VERIFY_URL);
        URI uri = new URI("http://www.baidu.com");

        URL url = uri.toURL();

        InputStream input = url.openStream();
        OutputStream output  = new ByteArrayOutputStream();

        int i = 0;
        byte[] bytes = new byte[1024];
        int length = -1;
        while( (length = input.read(bytes)) != -1){
            output.write(bytes, 0, length);
        }

        System.out.println(new String(bytes));
    }
}
