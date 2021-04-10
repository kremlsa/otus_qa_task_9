import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;

/**
 * Домашнее задание №8
 * Отчётность Allure
 * Александр Кремлёв
 * 1.0
 */

@Epic("Проверяем разделы на сайте Otus.ru")
public class Task11Test extends BaseTest {

    @Test
    @Description("Проверяем раздел Программирование")
    public void progOtusTest() {
        driver.manage().window().setSize(new Dimension(1280,1024));
        openPage(cfg.urlOtus());
        clickByElement(By.xpath(cfg.buttonCourses()));
        clickByElement(By.xpath(cfg.buttonProgramming()));
        Allure.addAttachment("OSinOnComparisonPage", new ByteArrayInputStream(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES)));
        Assert.assertTrue(findElement(By.xpath(cfg.header())).getText().contains("Программирование"));
    }

    @Test
    @Description("Проверяем раздел Инфраструктура")
    public void infraOtusTest() {
        driver.manage().window().maximize();
        openPage(cfg.urlOtus());
        clickByElement(By.xpath(cfg.buttonCourses()));
        clickByElement(By.xpath(cfg.buttonInfra()));
        Allure.addAttachment("OSinOnComparisonPage", new ByteArrayInputStream(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES)));
        Assert.assertTrue(findElement(By.xpath(cfg.header())).getText().contains("Инфраструктура"));
    }

    @Test
    @Description("Проверяем раздел Информационная безопасность")
    public void ibOtusTest() {
        driver.manage().window().maximize();
        openPage(cfg.urlOtus());
        clickByElement(By.xpath(cfg.buttonCourses()));
        clickByElement(By.xpath(cfg.buttonIB()));
        Allure.addAttachment("OSinOnComparisonPage", new ByteArrayInputStream(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES)));
        Assert.assertTrue(findElement(By.xpath(cfg.header())).getText().contains("Информационная безопасность"));
    }

    @Test
    @Description("Проверяем раздел Data Science")
    public void dsOtusTest() {
        driver.manage().window().maximize();
        openPage(cfg.urlOtus());
        clickByElement(By.xpath(cfg.buttonCourses()));
        clickByElement(By.xpath(cfg.buttonDS()));
        Allure.addAttachment("OSinOnComparisonPage", new ByteArrayInputStream(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES)));
        Assert.assertTrue(findElement(By.xpath(cfg.header())).getText().contains("Data Science"));
    }

    @Test
    @Description("Проверяем раздел Управление")
    public void manOtusTest() {
        driver.manage().window().maximize();
        openPage(cfg.urlOtus());
        clickByElement(By.xpath(cfg.buttonCourses()));
        clickByElement(By.xpath(cfg.buttonManage()));
        Allure.addAttachment("OSinOnComparisonPage", new ByteArrayInputStream(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES)));
        Assert.assertTrue(findElement(By.xpath(cfg.header())).getText().contains("Управление"));
    }

    @Test
    @Description("Проверяем раздел Тестирование")
    public void tstOtusTest() {
        driver.manage().window().maximize();
        openPage(cfg.urlOtus());
        clickByElement(By.xpath(cfg.buttonCourses()));
        clickByElement(By.xpath(cfg.buttonTest()));
        Allure.addAttachment("OSinOnComparisonPage", new ByteArrayInputStream(((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES)));
        Assert.assertTrue(findElement(By.xpath(cfg.header())).getText().contains("Тестирование"));
    }

}