package cloning.with.reflaction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        Cow originalCow = new Cow("M", 5, 1);
        System.out.println("OriginalCow" + originalCow);


Cow cow1 =  reflectionCloning(originalCow);
        System.out.println(cow1);

//        Class<?> cl = originalCow.getClass();
//        try {
//            Field name = cl.getField("name");
//            Field head = cl.getField("head");
//            Field age = cl.getField("age");


//            Constructor<Cow> con= cl.getConstructor();


//        } catch (NoSuchFieldException | NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        }


    }


    private static Cow reflectionCloning(Cow originalCow) {
        Class<?> cl = originalCow.getClass();
        try {
            Field name = cl.getDeclaredField("name");
            Field head = cl.getDeclaredField("head");
            name.setAccessible(true);

            name.set(originalCow, "b");


            head.setAccessible(true);

            head.set(originalCow, 2);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        return originalCow;
    }


}
