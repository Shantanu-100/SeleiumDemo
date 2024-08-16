import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
    public static void main(String[] args) {
        // Use WebDriverManager to set up the ChromeDriver
        // WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        try {
            // Navigate to Netflix India website
            driver.get("https://www.netflix.com/in/");
            Thread.sleep(2000); // Pause for 2 seconds

            // Click the Sign In button
            WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"signIn\"]"));
            signInButton.click();
            Thread.sleep(2000); // Pause for 2 seconds

            // Input email
            WebElement emailField = driver.findElement(By.xpath("//*[@id=\":r0:\"]"));
            emailField.sendKeys("your-email@example.com");
            Thread.sleep(2000); // Pause for 2 seconds

            // Input password
            WebElement passwordField = driver.findElement(By.xpath("//*[@id=\":r3:\"]"));
            passwordField.sendKeys("yourpassword");
            Thread.sleep(2000); // Pause for 2 seconds

            // Click the Sign In button
            WebElement signInSubmitButton = driver.findElement(By.xpath("//button[@data-uia='login-submit-button']"));
            signInSubmitButton.click();
            Thread.sleep(2000); // Pause for 2 seconds

            // Navigate back to the previous page
            driver.get("https://www.netflix.com/in");
            Thread.sleep(2000); // Pause for 2 seconds

            // Locate and click the language selection dropdown
            WebElement languageDropdown = driver.findElement(By.xpath("//*[@id=\":R5ajalalbd:\"]"));
            languageDropdown.click();
            Thread.sleep(2000); // Pause for 2 seconds

            // Perform a mouse hover action (commented out as per your original code)
            /*
            Actions actions = new Actions(driver);
            WebElement profileMenu = driver.findElement(By.id(":R5ajalalbd:']"));
            actions.moveToElement(profileMenu).perform();
            */

            // Click the Account link
            WebElement accountLink = driver.findElement(By.xpath("//a[@href='/youraccount']"));
            accountLink.click();
            Thread.sleep(2000); // Pause for 5 seconds

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
