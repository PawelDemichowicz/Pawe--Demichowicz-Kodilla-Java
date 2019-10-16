package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_DAY = "//div[@class = \"_58mq _5dbb\"]/div[2]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class = \"_58mq _5dbb\"]/div[2]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class = \"_58mq _5dbb\"]/div[2]/span/span/select[3]";
    public static final String XPATH_WAIT_FOR = "birthday_wrapper";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.id(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDays = new Select(selectDay);
        selectDays.selectByIndex(1);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonths = new Select(selectMonth);
        selectMonths.selectByIndex(1);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYears = new Select(selectYear);
        selectYears.selectByIndex(1);
    }
}
