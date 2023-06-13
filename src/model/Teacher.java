package model;

public class Teacher extends User{
    static Integer idGenerator = 0;
    private int idTeacher;
    private Disciples disciplesTaught;
    public Teacher(String name, Integer bornYear, Disciples disciple) {
        super(name, bornYear);
        this.disciplesTaught = disciple;
        this.idTeacher = idGenerator ++;
    }

    @Override
    public String toString() {
        return "teacher" + idTeacher + " " + disciplesTaught + " " + super.toString();
    }
}
