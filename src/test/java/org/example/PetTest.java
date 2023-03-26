package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {
Pet spooky;
Person bonne;

    @BeforeEach
    void setUp() {
        spooky = new Pet("Spooky", 7, "british shorthair", bonne);
        bonne = new Person("Bonne", "de Roos", 'f', 30);
    }

    @Test
    void getName() {
        //arrange

        //act
        String outcome = spooky.getName();

        //assert
        assertEquals("Spooky", outcome);
    }

    @Test
    void setName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void getSpecies() {
    }

    @Test
    void setSpecies() {
    }

    @Test
    void getOwner() {
    }

    @Test
    void setOwner() {
    }
}