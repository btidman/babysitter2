package com.pillartechnology.babysitter2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Babysitter2ControllerTest {

    private Babysitter2Controller controller;

    @Before
    public void setup(){
        controller = new Babysitter2Controller();
        controller.setBabysitterName("Mitch");
    }

    @Test
    public void shouldReturnBabysitterName(){
        String actual = controller.returnTrue();

        assertThat(actual, is("Mitch"));
    }

}