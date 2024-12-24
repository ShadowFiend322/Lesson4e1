abstract class Student {
    private String fullName;
    private int course;
    private double lastExamGrade;

    public Student(String fullName, int course, double lastExamGrade) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamGrade = lastExamGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    public double getLastExamGrade() {
        return lastExamGrade;
    }

    abstract void writeExam();
}

class IUStudent extends Student {

    public IUStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    void writeExam() {
        System.out.println("Student of IU department " + getFullName() + " is writing an exam.");
    }
}

class MathStudent extends Student {

    public MathStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    void writeExam() {
        System.out.println("Student of Math department " + getFullName() + " is writing an exam.");
    }
}

// Тест
public class Main {
    public static void main(String[] args) {
        Student iuStudent = new IUStudent("Alice Brown", 2, 85.5);
        Student mathStudent = new MathStudent("John Smith", 3, 92.0);
        iuStudent.writeExam();
        mathStudent.writeExam();
    }
}
