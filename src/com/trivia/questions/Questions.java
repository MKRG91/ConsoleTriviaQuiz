package com.trivia.questions;

import java.util.Scanner;

public abstract class Questions {
    /*
    The variables that we need
     */
    private String[] questionsArray;
    private String[] answersArray;
    private String question;
    private String answer;
    private int score = 0;

    /*
    Getters and setters for the variables
     */
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String[] getQuestionsArray() {
        return questionsArray;
    }

    public void setQuestionsArray(String[] questionsArray) {
        this.questionsArray = questionsArray;
    }

    public String[] getAnswersArray() {
        return answersArray;
    }

    public void setAnswersArray(String[] answersArray) {
        this.answersArray = answersArray;
    }

    public String getQuestion(){
        return question;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }



    /*
    The function that assigns each question to the correct answer
     */
    private void assignAnswers(String question, String answer){
        setQuestion(question);
        setAnswer(answer);
    }

    /*
    Function that starts the quiz and generates a new question after the current one is answered
     */
    public void startTrivia(String[] questionsArray, String[] answersArray){
        for(int i = 0; i < questionsArray.length; i++){
            String question = questionsArray[i];
            String answer = answersArray[i];
            assignAnswers(question, answer);
            System.out.println("Ερώτηση "+ (i+1) + "/" + questionsArray.length );
            System.out.print(question);
            System.out.print("Πληκτρολόγησε τον αριθμό της σωστής απάντησης: ");
            Scanner scanner = new Scanner(System.in);
            String answerToQuestion = scanner.nextLine();
            if(answerToQuestion.matches(answer)){
                score++;
                System.out.println("Σωστή απάντηση!");
            }else{
                System.out.println("Λάθος απάντηση...");
            }
            System.out.println("---------------------------");
        }
        System.out.println("To score σου: " + score + "/" + questionsArray.length);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
