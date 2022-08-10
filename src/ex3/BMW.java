package ex3;

import java.io.Serializable;
import java.util.Objects;

public class BMW extends Car implements Serializable {
    public int weight;
    public BMW(String model, int price, Engine engine, int weight) {
        super(model, price, engine);
        this.weight = weight;
        System.out.println("child constructor");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BMW bmw = (BMW) o;
        return weight == bmw.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nWeight: " + weight;
    }
}
