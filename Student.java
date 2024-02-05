public class Student {
    private String name;
    private int studentID;
    private int[] scores;
    public Student(){
        this.name=null;
        this.studentID=0;
        this.scores=new int[0];
    }
    public Student(String name,int studentID,int[] scores){
        this.name=name;
        this.studentID=studentID;
        this.scores=scores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }
    public String getName(){
        return name;
    }
    public int getStudentID(){
        return studentID;
    }
    public int[] getScores(){
        return scores;
    }
}
