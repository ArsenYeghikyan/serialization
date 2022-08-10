package symple.serializable.staticEx;

import java.io.*;

public class Dispatcher {
    public static void main(String[] args) {


        SimpleStatic simpleStatic = new SimpleStatic(10);

        File file = new File("C:\\Users\\Best\\IdeaProjects\\seiliz\\src\\symple\\serializable\\staticEx\\simple_static.txt");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

objectOutputStream.writeObject(simpleStatic);



simpleStatic = null;
simpleStatic= (SimpleStatic) objectInputStream.readObject();


            System.out.println(simpleStatic);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
