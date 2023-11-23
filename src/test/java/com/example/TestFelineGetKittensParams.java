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
public class TestFelineGetKittensParams {

    @Parameterized.Parameter(0)
    public int kittensExpected;
    @Parameterized.Parameter(1)
    public int kittensResult;

    Feline feline;

    @Parameterized.Parameters(name = "Тест {index}")
    public static Object[][] data() {
        return new Object[][]{
                {1, 1},
                {3, 3},
                {0, 0},
        };
    }


    @Test
    public void runTestGetKittensParams() {
        Feline feline = new Feline();
        Assert.assertEquals(kittensExpected, feline.getKittens(kittensResult));
    }
}

