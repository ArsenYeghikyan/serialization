package ex1;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {

     private String name;
    private String lastName;
     private int ID;

    public Student(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.ID = age;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nLastName: " + lastName  +
                "\nAge: " + ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID && Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, ID);
    }
}
