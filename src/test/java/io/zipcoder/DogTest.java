package io.zipcoder;

import io.zipcoder.Pets.Dog;
import io.zipcoder.Pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speak() {
        Pet dog = new Dog("fluffy");

        String expected = "woof";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);


    }
}