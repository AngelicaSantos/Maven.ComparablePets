package io.zipcoder;

import io.zipcoder.Pets.Bird;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void speak() {
        Pet bird = new Bird("lucy");

        String expected = "whaddup";
        String actual = bird.speak();

        Assert.assertEquals(expected,actual);

    }
}