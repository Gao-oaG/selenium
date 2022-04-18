import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.baidu.com");
        Actions action = new Actions(driver);
        // 鼠标右键点击指定的元素
//        action.contextClick(driver.findElement(By.xpath("//*[@id=\"hotsearch-content-wrapper\"]/li[1]/a/span[2]"))).perform();

        driver.navigate().refresh();

        // 鼠标拖拽动作， 将 source 元素拖放到 target 元素的位置。
        WebElement source = driver.findElement(By.xpath("//*[@id=\"hotsearch-content-wrapper\"]/li[1]/a/span[2]"));
        WebElement target = driver.findElement(By.id("kw"));
        action.dragAndDrop(source,target).perform();

        // 释放鼠标
        action.release().perform();
    }
}
