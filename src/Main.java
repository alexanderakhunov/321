import controller.Controller;
import model.Disciples;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Teacher sensei = new Teacher("Van Li", 1968, Disciples.PROGRAMMING );

        Student Katya = new Student("Katya", 1999);
        Student Vasya = new Student("Vasya", 2000);
        Student Sasha = new Student("Sasha", 1998);
        List<Student> list = new ArrayList<>(Arrays.asList(Katya,Vasya,Sasha));
        controller.create(list,sensei);
        controller.read();
    }
}