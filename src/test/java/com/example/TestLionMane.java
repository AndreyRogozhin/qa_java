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
public class TestLionMane {

    @Parameterized.Parameter(0)
    public String gender;
    @Parameterized.Parameter(1)
    public boolean hasManeExpectedResult;
    Feline feline;

    @Parameterized.Parameters(name = "Тест {index} ")
    public static Object[][] data() {
        return new Object[][]{{"Самец", true}, {"Самка", false},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void runTestHasMane() throws Exception {
        Lion lion = new Lion(gender, feline);
        assertEquals("Неверный ответ!", hasManeExpectedResult, lion.doesHaveMane());

    }
}


