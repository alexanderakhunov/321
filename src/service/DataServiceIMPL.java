package service;

import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataServiceIMPL implements Service {

    List<Student> studentList;
    Teacher teacher;

    public DataServiceIMPL() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public void create(Student inputStudent) {
        this.studentList.add(inputStudent);
    }

    @Override
    public void create(List<Student> inputList, Teacher teacher) {
        this.studentList.addAll(inputList);
        this.teacher = teacher;
    }

    @Override
    public void read() {
        System.out.println(teacher);
        for (Student s : studentList){
            System.out.println("\t" + s);
        }
    }


}
