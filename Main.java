// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){

        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        //for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
          //  System.out.println("i = " + i);
        //}
        GradeTracker gradeTracker=new GradeTracker();
        int choice;
        do {
            choice = displayMenuAndGetChoice();

            switch (choice) {
                case 1:
                    addStudentUsingGUI(gradeTracker);
                    break;
                case 2:
                    displayResultsUsingGUI(gradeTracker);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Exiting the program. Goodbye!", "Exit", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (choice != 3);

    }
    private static int displayMenuAndGetChoice() {
        String menu = "Student Grade Tracker Menu\n" +
                "1. Add Student Record\n" +
                "2. View Student Scores\n" +
                "3. Exit";

        String choiceStr = JOptionPane.showInputDialog(null, menu, "Menu", JOptionPane.PLAIN_MESSAGE);

        try {
            return Integer.parseInt(choiceStr);
        } catch (NumberFormatException e) {
            return -1; // Invalid choice
        }
    }

    public static void addStudentUsingGUI(GradeTracker gradeTracker){
    while (true){
        String name = JOptionPane.showInputDialog("Enter student name (or type 'exit' to finish):");

        if ("exit".equalsIgnoreCase(name)) {
            break;
        }
         int studentID=Integer.parseInt(JOptionPane.showInputDialog("Enter Student ID "));
        String scoresInput = JOptionPane.showInputDialog("Enter student scores (comma-separated):");
        String[] scoresArray = scoresInput.split(",");
        int[] scores = new int[scoresArray.length];

        for (int i = 0; i < scoresArray.length; i++) {
            scores[i] = Integer.parseInt(scoresArray[i].trim());
        }

        Student student = new Student(name,studentID, scores);
        gradeTracker.addStudent(student);
    }
    }
    private static void displayResultsUsingGUI(GradeTracker gradeTracker) {
        StringBuilder results = new StringBuilder();

        for (Student student : gradeTracker.getStudents()) {
            results.append("Student: ").append(student.getName()).append("\n");
            results.append("Average Score: ").append(gradeTracker.computeAverageScore(student)).append("\n");
            results.append("Highest Score: ").append(gradeTracker.findHighestScore(student)).append("\n");
            results.append("Lowest Score: ").append(gradeTracker.findLowestScore(student)).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, results.toString(), "Results", JOptionPane.INFORMATION_MESSAGE);
    }
}