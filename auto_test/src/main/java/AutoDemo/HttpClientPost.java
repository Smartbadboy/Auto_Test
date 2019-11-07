package AutoDemo;

import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HttpClientPost {
    public void http_post(){
        //创建一个客户对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //新建一个HttpPost请求对象，并将url传递给这个对象
        HttpPost post = new HttpPost("https://mapi.test.bestpay.net/mapi/getMiniProgram");
        //使用NameValuePair 键值对 对参数进行打包
        List<NameValuePair> list = new ArrayList<NameValuePair>();
        list.add(new BasicNameValuePair("productNo","15773228166"));
        list.add(new BasicNameValuePair("appVersion","9.8.0"));
        list.add(new BasicNameValuePair("systemType","ios"));
        list.add(new BasicNameValuePair("appVersion","02"));
        //对打包好的参数，使用UrlEncodeFormEntity工具类生成实体的类型数据
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list, Consts.UTF_8);
        //将含有请求参数的实体对象放到post请求中
        post.setEntity(entity);
        //新建一个响应对象来接受客户端执行post的结果
        try {
            CloseableHttpResponse response = httpClient.execute(post);
            if(response.getStatusLine().getStatusCode() ==200){
                System.out.println(EntityUtils.toString(response.getEntity()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //从响应对象中提取需要的结果 -->实际结果与预期结果进行对比

        }
    }


