import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new ChromeDriver();    //Chrome浏览器
//        WebDriver driver = new FirefoxDriver();   //Firefox浏览器
//        WebDriver driver = new EdgeDriver();      //Edge浏览器
//        WebDriver driver = new InternetExplorerDriver();  // Internet Explorer浏览器
//        WebDriver driver = new OperaDriver();     //Opera浏览器
//        WebDriver driver = new PhantomJSDriver();   //PhantomJS
//        driver.get("http://www.itest.info");
//        findElement(By.id());
//        findElement(By.name());
//        findElement(By.className());
//        findElement(By.tagName());
//        findElement(By.linkText());
//        findElement(By.partialLinkText());
//        findElement(By.xpath());
//        findElement(By.cssSelector());

//        driver.findElement(By.id("kw"));
//        driver.findElement(By.name("wd"));
//        driver.findElement(By.className("s_ipt"));
//        driver.findElement(By.tagName("input"));
//        driver.findElement(By.xpath("//*[@id='kw']"));
//        driver.findElement(By.xpath("//*[@name='wd']"));
//        driver.findElement(By.xpath("//input[@class='s_ipt']"));
//        driver.findElement(By.xpath("/html/body/form/span/input"));
//        driver.findElement(By.xpath("//span[@class='soutu-btn']/input"));
//        driver.findElement(By.xpath("//form[@id='form']/span/input"));
//        driver.findElement(By.xpath("//input[@id='kw' and @name='wd']"));
//        driver.findElement(By.cssSelector("#kw");
//        driver.findElement(By.cssSelector("[name=wd]");
//        driver.findElement(By.cssSelector(".s_ipt");
//        driver.findElement(By.cssSelector("html > body > form > span > input");
//        driver.findElement(By.cssSelector("span.soutu-btn> input#kw");
//        driver.findElement(By.cssSelector("form#form > span > input");
//        driver.findElement(By.linkText("新闻");
//        driver.findElement(By.linkText("hao123");
//        driver.findElement(By.partialLinkText("新");
//        driver.findElement(By.partialLinkText("hao");
//        driver.findElement(By.partialLinkText("123");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.get("https://www.baidu.cn");
        driver.manage().window().setSize(new Dimension(480, 800));
        Thread.sleep(5000);
        driver.quit();





    }
}
