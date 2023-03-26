package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void addParents() {
    }

    @Test
    void addChildToChildren() {
    }

    @Test
    void addPet() {
    }

    @Test
    void addSibling() {
    }

    @Test
    void getName(){
        //arrange//////////
        Person persoon1 = new Person("Bonne", "de Roos", 'v', 30);
        //act///////////
        String outcome = persoon1.getName();
        //assert//////////
        assertEquals("Bonne", outcome);

    }
}