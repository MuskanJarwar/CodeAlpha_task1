import java.util.ArrayList;
public class GradeTracker {
   private ArrayList<Student> students;
   public GradeTracker(){
       this.students=new ArrayList<>();
   }
   // method to add student
    public void addStudent(Student student){
       students.add(student);
   }
   public ArrayList<Student> getStudents(){
       return students;
   }
   public double computeAverageScore(Student student) {
           int[] scores = student.getScores();
            double sum = 0;

            for (int score : scores) {
                sum += score;
            }

            return sum / scores.length;
        }

        public int findHighestScore(Student student) {
            int[] scores = student.getScores();
            int max = scores[0];

            for (int score : scores) {
                if (score > max) {
                    max = score;
                }
            }

            return max;
        }

        public int findLowestScore(Student student) {
            int[] scores = student.getScores();
            int min = scores[0];

            for (int score : scores) {
                if (score < min) {
                    min = score;
                }
            }

            return min;
        }


}
