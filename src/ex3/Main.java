package ex3;

import java.io.*;

public class Main {
    public static void main(String... args) {

        BMW bmw = new BMW("BMW",5000,new Engine(250,"BMW"),3500);

        File file = new File("C:\\Users\\Best\\IdeaProjects\\seiliz\\src\\ex3\\bmw.txt");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream  objectInputStream = new ObjectInputStream(new FileInputStream(file))){

            objectOutputStream.writeObject(bmw);

//            System.out.println(790000+150000);
            bmw = null;

            bmw = (BMW) objectInputStream.readObject();
            System.out.println(bmw);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
