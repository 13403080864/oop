package com.crawler;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @author wq
 * @since 2021-11-01 12:29
 * 带参数的 HttpGet 请求
 */

public class HttpGetParamTest {
    public static void main(String[] args) throws Exception {
        //1，打开浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //2,输入网址 地址：https://www.baidu.com/?tn=78000241_9_hao_pg
        //创建URIBuilder
        URIBuilder uriBuilder = new URIBuilder("https://www.baidu.com/");

        //3，设置参数
        uriBuilder.setParameter("tn", "78000241_9_hao_pg");

        //4,创建HttpGet对象，设置访问url地址
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        System.out.println("发起请求的信息: " + httpGet);
        CloseableHttpResponse response = null;
        try {
            //3,回车，发起请求，接收响应
            response = httpClient.execute(httpGet);

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

