package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTests extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.loginToApplication
                ("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(),"products header not displayed");
    }
}
