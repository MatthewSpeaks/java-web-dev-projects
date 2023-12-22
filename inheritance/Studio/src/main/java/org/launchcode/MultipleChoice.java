package org.launchcode;

public class MultipleChoice extends Question {

    private char answer;
    public MultipleChoice(String aQuestion, char aAnswer) {
        super(aQuestion);
        answer = aAnswer;
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }
}
