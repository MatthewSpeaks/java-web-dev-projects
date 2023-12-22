package org.launchcode;

public abstract class Question {
    public static int nextID = 1;
    private int questionID;

    private String question;


    public Question(String aQuestion) {
        questionID = nextID;
        nextID++;
        this.question = aQuestion;
    }

    public void printQuestion() {
        System.out.println(this.question);
    }

    public int getQuestionID() {
        return questionID;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
