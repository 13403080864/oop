package jsoup;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author wq
 * @since 2021-11-04 13:32
 */

public class JsoupFirstTest {
    @Test
    public void testUrl() throws Exception {
        //解析Url地址，第一个参数是访问地址，第二个是超时时间
        Document doc = Jsoup.parse(new URL("http://xiaoshancs.995120.cn/smws/login"), 2000);

        //使用标签选择器，获取内容
        String title = doc.getElementsByTag("title").first().text();
        System.out.println(title); //慢病远程监测系统管理平台
    }

    @Test
    public void testString() throws IOException {
        //使用工具类读取文件，这里用的就是 commons_io里的FileUtils读取文件
        String string = FileUtils.readFileToString(new File("C:\\Users\\HWINWQ\\Desktop\\1.html"), "utf8");

        //用jsoup解析字符串
        Document doc = Jsoup.parse(string);
        String title = doc.getElementsByTag("title").first().text();
        System.out.println(title);  //慢病远程监测系统管理平台
    }

    @Test
    public void testFile() throws IOException {
        //Jsop解析文件
        Document doc = Jsoup.parse(new File("F:\\project\\oop\\1.html"),"utf8");

        //通过标签获取内容
        String title = doc.getElementsByTag("title").first().text();
        System.out.println(title);
    }

    @Test
    public void testDOM() throws IOException {
        //Jsop解析文件，获取doc
        Document doc = Jsoup.parse(new File("F:\\project\\oop\\1.html"), "utf8");

        //获取元素，根据id获取元素，用getElementById()
        Element element = doc.getElementById("loginForm").firstElementSibling();

        //根据标签获取元素 getElementsByTag,一共有两个，获取两个
        String element1 = doc.getElementsByTag("span").text();//获取的内容
//        Elements element1 = doc.getElementsByTag("link").first();  //获取第一个

        //根据class获取元素
        String element2 = doc.getElementsByClass("login-input").text();

        //根据属性获取元素键获取值
        Elements element3 = doc.getElementsByAttribute("href");
        //当结果 根据属性 键值获取元素
        String element4 = doc.getElementsByAttributeValue("style", "position: absolute;bottom: 20px;left: 250px;").text();
        System.out.println(element2);

    }


    @Test
    //获取元素的数据
    public void testData() throws Exception {
      //1,获取doc 对象，用Jsoup解析文件
        Document doc = Jsoup.parse(new File("F:\\project\\oop\\1.html"), "utf8");

        //现获取元素，多种方法（此处根据id获取元素）
        Element element = doc.getElementById("loginForm");
        Elements aClass = doc.getElementsByClass("login-input");
        System.out.println(aClass);
        //从元素中获取id
        String str = element.id();   //loginForm


    }

    @Test
    public void testSelector(){

    }
}









