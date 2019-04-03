package com.trivia.main;
import com.trivia.questions.*;
import java.util.Scanner;

public class mainClass {

    private static void restartTrivia(){
        System.out.println("Θέλεις να συνεχίσεις? ν/ο");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if(choice.matches("ν") || choice.matches("Ν") || choice.matches("Ναι") || choice.matches("ναι")){
            main(new String[1]);
        }else if(choice.matches("ο") || choice.matches("Ο") || choice.matches("Όχι") || choice.matches("όχι")){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1)Γεωγραφία\n" +
                "2)Ιστορία\n" +
                "3)Αθλητικά\n" +
                "4)Γενικών γνώσεων\n" +
                "0)Έξοδος");

        System.out.print("Επέλεξε κατηγορία ερωτήσεων:");
        String choice = scanner.nextLine();

        if (choice.equals("1") || choice.equals("Γεωγραφία") || choice.equals("ΓΕΩΓΡΑΦΙΑ") || choice.equals("γεωγραφία")) {
            System.out.println("Επέλεξες Γεωγραφία.\n" +
                    ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            Geography geo1 = new Geography();
            geo1.startTrivia(geo1.getQuestionsArray(), geo1.getAnswersArray());
            restartTrivia();
        } else if (choice.equals("2") || choice.equals("Ιστορία") || choice.equals("ΙΣΤΟΡΙΑ") || choice.equals("ιστορία")) {
            System.out.println("Επέλεξες Ιστορία\n" +
                    ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            History his1 = new History();
            his1.startTrivia(his1.getQuestionsArray(), his1.getAnswersArray());
            restartTrivia();
        } else if (choice.equals("3") || choice.equals("Αθλητικά") || choice.equals("ΑΘΛΗΤΙΚΑ") || choice.equals("αθλητικά")) {
            System.out.println("Επέλεξες Αθλητικά\n" +
                    ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            Sports sprt1 = new Sports();
            sprt1.startTrivia(sprt1.getQuestionsArray(), sprt1.getAnswersArray());
            restartTrivia();
        } else if (choice.equals("4") || choice.equals("Γενικών γνώσεων") || choice.equals("ΓΕΝΙΚΩΝ ΓΝΩΣΕΩΝ") || choice.equals("γενικών γνώσεων")) {
            System.out.println("Επέλεξες Γενικών γνώσεων\n" +
                    ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            GeneralKnowledge gk1 = new GeneralKnowledge();
            gk1.startTrivia(gk1.getQuestionsArray(), gk1.getAnswersArray());
            restartTrivia();
        }else if(choice.equals("0") || choice.equals("Έξοδος") || choice.equals("ΕΞΟΔΟΣ") || choice.equals("έξοδος")){
            System.exit(0);
        } else {
            System.out.println("Η επιλογή δεν είναι διαθέσιμή. Διάλεξε μία από τις διαθέσιμές κατηγορίες για να παίξεις ή 0 για έξοδο!");
            main(args);
        }
    }
}