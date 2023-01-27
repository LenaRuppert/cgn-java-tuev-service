package org.example;

public class Main {
    public static void main(String[] args) {


         Car audiA4 = new Car(4,5, true, true);
         Car bmwM3 = new Car(4,3,true, true);

        CarInspectionService newService = new CarInspectionService();

        outPut(newService,audiA4);



    }

    public static void outPut(CarInspectionService newService,Car car){
        if(newService.checkCar(car)){
            System.out.println("all checks true!");
        }else {
            System.out.println("Not ok");
        }
    }
}