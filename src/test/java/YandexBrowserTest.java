import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class YandexBrowserTest {
    ChromeDriver driver;

    @Before
    public void setUp(){
        // https://github.com/yandex/YandexDriver/releases
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\yandexdriver.exe");
        driver = new ChromeDriver();
        setWebDriver(driver);
    }

    @Test
    public void logoTest() {
        open("https://practicum.yandex.ru/");
        $(".logo__img").shouldBe(visible);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}