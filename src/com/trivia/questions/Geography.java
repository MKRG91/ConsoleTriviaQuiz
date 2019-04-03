package com.trivia.questions;

public class Geography extends Questions {
    private String[] questionsArray = {
            "Ποιά είναι η πρωτεύουσα της Βραζιλίας?\n1)Ρίο ντε Τζανέιρο\n2)Μπραζίλια\n3)Σάο Πάολο\n",
            "Ποιά είναι η πρωτεύουσα της Ελβετίας?\n1)Γενεύη\n2)Ζυρίχη\n3)Βέρνη\n",
            "Ποιά είναι η πρωτεύουσα της Λιβερίας?\n1)Μονρόβια\n2)Βιρτζίνια\n3)Γκρίνβιλ\n",
            "Ποιά είναι η πρωτεύουσα του Καζακστάν?\n1)Αλμάτι\n2)Αστανά\n3)Σιμκέντ\n",
            "Ποιά είναι η πρωτεύουσα της Νότιας Κορέας?\n1)Λίμα\n2)Πιονγιάνγκ\n3)Σεούλ\n",
            "Σε ποια χώρα θα βρισκόσουν αν επισκεπτόσουν το Μοντ Σεντ-Μισέλ?\n1)Γαλλία\n2)Γερμανία\n3)Ιταλία\n",
            "Ποιά χώρα ήταν προηγουμένως γνωστή ως Σιάμ?\n1)Ταυλάνδη\n2)Ινδονησία\n3)Βιετνάμ\n",
            "Σε ποιά χώρα βρίσκεται η έρημος Ατακάμα?\n1)Η.Π.Α\n2)Χιλή\n3)Βραζιλία\n",
            "Ποιά είναι η περιφέρεια της Γής στον Ισημερινό?\n1)20,000km (12.425 μίλια)\n2)40,000km (24.850 μίλια)\n3)80,000km (49.700 μίλια)\n",
            "Ποιό από τα ακόλουθα είναι το μεγαλύτερο ενεργό ηφαίστειο στον πλανήτη?\n1)Μανούα Λόα\n2)Βεζούβιος\n3)Γκελέρας\n",
    };

    private String[] answersArray = {
            "2",
            "3",
            "1",
            "2",
            "3",
            "1",
            "1",
            "2",
            "2",
            "1",
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
