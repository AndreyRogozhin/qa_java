package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class TestFelineGetKittens {

    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void runTestFelineGetKittens() throws Exception {
        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);
        int result = felineSpy.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);

    }
}
