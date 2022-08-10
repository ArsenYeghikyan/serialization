package symple.serializable.staticEx;

import java.io.Serializable;

public class SimpleStatic implements Serializable {
    private static int staticNumber;
    private int nonStaticNumber;

    public SimpleStatic(int nonStaticNumber) {
        this.nonStaticNumber = nonStaticNumber;
        staticNumber = nonStaticNumber;
    }


    @Override
    public String toString() {
        return "SimpleStatic:" +
                "\nnonStaticNumber: " + nonStaticNumber +"\staticNumber: "+staticNumber;
    }
}
