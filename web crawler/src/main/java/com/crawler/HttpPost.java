package com.crawler;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @author wq
 * @since 2021-11-01 9:45
 */

public class HttpPost {
    public static void main(String[] args) {
        //1，打开浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //2,输入网址
        org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost("http://www.baidu.com");

        CloseableHttpResponse response = null;
        try {
            //3,回车，发起请求，接收响应
            response = httpClient.execute(httpPost);

            //4，解析响应，返回响应
            //判断状态码是否为200
            if(response.getStatusLine().getStatusCode() == 200){
                String content = EntityUtils.toString(response.getEntity(), "utf8");
                System.out.println(content.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //释放资源，此处不能直接使用close,必须 response 变量声明下
            try {
                //释放资源 response
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                //释放资源 httpClient
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
