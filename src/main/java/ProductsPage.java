import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By sortByWrapper = By.className("category-suggestion-title");
    By productNameLocator = new By.ByCssSelector("div.product-image-wrapper");

    //By shippingOptionLocator = By.id("p_n_free_shipping_eligible-title");
    //By productNameLocator = new By.ByCssSelector("span.a-size-base-plus");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(sortByWrapper);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}