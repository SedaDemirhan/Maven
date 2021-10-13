package day05;

import org.junit.Test;

public class C01_Notasyon {
 /*javadaki gibi selenium'da belirli işlevleri yapan methodlar oluşturabiliriz
  ancak bu methodlar çağırılmadıkça CALIŞMAZLAR*/


    public void ilkTestMethodu(){
        System.out.println("ilk test methodumuz");
    }

    //JUNIT ile notasyon kullanarak sıradan metodları test methoduna dönüştürebilirz
    //bir test methodu bağımsız olarak çalışabilen test yapmamıza imkan verir
    //@Test notasyonu sayesinde main method ortadan kalkar


    @Test
    public void notasyonluilkTestMethodu(){
        System.out.println("notasyonlu ilk test methodumuz");
    }

}
