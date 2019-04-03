package com.trivia.questions;

public class GeneralKnowledge extends Questions{
    private String[] questionsArray = {
            "Ποιό είναι το επίσημο νόμισμα της Βραζιλίας?\n1Το Μπατ)\n2)Δολλάριο\n3)Ριάλ\n",
            "Ποιού βιβλίου από τα παρακάτω η εισαγωγή ξεκινάει με... \"Λέγε με Ισμαήλ\"?\n1)Lord of the flies\n2)Moby Dick\n3)Το μαντολίνο του λοχαγού Κορέλλι\n",
            "Ποίος ηθοποιός πρωταγωνιστεί στην ταινία του 1983 Sudden Impact ?\n1)Steven Seagal\n2)Clint Eastwood\n3)Christopher Lambert\n",
            "Ποιός είναι ο υπότιτλός της νουβέλας φαντασίας \"Hobbit\"[1937]?\n1)A simple tale\n2)There and back again\n3)A tale of Bilbo Baggins\n",
            "Κατά την διάρκεια ποιού πολέμου έγινε η μάχη του River Plate?\n1)1ου Παγκόσμιου\n2)2ου Παγκόσμιου\n3)Αμερικανικού εμφυλίου\n",
            "Η Μπογκοτά είναι πρωτεύουσα της..?\n1)Κολομβίας\n2)Βενεζουέλας\n3)Χιλής\n",
            "Ποιό είναι το ζώδιο ενός ανθρώπου που είναι γεννημένος 5 Δεκεμβρίου?\n1)Δίδυμος\n2)Υδροχόος\n3)Τοξότης\n",
            "Ποιός επιστήμονας ανακάλυψε το Ράδιο?\n1)Μαρί Κιουρί\n2)Ζαν Φέρνελ\n3)Λουίς Παστέρ\n",
            "Ποιά ήταν η αιτία θανάτου του Φρέντυ Μέρκιουρι?\n1)AIDS\n2)Καρκίνος\n3)Πυροβολισμός\n",
            "Άλλη ονομασία για την μελέτη των γηρατιών ή των ηλικιωμένων?\n1)Γεροντολογία\n2)Αραχνολογία\n3)Εθνολογία\n",

    };

    private String[] answersArray = {
            "3",
            "2",
            "2",
            "2",
            "2",
            "1",
            "3",
            "1",
            "1",
            "1"
    };

    @Override
    public String[] getQuestionsArray() {
        return questionsArray;
    }

    @Override
    public void setQuestionsArray(String[] questionsArray) {
        this.questionsArray = questionsArray;
    }

    @Override
    public String[] getAnswersArray() {
        return answersArray;
    }

    @Override
    public void setAnswersArray(String[] answersArray) {
        this.answersArray = answersArray;
    }
}
