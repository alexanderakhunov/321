package model;

public class Student extends User{
    static Integer idGenerator = 0;
    Integer studentId=0;
    public Student(String name, Integer bornYear) {
        super(name, bornYear);
        this.studentId = idGenerator ++;
    }

    @Override
    public String toString() {
        return studentId + " " + super.toString();
    }
}
