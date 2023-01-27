package org.example;

public class CarInspectionService {
    //private Car car;
    //prüfen ob ein Auto 4 Reifen hat
    public boolean hasFourTires(Car car) {
        if (car.getNumberOfTires() == 4){
            return true;
        }
        else {
            return false;
        }
    }

    //prüfen, ob das Auto einen Airbag hat
    public boolean hasAirbag(Car car) {
        if (car.isAirBag()) {
            return true;
        } else {
            return false;

        }
    }

    //prüfen, ob das Auto einen seatBelt hat

    public boolean hasSeatBelt(Car car){
        if (car.isSeatBelt()){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean hasThreeOrFiveTires(Car car) {
        if (car.getNumberOfTires() == 3 || car.getNumberOfTires() == 5) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkCar(Car car){
        if(hasAirbag(car) && hasFourTires(car) && hasSeatBelt(car) && hasThreeOrFiveTires(car)){
            return true;
        }else  {
            return false;
        }
        }

}
