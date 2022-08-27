package cloning.with.serialization;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        Cow originalCow = new Cow("M", 5, 1);
        System.out.println("OriginalCow" + originalCow);
        System.out.println("=====================================");
        System.out.println(Cow.cloningWithSerialization(originalCow));


    }




}
