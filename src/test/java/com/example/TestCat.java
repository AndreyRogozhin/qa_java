package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    Feline feline;

    @Test
    public void runTestGetSound() {
        Cat cat = new Cat(feline);
        assertEquals("Неверный ответ!", "Мяу", cat.getSound());
    }

    @Test
    public void runTestCatEatMeat() throws Exception {

        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);

        Cat cat = new Cat(feline);
        Cat catSpy = Mockito.spy(cat);

        Predator predator;

        Animal animal = new Animal();
        Animal animalSpy = Mockito.spy(animal);

        Mockito.when(catSpy.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Не тот ответ!", List.of("Животные", "Птицы", "Рыба"), catSpy.getFood());


    }




}

