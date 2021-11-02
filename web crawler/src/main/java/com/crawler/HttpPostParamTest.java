package com.crawler;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wq
 * @since 2021-11-01 12:29
 * 带参数的 HttpPost 请求
 */

public class HttpPostParamTest {
    public static void main(String[] args) throws Exception {
        //1，打开浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //2,创建 HttpPost 设置url地址  地址：https://www.baidu.com/?tn=78000241_9_hao_pg
        HttpPost httpPost = new HttpPost("https://www.baidu.com/?");

        //3，声明List集合，封装表单中的参数
        //设置地址 https://www.baidu.com/?tn=78000241_9_hao_pg
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("tn","78000241_9_hao_pg"));

        //创建表单Entity的对象，第一个参数是封装好的表单数据，第二个参数是编码
        UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params,"utf8");

        //设置表单的Entity 对象 到post请求中
        httpPost.setEntity(formEntity);

        CloseableHttpResponse response = null;
        try {
            //3,使用httpClient发起请求，接收响应
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

