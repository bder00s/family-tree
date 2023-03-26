package org.example;


public class Main {
    public static void main(String[] args) {

Person father = new Person("Damon", "van Bergen", 'm', 28 );
Person mother = new Person("Nisha", "Lamichhane", 'f', 30);
Person child = new Person("Jelmer", "Agricola", 'm',11);

child.addParents(father, mother, child);

        System.out.println(child.getFather().getName());
        System.out.println(child.getMother().getName());
//        System.out.println(mother.getChildren().get(0).getName());
//        System.out.println(father.getChildren().get(0).getName());

    }
}