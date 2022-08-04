package ex3;

import java.util.Objects;

public abstract class Car {

    private java.lang.String model;
    private int price;
    private Engine engine;

    public Car(java.lang.String model, int price, Engine engine) {
        this.model = model;
        this.price = price;
        this.engine = engine;
    }

    public Car() {
        System.out.println("parent constructor");
    }

    public java.lang.String getModel() {
        return model;
    }

    public void setModel(java.lang.String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public java.lang.String toString() {
        return "Car: " +
                "\nModel: " + model +
                "\nPrice: " + price +
                "\nEngine: " + engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(model, car.model) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price, engine);
    }
}
