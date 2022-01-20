package Exercise2;

public class Code {

    /*
    Тут я бы объеденил методы в один интерфейс, так как они симантически связаны.
    Все машины которые едут, когда-нибудь останавливаются
     */

    interface Moveable {
        void move();
    }

    interface Stopable {
        void stop();
    }

    /*
    можно добавить имплиментацию интерфейса к абстрактному классу
     */

    abstract class Car {
        //поля должны быть private
        public Engine engine;
        private String color;
        private String name;


        protected void start() {
            System.out.println("Car starting");
        }

        abstract void open();

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class LightWeightCar extends Car implements Moveable {

        @Override
        void open() {
            System.out.println("Car is open");
        }

        @Override
        public void move() {
            System.out.println("Car is moving");
        }

    }

    //пропущено implements перед интерфейсами
    //не реализован метод open() класса Car
    class Lorry extends Car, Moveable, Stopable {

        public void move() {
            System.out.println("Car is moving");
        }

        public void stop() {
            System.out.println("Car is stop");

        }
    }


}
