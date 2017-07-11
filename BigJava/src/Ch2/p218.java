
import Misc.Student;

/**
 * Name: carTester
 * Programming Exercise: 18.
 * 
 * * Implement a class Student. For the purpose of this exercise, a student has a name and a total quiz score. Supply an appropriate constructor and methods getName(), addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the latter, you also need to store the number of quizzes that the student took. Supply a StudentTester class that tests all methods
 */

public class p218 {

	public static void main(String[] args) {
            
            Student a = new Student("Champe");
            System.out.println(a.getName());
            a.addQuiz(9);
            a.addQuiz(5);
            a.addQuiz(3);
            a.addQuiz(7);
            a.addQuiz(2);
            a.addQuiz(10);
            a.addQuiz(3);
            a.addQuiz(8);
            a.addQuiz(9);
            a.addQuiz(9);
            System.out.println("Total Score:" + a.getTotalScore() + "/100");
            System.out.println("Average Score: " +a.getAverageScore());
        }
}
