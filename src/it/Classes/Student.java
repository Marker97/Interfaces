package it.Classes;

import it.Interfaces.LearningPerson;

public class Student extends CollegePerson implements LearningPerson {

      public int academicYear;

    public Student(String name, String surname, int numericId, int year){
       super(name,surname,numericId);
       this.academicYear = academicYear;
    }

    @Override
    public void studyAtHome() {
        System.out.println("The Student " + this.name + " " + this.surname + " " + "study at home.");
    }
}

