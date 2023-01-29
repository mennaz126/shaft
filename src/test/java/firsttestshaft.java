import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.python.antlr.ast.Print;
import org.testng.annotations.Test;

public class firsttestshaft {

    @Test
    public void Openbrowser() throws InterruptedException {
        SHAFT.GUI.WebDriver driver= new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://www.unioncoop.ae/");
        By freshfood = By.xpath("/html/body/div[1]/div[1]/div/div[2]/nav/div[2]/ul/li[2]/a");
        driver.element().click(freshfood);
        By freshchicken = By.xpath("/html/body/div[1]/main/div[3]/div/div[3]/div[3]/div[1]/div[2]/div/div/div/div[2]/div/a");
        driver.element().doubleClick(freshchicken);
        By firstproduct=By.xpath("/html/body/div[1]/main/div[4]/div[1]/div[3]/div[2]/ol/li[1]/div/a/span/span/img");
        driver.element().click(firstproduct);
       // By product= By.xpath("/html/body/div[1]/main/div[4]/div[1]/div[3]/div[2]/ol/li[1]/div/a/span/span/img");
       // driver.element().click(product);
        By increasebutn=By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[3]/form/div/div/div[1]/div/button[2]");
        driver.element().click(increasebutn);
        By cart=By.xpath("/html/body/div[1]/header/div/div[1]/a");
        driver.element().click(cart);
        By checkout=By.id("top-cart-btn-checkout");
        driver.element().click(checkout);
        By price=By.xpath("/html/body/div[1]/main/div[3]/div/div[3]/form/div[1]/div[2]/div[2]/div/div/div[1]/div/span[1]/span/span");


       // driver.element().click(nameproduct);





        driver.assertThat().element(price).text();
        System.out.println(price);












    }
}
