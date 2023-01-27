import org.example.Car;
import org.example.CarInspectionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarinspectionServiceTest {

    Car car1 = new Car(4, 4, true, true);
    CarInspectionService carInspectionService1 = new CarInspectionService();

    //prüfen ob ein Auto 4 Reifen hat
    @Test
    void hasFourTiresTest() {
        Car car1 = new Car(4, 4, true, true);
        boolean result = carInspectionService1.hasFourTires(car1);
        Assertions.assertEquals(true, result);
    }

    @Test
    void hasNotFourTiresTest() {
        Car car2 = new Car(5, 4, true, true);
        boolean result = carInspectionService1.hasFourTires(car2);
        Assertions.assertEquals(false, result);
    }

    @Test
    void hasAirbagTestTrue(){
        Car carAirbagTrue = new Car(4,4,true,true);
        boolean result = carInspectionService1.hasAirbag(carAirbagTrue);
        Assertions.assertEquals(true,result);
    }
    @Test
    void hasAirbagTestFalse() {
        Car carAirbagFalse = new Car(4, 4, true, false);
        boolean result = carInspectionService1.hasAirbag(carAirbagFalse);
        Assertions.assertEquals(false, result);
    }

    @Test
    void hasSeatBeltTest() {
        Car car3 = new Car(5, 4, true, true);
        boolean result = carInspectionService1.hasSeatBelt(car3);
        Assertions.assertEquals(true, result);
    }

    @Test
    void hasNotSeatBeltTest() {
        Car car4 = new Car(5, 4, false, true);
        boolean result = carInspectionService1.hasSeatBelt(car4);
        Assertions.assertEquals(false, result);
    }

    @Test
    void hasThreeOrFiveDoors() {
        Car car5 = new Car(5, 5, true, true);
        boolean result = carInspectionService1.hasThreeOrFiveDoors(car5);
        Assertions.assertEquals(true, result);
    }
    @Test
    void hasNotThreeOrFiveDoors() {
        Car car6 = new Car(5, 6, true, true);
        boolean result = carInspectionService1.hasThreeOrFiveDoors(car6);
        Assertions.assertEquals(false, result);
    }
}
