package base;

import org.openqa.selenium.WebDriver;
import pageobjects.AmazonHomePage;
import pageobjects.BabyWishListPage;
import pageobjects.ProductSpecificPage;
import pageobjects.SearchResultPage;

public class PageObjectManager {
    WebDriver driver;
    public PageObjectManager(WebDriver driver){
        this.driver=driver;

    }


    public AmazonHomePage getAmazonHomePage(){
        AmazonHomePage homepage=new AmazonHomePage(driver);
        return homepage;

    }
    public ProductSpecificPage getProductSpecificPage(){
        ProductSpecificPage page=new ProductSpecificPage(driver);
        return page;

    }
    public SearchResultPage getSearchResultPage(){

        SearchResultPage searchResultPage=new SearchResultPage(driver);
        return searchResultPage;
    }
    public BabyWishListPage getBabyWishListPage(){
        BabyWishListPage wishListPage =new BabyWishListPage(driver);
        return wishListPage;



    }

}
