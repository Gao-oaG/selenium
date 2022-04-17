import org.openqa.selenium.chrome.ChromeDriver;

public class sss {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //窗口最大化
        driver.manage().window().maximize();
        //打开网站
        driver.get("https://www.baidu.com");
//        //用ID定位输入框
//        WebElement id = driver.findElement(By.id("kw"));
//        //输入Python
//        id.sendKeys("python");
//        //用ID定位
//        WebElement ById = driver.findElementById("su");
//        //点击百度一下
//        ById.click();
//        //用name定位输入框
//        WebElement Name = driver.findElementByName("wd");
//        //输入奇艺科技
//        Name.sendKeys("你好呀");
//        //强制等待
//        Thread.sleep(1000);
//        //用class定位元素
//        driver.findElementByClassName("s_btn").click();
//        Thread.sleep(6000);
//        //关闭网页
//        driver.close();

    }
}
