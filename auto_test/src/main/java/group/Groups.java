package group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groups {
    @Test(groups = "client")
    public void Gourps1(){
        System.out.println("这是客户端组1");
    }
    @Test(groups = "client")
    public void Gourps2(){
        System.out.println("这是客户端组1");
    }
    @Test(groups = "client")
    public void Gourps3(){
        System.out.println("这是客户端组1");
    }

    @Test(groups = "server")
    public void Gourps4(){
        System.out.println("这是服务端组1");
    }
    @Test(groups = "server")
    public void Gourps5(){
        System.out.println("这是服务端组2");
    }

    @BeforeGroups(groups = "client")
    public void BeforeGroups(){
        System.out.println("这是客户端组运行之前运行的");
    }
    @AfterGroups(groups = "client")
    public void AfterGroups(){
        System.out.println("这是客户端组运行之后运行的");
    }
    @BeforeGroups(groups = "server")
    public void BeforeGroups1(){
        System.out.println("这是服务端组运行之前运行的");
    }
    @AfterGroups(groups = "server")
    public void AfterGroups1(){
        System.out.println("这是服务端组运行之后运行的");
    }
}
