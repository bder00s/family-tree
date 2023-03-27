package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Person {
    //VARIABELEN
    private String name;
    private String middleName;
    private String lastName;
    private char sex;
    private int age;
    Person mother;
    Person father;
    ArrayList<Person> siblings;
    ArrayList<Person> children;
    ArrayList<Pet> pets;

    //CONSTRUCTOR 1
    public Person(String name, String lastName, char sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    //CONSTRUCTOR 2
    public Person(String name, String middleName, String lastName, char sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    //METHODS
    public void addParents(Person father, Person mother, Person child) {
        child.setFather(father);
        child.setMother(mother);
        father.addChildToChildren(child, father);
        mother.addChildToChildren(child, mother);
    }

    public void addChildToChildren(Person parent, Person child) {
        ArrayList<Person> kids = new ArrayList<>();
        if (parent.getChildren() != null) {
            for (Person person : parent.getChildren()) {
                kids.add(person);
            }
        }
        kids.add(child);
        parent.setChildren(kids);
    }

    public String getGrandchildren(Person child) {
        ArrayList<Person> grandchildren = new ArrayList<>();
        String outcome = null;
        grandchildren = child.getChildren();
        if(grandchildren.size() > 0 ){
            for (int i = 0; i < grandchildren.size(); i++) {
               outcome = grandchildren.get(i).getName() + " ";
            }
        } else {
            outcome = child.getChildren().get(0).getName();
        }
        return outcome;
    }

    public String getGrandparents(Person parent){
        return   parent.getFather().getName() + " and " + parent.getMother().getName();
    }

    public void addPet(Person person, Pet pet) {
        ArrayList<Pet> pets = new ArrayList<>();
        if (person.getPets() != null) {
            pets.addAll(person.getPets());
        }
        pets.add(pet);
        person.setPets(pets);
    }

    public void addSibling(Person person, Person sibling) {
        ArrayList<Person> family = new ArrayList<>();
        if (person.getSiblings() != null) {
            for (Person people : person.getSiblings()) {
                family.add(people);
            }
        }
        family.add(sibling);
        person.setSiblings(family);
    }


    //GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }


    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
}
