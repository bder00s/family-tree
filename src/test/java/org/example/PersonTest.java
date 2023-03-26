package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person father;
    Person mother;
    Person child;

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

        //assert
    }

    @Test
    void addPet() {
    }

    @Test
    void addSibling() {
    }

    @Test
    void getName() {
        //arrange//////////

        //act///////////
        String outcome = father.getName();
        //assert//////////
        assertEquals("vader", outcome);

    }


}