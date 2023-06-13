package controller;

import model.Student;
import model.Teacher;
import service.DataServiceIMPL;

import java.util.List;

public class Controller {
    DataServiceIMPL dataServiceIMPL = new DataServiceIMPL();


    public void create(List<Student> inputList, Teacher teacher) {
        if (inputList != null && teacher != null) {
            dataServiceIMPL.create(inputList, teacher);
        } else {
            System.out.println("Wrong data!");
        }
    }
        public void read() {
            dataServiceIMPL.read();
        }
    }

