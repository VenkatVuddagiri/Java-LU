package com.quizApplication;

public class Game {
    Question[] questions = new Question[3];

    public void init() {
        for (int i = 0; i < 3; i++) {
            questions[i] = new Question();
        }
        questions[0].question = "Who is the strongest avenger?";
        questions[0].option1 = "Thor";
        questions[0].option2 = "Ironman";
        questions[0].option3 = "Captain America";
        questions[0].option4 = "Dr.Strange";
        questions[0].correctAnswer = 3;

        questions[1].question = "What is the nearest planet to Earth?";
        questions[1].option1 = "Mercury";
        questions[1].option2 = "Venus";
        questions[1].option3 = "Earth";
        questions[1].option4 = "Mars";
        questions[1].correctAnswer = 1;

        questions[2].question = "What is the capital of Australia?";
        questions[2].option1 = "Sydney";
        questions[2].option2 = "Melbourne";
        questions[2].option3 = "Canberra";
        questions[2].option4 = "New Zealand";
        questions[2].correctAnswer = 3;


    }

    public void play(){
        Player player = new Player();
        player.getDetails();
        for (int i = 0; i < 3; i++) {
            questions[i].askQuestion();
            if (questions[i].userAnswer == questions[i].correctAnswer) {
                System.out.println(player.name + ", great you've made it!");
                player.score++;
            } else {
                System.out.println("Sorry " + player.name + "! You did not make it");
            }
        }
        System.out.println("Your score is "+player.getScore());
    }
}