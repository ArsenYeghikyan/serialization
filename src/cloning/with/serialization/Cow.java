package cloning.with.serialization;

import java.io.*;

public class Cow implements Serializable {

 private String name;
 private int weight;
 private int age;

    public Cow() {
    }
    public Cow(String name, int age, int head) {
        this.name = name;
        this.weight = age;
        this.age = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static Cow cloningWithSerialization(Cow original) throws FileNotFoundException, ClassNotFoundException {

        File f = new File("C:\\Users\\Best\\IdeaProjects\\seiliz\\src\\cloning\\with\\serialization\\cow.txt");
        Cow cowCopied;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            ){

           oos.writeObject(original);

             cowCopied= (Cow) ois.readObject();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return cowCopied;

    }


    @Override
    public String toString() {
        return "Cow: " +
                "\nname: " + name +
                "\nweight: " + weight +
                "\nage: " + age;
    }
}
