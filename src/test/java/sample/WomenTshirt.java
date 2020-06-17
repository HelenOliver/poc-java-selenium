package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class WomenTshirt {
    private static final long DEFAULT_TIMEOUT_WAIT = 10;

    @FindBy(css = "a[title='Women']")
    private WebElement womenTitle;

    public WomenTshirt(WebDriver webDriver) {
        super(webDriver);
    }

    public void getTitleWomen(String text) {
        String alert = this.womenTitle.getText().trim();
        assertEquals("Page not found!", text, alert);
    }
}
