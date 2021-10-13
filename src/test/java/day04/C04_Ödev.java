package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C04_Ödev {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        //1. “https://www.saucedemo.com” Adresine gidin

        driver.get("https://www.saucedemo.com");

        //2. Username kutusuna “standard_user” yazdirin

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //3. Password kutusuna “secret_sauce” yazdirin

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //4. Login tusuna basin

        driver.findElement(By.id("login-button")).click();

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin

        WebElement ilkürünİsmi= driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));

        String ilkürünKayıt=ilkürünİsmi.getText();

        ilkürünİsmi.click();

        //6. Add to Cart butonuna basin

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();

        //7. Alisveris sepetine tiklayin
         Thread.sleep(1000);

         driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin

       WebElement sepetteÜrünVarmı =driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));

        if (sepetteÜrünVarmı.isEnabled()){
            System.out.println("seçtiğiniz ürün sepette mevcuttur, TEST PASS");
        }else{
            System.out.println("seçtiğiniz ürün sepette mevcut değildir,TEST FAILED");
        }

        //9. Sayfayi kapatin

        driver.close();
    }
}
