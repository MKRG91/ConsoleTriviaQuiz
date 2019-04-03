package com.trivia.questions;

public class Sports extends Questions {
    private String[] questionsArray = {
            "Ποιός παγκόσμιος πρωταθλητής της Φόρμουλα 1 πέθανε στην Ιταλία το 1994 όταν τράκαρε με την Williams FW16 που οδηγούσε?\n1)Άιρτον Σέννα\n2)Ντέιμον Χιλ\n3)Μίκαελ Σουμάχερ\n",
            "Σε ποιά πόλη διεξήχθηκαν οι χειμερινοί Ολυμπιακοί Αγώνες του 2012?\n1)Λονδίνο\n2)Πεκίνο\n3)Ρίο Ντε Τζανείρο\n",
            "Πόσοι παίχτες υπάρχουν στο γήπεδο, από κάθε ομάδα σε έναν αγώνα ποδοσφαίρου?\n1)11\n2)12\n3)13\n",
            "Ποιό άθλημα δεν ανήκει στο βασικό τρίαθλο?\n1)Ποδηλασία\n2)Τρέξιμο\n3)Ξιφασκία\n",
            "Ποιό νούμερο βρίσκεται στην κορυφή ενός βασικού πίνακα για βελάκια?\n1)12\n2)7\n3)20\n",
            "Ποιά χρονιά παραιτήθηκε ο Μουχάμαντ Άλι από την πυγμαχία?\n1)1981\n2)1985\n3)1989\n",
            "Ποιός έβαλε το νικητήριο τέρμα στον τελικό παγκοσμίου κυπέλλου ανάμεσα σε Αργεντινή και Γερμανία?\n1)Μαξ Μέγιερ\n2)Λίονελ Μέσι\n3)Μάριο Γκότσε\n",
            "Σε ένα παιχνίδι Σνούκερ, πόσους πόντους αξίζει η ροζ μπάλα?\n1)6\n2)7\n3)8\n",
            "Με πόσους πόντους θα τελειώσει ένα τέλειο παιχνίδι Bowling με 10 κορίνες?\n1)200\n2)250\n3)300\n",
            "Ποιό από τα παρακάτω αθλήματα χρησιμοποιεί τον όρο \"face off\"?\n1)Αμερικανικό Ποδόσφαιρο\n2)Χόκευ επί πάγου\n3)Μπείζμπολ\n",
    };

    private String[] answersArray = {
            "1",
            "2",
            "1",
            "3",
            "3",
            "1",
            "3",
            "1",
            "3",
            "2"
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
