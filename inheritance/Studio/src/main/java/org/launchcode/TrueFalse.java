package org.launchcode;

public class TrueFalse extends Question {

    private boolean answer;

    public  TrueFalse(String aString, boolean anAnswer) {
        super(aString);
        this.answer = anAnswer;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
