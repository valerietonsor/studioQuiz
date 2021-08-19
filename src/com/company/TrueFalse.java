package com.company;

public class TrueFalse extends Question{
    private Boolean trueFalseAnswer;

    public TrueFalse(String prompt, Boolean trueFalseAnswer){
        super(prompt);
        this.trueFalseAnswer = trueFalseAnswer;
    }


    public Boolean getTrueFalseAnswer() {
        return trueFalseAnswer;
    }

    public void setTrueFalseAnswer(Boolean answer) {
        this.trueFalseAnswer = true;
    }
}
