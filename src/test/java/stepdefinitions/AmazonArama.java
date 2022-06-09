package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonAramaPages;
import utilities.Driver;

public class AmazonArama {

    AmazonAramaPages page=new AmazonAramaPages();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("https://amazon.com");
    }

    @Given("kullanici s22 telefon aramasi yapar")
    public void kullanici_s22_telefon_aramasi_yapar() {
        page.amazonArama.sendKeys("S22"+ Keys.ENTER);

    }

    @Then("kullanici sonucu ekrana yazdirir")
    public void kullanici_sonucu_ekrana_yazdirir() {
        System.out.println(page.amazonSonuc.getText());
    }

    @Given("kullanici camera aramasi yapar")
    public void kullanici_camera_aramasi_yapar() {
        page.amazonArama.sendKeys("Camera"+Keys.ENTER);
    }



}