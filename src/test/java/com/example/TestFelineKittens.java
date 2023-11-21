
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

@RunWith(Parameterized.class)
public class TestFelineKittens {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Spy
    Feline feline;

    @Parameterized.Parameter(0)
    public int kittensExpected;
    @Parameterized.Parameter(1)
    public int kittensResult;

    @Parameterized.Parameters(name = "Тест {index}")
    public static Object[][] data() {
        return new Object[][]{
                {-1, 1},
                {1, 1},
                {3, 3},
                {0, 0},
        };
    }


    @Test
    public void runTestGetKittens() {
        if (kittensExpected == -1) {
            int result = feline.getKittens();
            Mockito.verify(feline, Mockito.times(1)).getKittens(1);
        }
    else
    {
        Assert.assertEquals(kittensExpected, feline.getKittens(kittensResult));
    }
}
}

