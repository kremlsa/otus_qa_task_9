import config.ServerConfig;
import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;
    protected final Logger logger = LogManager.getLogger(Task11Test.class);
    protected final ServerConfig cfg = ConfigFactory.create(ServerConfig.class);

    @BeforeTest
    public void Setup() {

        //Создаём вебдрайвер через статический метод класса WebDriverFactory
        driver = WebDriverInit.initDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @AfterTest
    public void setDown() {
        if (driver != null) {
            driver.close();
            logger.info("Shutdown WebDriver");
        } else {
            logger.error("Error WebDriver not found");
        }
    }

    public void openPage(String url) {
        driver.get(url);
    }

    //Вспомогательный метод для закрытия всплывающих окон, если они появятся
    public void confirmPopUpIfExists(By selector) {
        try {
            driver.findElement(selector).click();
        } catch (WebDriverException we) {
            //do nothing
        }
    }

    //Вспомогательный метод для клика по элементу
    public void clickByElement(By selector) {
        driver.findElement(selector).click();
    }

    //Вспомогательный метод для поиска элемента
    public WebElement findElement(By selector) {
        return driver.findElement(selector);
    }

}
