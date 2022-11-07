package it.Classes;

import it.Interfaces.LearningPerson;
import it.Interfaces.TeachingPerson;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
    public boolean isGoingToBeAPhD;
    public Assistant(String name, String surname, int numericId, boolean isGoingToBeAPhD) {
        super(name, surname, numericId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("The Assistant " + this.name + " " + this.surname + " " + "study at home.");

    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("The Assistant " + this.name + " " + this.surname + " " + "learn a lesson.");
    }
}
