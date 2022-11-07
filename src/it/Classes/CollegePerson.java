package it.Classes;

public class CollegePerson  {
    public String name;
    public String surname;
    public int numericId;

    public CollegePerson(String name, String surname, int numericId){
        this.name = name;
        this.surname = surname;
        this.numericId = numericId;
    }

    public void goToCollege() {
        System.out.println("Name: " + this.name + "Surname: " + this.surname + "Numeric ID: " + this.numericId);
    }
}
