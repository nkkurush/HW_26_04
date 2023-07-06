package HW_29_05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadacha3 {
        /*3

        Инициализируй поле wheels используя данные из loadWheelNamesFromDB.
                Выкинь исключение в случае некорректных данных.

                Подсказка: если что-то не то с колесами, то это не машина!
                Сигнатуры не менять


        Машину на СТО не повезем!*/

    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            wheels = new ArrayList<>();
            if(loadWheelNamesFromDB().length!=4){
                throw new Exception();
            }
            for(String s:loadWheelNamesFromDB()) {
                wheels.add(Wheel.valueOf(s));
            }
            //init wheels here
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        for(Wheel wheel:car.wheels){
            System.out.println(wheel);
        }

    }
}
