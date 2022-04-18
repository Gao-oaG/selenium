import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");

        System.out.println("Search before================");

        //获取当前的 title 和 url
        System.out.printf("title of current page is %s\n", driver.getTitle());
        System.out.printf("url of current page is %s\n", driver.getCurrentUrl());
        Thread.sleep(10000);
        //百度搜索
        WebElement search = driver.findElement(By.id("kw"));
        search.sendKeys("Selenium");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(10000);

        System.out.println("Search after================");

        //获取当前的 title 和 url
        System.out.printf("title of current page is %s\n", driver.getTitle());
        System.out.printf("url of current page is %s\n", driver.getCurrentUrl());

        //获取第一条搜索结果的标题
        WebElement result = driver.findElement(By.xpath("//*[@id=\"3001\"]/div/div/div/div[1]/h3/div/a"));
        System.out.println(result.getText());

        driver.quit();


    }
}
