package ex2;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW",5000,new Engine(250));

        File file = new File("C:\\Users\\Best\\IdeaProjects\\seiliz\\src\\ex2\\car.txt");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream  objectInputStream = new ObjectInputStream(new FileInputStream(file))){

            objectOutputStream.writeObject(car);

            System.out.println(790000+150000);
            car = null;

            car = (Car) objectInputStream.readObject();
            System.out.println(car);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
