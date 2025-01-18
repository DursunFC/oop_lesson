public class student {public class student{
    private int exam1;
    private int exam2;
    private int examFinal;
    static int studentId;

    public student(int exam1,int exam2, int examFinal){
        this.exam1= exam1;
        this.exam2= exam2;
        this.examFinal= examFinal;
        studentId++;
    }

    public double getStudentNote(){
        return (double) exam1*0.2+exam2*0.3+examFinal*0.5;
    }
}

