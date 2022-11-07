package it.Classes;

import it.Interfaces.TeachingPerson;

public class Professor extends CollegePerson implements TeachingPerson {

      public String teachingSubject;

    public Professor(String name, String surname, int numericId, String teachingSubject){
       super(name,surname,numericId);
       this.teachingSubject = teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println(this.name + " " + surname + " " + "teaching students.");

    }
}

