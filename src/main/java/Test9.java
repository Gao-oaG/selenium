import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blog.csdn.net/qq_22003641/article/details/79137327?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522165029049716782248598150%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=165029049716782248598150&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~baidu_landing_v2~default-4-79137327.142^v9^control,157^v4^control&utm_term=selenium+java&spm=1018.2226.3001.4187");
//       （十一）设置元素等待
    }
}
