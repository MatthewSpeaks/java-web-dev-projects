package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> quizQuestions;

    public Quiz(Question aQuestion) {
        this.quizQuestions.add(aQuestion);
    }

    public void runQuiz() {

        Scanner input = new Scanner(System.in);
        for(Question q : quizQuestions) {
            q.printQuestion();
            input.nextLine();
        }
    }

    public ArrayList<Question> getQuizQuestions() {
        return quizQuestions;
    }

    public void addQuizQuestions(Question quizQuestion) {
        this.quizQuestions.add(quizQuestion);
    }
}
