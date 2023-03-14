package Gun03;

import Utlity.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {
    // arabanın hareketi : start, drive, park, stop hareket sırası
    @Test
    void startCar() {
        System.out.println("startCar");
        // Assert.fail();
    }
    @Test(dependsOnMethods = {"startCar"})
    // bu testin çalışması, startCar ın hatasız çalışmasına bağımlı
    void driveCar() {
        System.out.println("driveCar");
    }
    @Test(dependsOnMethods = {"startCar","driveCar"})
    // 2 farklı bağlılık da olabiliyor.
    void parkCar() {
        System.out.println("parkCar");
    }
    // alwaysRun = true bağımlılıkları var ama hata çıkarsa da yine çalışır.
    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true)
     void stopCar() {
         System.out.println("stopCar");
     }
    // aynı seviyedeki testleri için priority verilebilir.
    // bağımlı testler, direk metodundan çalıştırdığınızda bağımlı olduğu metod zincirinde
    // 2 üste kadar ototmatik çağırıp çalışabilir.
}
