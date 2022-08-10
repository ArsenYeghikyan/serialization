package ex1;

import java.io.Serializable;

public class Group implements Serializable {

    private String groupName;
    private transient Student student;

    public Group(String groupName) {
        this.groupName = groupName;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", student=" + student +
                '}';
    }
}
