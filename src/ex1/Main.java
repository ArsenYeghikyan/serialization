package ex1;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Student st = new Student("Arsen", "Yeghikyan", 34);
        File file = new File("C:\\Users\\Best\\IdeaProjects\\seiliz\\src\\ex1\\seriz11.txt");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            objectOutputStream.writeObject(st);
            st = null;
            st = (Student) objectInputStream.readObject();
            System.out.println(st.getID());
            System.out.println(st.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


//    }
}
