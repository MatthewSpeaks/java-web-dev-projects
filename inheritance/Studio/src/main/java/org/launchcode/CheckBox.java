package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CheckBox extends Question {

    private ArrayList<Character> answer;


    public CheckBox(String aQuestion, ArrayList<Character> anArrayList ){
        super(aQuestion);
        this.answer = anArrayList;
    }

    public ArrayList<Character> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<Character> answer) {
        this.answer = answer;
    }
}
