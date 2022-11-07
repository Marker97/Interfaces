package it.Classes;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Marcus ", "Marziano ", 3462, 2022);
        Professor professor = new Professor("Prof. Mauro ", "Rossi ", 8726, "History");
        Assistant assistant = new Assistant("Giovanni ", "Balduccio ", 4523, false);

        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();

        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }

}