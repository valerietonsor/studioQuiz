package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Quiz {

    ArrayList<Question> questionArrayList = new ArrayList<Question>();

    public void addQuestion(Question newQuestion) {
        questionArrayList.add(newQuestion);
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < questionArrayList.size(); i++) {
            System.out.println(questionArrayList.get(i).getPrompt());
            String userInput = input.nextLine();
            questionArrayList.get(i).setUserInputAnswer(userInput);
            System.out.println(questionArrayList.get(i).getUserInputAnswer());
        }
//
//    public Double grade(){
//        Double grade = 0.0;
//
//        return grade;
//    }

    }

}
