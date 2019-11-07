package AutoDemo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class HttpClientGet {
    @Test
    public void gettest() throws IOException {
        //用来存放结果
        String result;
        //new一个get方法
        HttpGet get = new HttpGet("https://www.baidu.com/");
        //用来执行get方法
        HttpClient client = new DefaultHttpClient();
        //访问
        HttpResponse response = client.execute(get);
        //获取所有响应内容
        //response.getEntity();

        //转化为String格式
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
    }
}
