package com.quizApplication;
import java.util.Scanner;
public class Player {
    String name;
    int score=0;
    Scanner s = new Scanner(System.in);
    public void getDetails(){
        System.out.println("Enter your name");
        name = s.next();
    }
    public int getScore(){
        return score;
    }
}
