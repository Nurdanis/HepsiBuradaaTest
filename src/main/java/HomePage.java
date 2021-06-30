import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    SearchBox searchBox ;

    By cartItemCount = By.id("cartItemCount");
    By cartContainerLocator = By.id("shoppingCart");

    //By cartCountLocator = By.id("nav-cart-count");
    // By cartContainerLocator = By.id("nav-cart-count-container");
   // By acceptCookiesLocator = By.id("sp-cc-accept");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox(){
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cartItemCount).getText();
        return Integer.parseInt(count);
    }

    //public void acceptCookies(){
     //   if (isDisplayed(acceptCookiesLocator)){
          //  click(acceptCookiesLocator);  }     }
}