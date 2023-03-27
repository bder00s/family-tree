package org.example;


public class Main {
    public static void main(String[] args) {

        Person father = new Person("Damon", "van Bergen", 'm', 28);
        Person mother = new Person("Nisha", "Lamichhane", 'f', 30);
        Person child = new Person("Jelmer", "van Bergen", 'm', 11);
        Person child2 = new Person("Anita", "van Bergen", 'f', 15);

        Person grandmother = new Person("Nona", "van Bergen", 'f', 70);
        Person grandfather = new Person("Albertus", "van Bergen", 'm', 75);


        Pet cat = new Pet("Spooky", 7, "british shorthair", mother);
        Pet dog = new Pet("Milly", 14, "mix", null);


        father.addParents(grandfather, grandmother, father);
        child.addParents(father, mother, child);
        child2.addParents(father, mother, child2);

        mother.addChildToChildren(mother, child2);
        father.addChildToChildren(father, child2);

        child.addSibling(child, child2);
        child2.addSibling(child2, child);

        System.out.println("broer/zus van " + child.getName() + " is " + child.getSiblings().get(0).getName());
        System.out.println("broer/zus van " + child2.getName() + " is " + child2.getSiblings().get(0).getName());





        System.out.println(child2.getFather().getName() + " " + child2.getMother().getName());

        System.out.println(child.getFather().getName() + " " + child.getMother().getName());

        child.addPet(child, dog);
        System.out.println(child.getPets().get(0).getName());
        mother.addPet(mother, cat);
        System.out.println(mother.getPets().get(0).getName());

        String outcome = child.getGrandparents(father);
        System.out.println(outcome);


    }
}