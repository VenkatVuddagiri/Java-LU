package com.quizApplication;
import java.util.Scanner;
public class Question {
    String question,option1,option2,option3,option4;
    int correctAnswer;
    int userAnswer;
//    player.getDetails();

    public void askQuestion(){
        Scanner s = new Scanner(System.in);
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("Please choose an option");
        userAnswer = s.nextInt();
//        s.close();
    }
}
