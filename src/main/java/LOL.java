import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LOL {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //窗口最大化
        driver.manage().window().maximize();
        //添加隐式等待时间
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //打开百度网页
        driver.get("https://www.baidu.com");
        //用ID定位输入框
        WebElement id = driver.findElement(By.id("kw"));
        Thread.sleep(4000);
        //输入12306
        id.sendKeys("英雄联盟");
        //用ID定位
        WebElement ById = driver.findElementById("su");
        Thread.sleep(5000);
        //点击百度一下
        ById.click();


        //获取百度窗口手柄
//        String baiduHandle = driver.getWindowHandle();
        driver.findElementByXPath("//*[@id=\"1\"]/div/div[1]/h3/a[1]").click();
        //点击12306网站
//        driver.findElementByXPath("//*[@id='1']/h3/a[1]").click();
//        driver.findElementByLinkText("中国铁路12306").click();
//
//        //从所有窗口中判断是否第一个窗口，如果不是第一个进行窗口切换
//        Set<String> windowHandles = driver.getWindowHandles();
//        for(String string : windowHandles){
//            System.out.println(string);
//            if(string!=baiduHandle){
//                //进行窗口切换
//                driver.switchTo().window(string);
//            }
//        }



//        //注册超链接
//        driver.findElementByLinkText("注册").click();
//        //定位用户名
//        WebElement yonghu = driver.findElementById("userName");
//        yonghu.sendKeys("dawdadasdfvgbhnfdasfasflasfaf");
//        //定位密码
//        WebElement mima = driver.findElementById("passWord");
//        mima.sendKeys("wei8520");
//        //等位确定密码
//        WebElement quren = driver.findElementById("confirmPassWord");
//        quren.sendKeys("wei8520");
//        //强制等待
//        Thread.sleep(3000);
//        //定位下拉框
//        WebElement xiala = driver.findElementById("cardType");
//        Select select = new Select(xiala);
//        select.selectByIndex(3);
//        Thread.sleep(1000);
//        select.selectByValue("C");
//        Thread.sleep(1000);
//        select.selectByVisibleText("中国居民身份证");
//        //定位姓名
//        WebElement xingming = driver.findElementByName("loginUserDTO.name");
//        xingming.sendKeys("郑杰武");
//        //定位身份证号
//        WebElement shenfen = driver.findElementById("cardCode");
//        shenfen.sendKeys("440582198712141558");
//        //定位邮箱
//        WebElement youxiang = driver.findElementById("email");
//        youxiang.sendKeys("329625679@qq.com");
//        //定位手机号
//        WebElement shouji = driver.findElementByName("userDTO.mobile_no");
//        shouji.sendKeys("18569942232");
//        //定位方框
//        driver.findElementById("checkAgree").click();
//        //定位下一步
//        driver.findElementById("nextBtn").click();
//        //获取文本
//        WebElement wenben = driver.findElementById("content_defaultwarningAlert_hearder");
//        String text = wenben.getText();
//        System.out.println("----------"+text);
//        //断言
////        Assert.assertEquals("该证件号码已被注册。请确认是否您本人注册，\"是\"请使用原账号登录，\"不是\"请通过铁路12306App办理抢注或持该证件原件到就近的办理客运业务的铁路车站办理被抢注处理，完成后即可继续注册，或致电12306客服咨询。", text);
//        //点击确定
//        driver.findElementById("qd_closeDefaultWarningWindowDialog_id").click();
//
//        //关闭网页
//        driver.close();
    }
}
