
package R68_YOURLD.com.cgnt.ui;


public class Student {
    private int studentID;
    private String studentName;
    private String subject;
    private double marks;
    private double fees;

    public Student(int studentID, String studentName, String subject, int marks, double fees) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.subject = subject;
        this.marks = marks;
        this.fees = fees;
    }

    public Student() {
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", studentName=" + studentName + ", subject=" + subject + ", marks=" + marks + ", fees=" + fees + '}';
    }
    
    
}
