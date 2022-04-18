import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
//        contextClick() 右击
//        clickAndHold() 鼠标点击并控制
//        doubleClick() 双击
//        dragAndDrop() 拖动
//        release() 释放鼠标
//        perform() 执行所有Actions中存储的行为
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        driver.manage().window().maximize();

        WebElement search_setting = driver.findElement(By.xpath("//*[@id=\"s-usersetting-top\"]"));
        Actions action = new Actions(driver);
        action.clickAndHold(search_setting).perform();
        Thread.sleep(2000);

        driver.quit();


    }
}
