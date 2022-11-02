package com.functional.programming.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.functional.programming.section02functionalinterfaces.supplier.Lec02SupplierDriverFactory;

/* No funciona bien porque al parecer falta descargar los drivers */
public class DriverTest {

    private WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser) {
        //Para no usar if anidado
        this.driver = Lec02SupplierDriverFactory.getDriver(browser);

    }

    @Test
    public void googleTest() {
        this.driver.get("https://google.com");
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }
    
}
