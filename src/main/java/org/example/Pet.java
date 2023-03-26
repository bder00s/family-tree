package org.example;

public class Pet {
// VARIABELEN
    private String name;
    private int age;
    private String species;
    Person owner;

//CONSTRUCTOR
    public Pet(String name, int age, String species, Person owner) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.owner = owner;
    }

    //GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }


}
