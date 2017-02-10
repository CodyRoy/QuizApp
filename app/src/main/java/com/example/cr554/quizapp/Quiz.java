package com.example.cr554.quizapp;

/**
 * Created by cr554 on 2/9/2017.
 */

public class Quiz {
    private String question;
    private String answerCorrect;
    private String answerWrong2;
    private String answerWrong3;

    public Quiz(String q, String ans1, String ans2, String ans3){
        question = q;
        answerCorrect = ans1;
        answerWrong2 = ans2;
        answerWrong3 = ans3;
    }

    //how do i identify the correct answer
    public String getQuestion() {
        return question;
    }

    public String getAnswerCorrect() {
        return answerCorrect;
    }

    public String getAnswerWrong2() {
        return answerWrong2;
    }

    public String getAnswerWrong3() {
        return answerWrong3;
    }

    public void setAnswer1(String answer1) {
        this.answerCorrect = answer1;
    }

    public void setAnswerWrong2(String answer2) {
        this.answerWrong2 = answer2;
    }

    public void setAnswerWrong3(String answer3) {
        this.answerWrong3 = answer3;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
