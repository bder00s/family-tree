package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person father;
    Person mother;
    Person child;

    Person grandfather;
    Person grandmother;

    @BeforeEach
    void beforeEachTest() {
        father = new Person("vader", "Kok", 'm', 30);
        mother = new Person("moeder", "Kok", 'f', 30);
        child = new Person("kind", "Kok", 'm', 10);
    }

    @Test
    void addParents() {
        //arrange
        //Dit wordt al geregeld door de beforeEachTest()

        //act
        child.addParents(father, mother, child);

        //assert
        assertEquals("vader", child.getFather().getName());
        assertEquals("moeder", child.getMother().getName());
    }

    @Test
    void addChildToChildren() {
        //arrange

        //act
        mother.addChildToChildren(mother, child);
        father.addChildToChildren(father, child);

        //assert
        assertEquals("kind", mother.getChildren().get(0).getName());
        assertEquals("kind", father.getChildren().get(0).getName());
    }

    @Test
    void addPet() {
        //arrange
        Pet cat = new Pet("Ollie", 3, "british shorthair", null);

        //act
        mother.addPet(mother, cat);

        //assert
        assertEquals("Ollie", mother.getPets().get(0).getName());
    }

    @Test
    void addSibling() {
        //arrange
        Person sister = new Person("zus", "Kok", 'f', 15);
        //act
        child.addSibling(child, sister);
        child.addSibling(sister, child);
        //assert
        assertEquals("zus", child.getSiblings().get(0).getName()
        );
        assertEquals("kind", sister.getSiblings().get(0).getName());
    }

    @Test
    void getGrandparents(){
        //arrange
        grandfather = new Person("Albertus", "van Bergen", 'm', 75);
        grandmother = new Person("Nona", "van Bergen", 'f', 70);

        father.addParents(grandfather, grandmother, father);
        child.addParents(father, mother, child);
        grandfather.addChildToChildren(grandfather, father);
        grandmother.addChildToChildren(grandmother, father);
        father.addChildToChildren(father, child);

        //act
       child.getGrandparents(father);
        //assert
     assertEquals("Albertus and Nona",child.getGrandparents(father) );
    }

    @Test
    void getGrandchildren(){
        //arrange
        grandfather = new Person("Albertus", "van Bergen", 'm', 75);
        grandmother = new Person("Nona", "van Bergen", 'f', 70);
        father.addParents(grandfather, grandmother, father);
        child.addParents(father, mother, child);
        grandfather.addChildToChildren(grandfather, father);
        grandmother.addChildToChildren(grandmother, father);
        father.addChildToChildren(father, child);

        //act
        grandfather.getGrandchildren(father);


        //assert
         assertEquals("kind", grandfather.getGrandchildren(father));
    }

}