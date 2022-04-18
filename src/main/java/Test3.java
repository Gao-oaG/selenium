import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.baidu.com/");

        WebElement search_text = driver.findElement(By.id("kw"));

        WebElement search_button = driver.findElement(By.id("su"));

        Thread.sleep(2000);

        search_text.sendKeys("Java");

        Thread.sleep(2000);

        //        clear()方法用于清除文本输入框中的内容。

        search_text.clear();

        Thread.sleep(2000);

//        sendKeys()方法模拟键盘向输入框里输入内容。 但是它的作用不仅于此， 我们还可以用它发送键盘按键， 甚至用它来指定上传的文件。

        search_text.sendKeys("Selenium");

//        click()方法可以用来单击一个元素，前提是它是可以被单击的对象，它与 sendKeys()方法是Web页面操作中最常用到的两个方法。 其实click()方法不仅仅用于单击一个按钮，它还可以单击任何可以单击的文字/图片链接、复选框、单选框、下拉框等。

//        search_button.click();

        Thread.sleep(2000);

        search_text.clear();

        search_text.sendKeys("nihao");

//        submit()方法用于提交表单。 例如，在搜索框输入关键字之后的“回车” 操作， 就可以通过 submit()方法模拟.

        search_text.submit();

        Thread.sleep(2000);

        driver.quit();


    }
}
