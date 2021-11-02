package com.crawler;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @author wq
 * @since 2021-11-02 12:38
 */

public class HttpClientPoolTest {
    public static void main(String[] args) {
        //创建连接池管理器
        PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
        //设置最大连接数
        cm.setMaxTotal(100);
        //设置每个主机的最大连接数
        cm.setDefaultMaxPerRoute(10);
        doGet(cm);
        doGet(cm);
    }

    public static void doGet(PoolingHttpClientConnectionManager cm) {
        //不是每次获取HttpClient,而是从连接池中获取 HttpClient对象
        CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(cm).build();
        HttpGet httpGet = new HttpGet("https://www.baidu.com");
        CloseableHttpResponse response = null;
        try {
            //3,使用httpClient发起请求，接收响应
            response = httpClient.execute(httpGet);

            //4，解析响应，返回响应
            //判断状态码是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                String content = EntityUtils.toString(response.getEntity(), "utf8");
                System.out.println(content.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(response != null){
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //释放资源，此处不能直接使用close,必须 response 变量声明下
                //用连接池，是不释放资源 response
                //response.close();
                //释放资源 httpClient
                //httpClient.close();


        }

    }

}