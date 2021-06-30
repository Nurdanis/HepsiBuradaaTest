import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

   // By addToCartButtonLocator = By.id("add-to-cart-button");
    By addToCartLocator = By.id("addToCart");
    By closeCheckOutPopup =By.className("checkoutui-Modal-2iZXl");


    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartLocator);
    }

    public void addToCart() {
        click(addToCartLocator);
    }

    public void closeCheckOutPopup() {
        click(closeCheckOutPopup);
    }
}