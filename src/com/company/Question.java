package com.company;

public abstract class Question {
    private String prompt;
    private String userInputAnswer;


    public Question(String prompt){
        this.prompt = prompt;

    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getUserInputAnswer() {
        return userInputAnswer;
    }

    public void setUserInputAnswer(String userInputAnswer) {
        this.userInputAnswer = userInputAnswer;
    }

}
