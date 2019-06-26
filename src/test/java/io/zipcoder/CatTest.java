package io.zipcoder;

import io.zipcoder.Pets.Cat;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void speak() {
        Pet cat = new Cat("Garfield");

        String expected = "meow";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
}
}