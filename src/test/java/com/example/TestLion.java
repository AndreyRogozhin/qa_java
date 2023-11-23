package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestLion {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void runTestLionGetException() {
        Feline feline = new Feline();
        assertThrows("Используйте допустимые значения пола животного - самец или самка", Exception.class, () -> new Lion("Львенок", feline));
    }

    @Test
    public void testLionGetKittens() throws Exception {
        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);

        Lion lion = new Lion("Самец", felineSpy);
        Lion lionSpy = Mockito.spy(lion);

        int result = lionSpy.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens();

    }

    @Test
    public void runLionTestEatMeat() throws Exception {
        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);

        Lion lion = new Lion("Самец", felineSpy);
        Lion lionSpy = Mockito.spy(lion);

        lionSpy.getFood();
        Mockito.verify(felineSpy, Mockito.times(1)).getFood("Хищник");

    }
}

