package com.company;

public class Checkbox extends Question{
    private String checkboxAnswer;

    public Checkbox(String prompt, String checkboxAnswer){
        super(prompt);
        this.checkboxAnswer = checkboxAnswer;
    }

    public String getCheckboxAnswer() {
        return checkboxAnswer;
    }

    public void setCheckboxAnswer(String checkboxAnswer) {
        this.checkboxAnswer = checkboxAnswer;
    }
}
