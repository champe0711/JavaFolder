

package Misc;

/**
 * Implement a class Student. For the purpose of this exercise, a student has a name and a total quiz score. Supply an appropriate constructor and methods getName(), addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the latter, you also need to store the number of quizzes that the student took. Supply a StudentTester class that tests all methods
 */
public class Student {
    
    private String name;
    private int totalScore;
    private int quizCount;
    
    public Student(){
        
    }
    
    public Student(String StudentName){
        this.name = StudentName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addQuiz(int score){
        this.totalScore = this.totalScore + score;
        this.quizCount++;
    }
    
    public int getTotalScore(){
        return this.totalScore;
    }
    
    public double getAverageScore(){
        return (double)this.totalScore/ (double)this.quizCount;
    }
    
    
}
