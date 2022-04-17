import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windos {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //窗口最大化
        driver.manage().window().maximize();
        //打开网站
        driver.get("https://www.baidu.com");
        String baiduHandle = driver.getWindowHandle();
        //点击12306网站
        driver.findElementByXPath("//*[@id='1']/h3/a[1]").click();

        //从所有窗口中判断是否第一个窗口，如果不是第一个进行窗口切换
        Set<String> windowHandles = driver.getWindowHandles();
        for(String string : windowHandles){
            System.out.println(string);
            if(string!=baiduHandle){
                //进行窗口切换
                driver.switchTo().window(string);
            }
        }

    }
}
