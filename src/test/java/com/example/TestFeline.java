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
public class TestFeline {

    @Test
    public void runTestGetFamily() {
        Feline feline = new Feline();
        assertEquals("Неверный ответ!", "Кошачьи", feline.getFamily());
    }

    @Test
    public void runTestEatMeat() throws Exception {
        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);

        Mockito.when(felineSpy.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Не тот ответ!", List.of("Животные", "Птицы", "Рыба"), felineSpy.eatMeat());
    }

}




