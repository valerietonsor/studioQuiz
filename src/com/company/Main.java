package com.company;

public class Main {

    public static void main(String[] args) {
        Quiz lcQuiz = new Quiz();
	TrueFalse trueFalseQuestion = new TrueFalse("LaunchCode is awesome?", true);
	MultipleChoice multipleChoiceQuestion = new MultipleChoice("What is your teacher's name? \n a: Lisa \n b: Karen \n c: Mike \n d: Chad ", "c")
	lcQuiz.addQuestion(trueFalseQuestion);
	lcQuiz.run();

    }

}
