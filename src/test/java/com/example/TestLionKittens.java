
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

public class TestLionKittens {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetLionKittens() throws Exception {
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

