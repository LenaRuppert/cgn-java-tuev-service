package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static void outPut(CarInspectionService newService,Car car){
        if(newService.checkCar(car)){
            System.out.println("all checks true!");
        }else {
            System.out.println("Not ok");
        }
    }
}