package edu.cscc.topics.quality.e2e;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleCloudSteps {
    private static WebDriver driver;

    static {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Given("^I am on the Google Cloud homepage$")
    public void givenIAmOnGoogleCloudHomepage(){
        driver.navigate().to("https://cloud.google.com");
    }

    @When("^I click the Blog link$")
    public void whenIClickTheBlogLink() {

        driver.findElement(By.linkText("Blog")).click();
    }
    @Then("^I am taken to the Google Cloud Blog page$")
    public void thenIAmTakenToGoogleCloudBlogPage() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://cloud.google.com/blog/", url);
    }


}
