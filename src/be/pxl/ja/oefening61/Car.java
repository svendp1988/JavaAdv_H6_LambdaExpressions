package be.pxl.ja.oefening61;

public class Car {
    private final Engine engine;

    public Car(String fuel) {
        this.engine = new Engine(fuel);
    }

    public void start() {
        this.engine.start();
    }

    private static class Engine {
        private final String fuel;

        public Engine(String fuel) {
            this.fuel = fuel;
        }

        public void start() {
            System.out.printf("Engine started. Running on %s.%n", fuel);
        }
    }

    public static void main(String[] args) {
        Car car = new Car("petrol");
        car.start();
        Engine engine = new Car.Engine("Diesel");
    }
}
