package com.company;

public class MultipleChoice extends Question{
    private char multipleChoiceAnswer;


    public MultipleChoice(String prompt, char multipleChoiceAnswer){
        super(prompt);
        this.multipleChoiceAnswer = multipleChoiceAnswer;
    }

    public char getMultipleChoiceAnswer() {
        return multipleChoiceAnswer;
    }

    public void setMultipleChoiceAnswer(Character answer) {
        this.multipleChoiceAnswer = multipleChoiceAnswer;
    }
}
