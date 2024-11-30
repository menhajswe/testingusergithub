package testsearch;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestSearchUser {
    private WebDriver driver;
    private final String BASE_URL = "https://gh-users-search.netlify.app";

    @BeforeEach
    public void setup() {
        driver = new FirefoxRunner().runDriver(BASE_URL);
    }

    @Test
    @DisplayName("Testing URL name")
    public void testSearch() {
        String expectedfUserName = "ThaELL1";
        String expectedFullName = "Eddie Lenoir";
        WebElement searchBar = driver.findElement(By.xpath("//input[@data-testid=\"search-bar\"]"));
        WebElement searchButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        searchBar.sendKeys(expectedfUserName);
        searchButton.click();

        WebElement founder = driver.findElement(By.xpath("//div/h4[1]"));

        Assertions.assertTrue(founder.getText().equals(expectedFullName));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    
}
