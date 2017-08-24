package com.avenger.demo.builder;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testBuildPerson(){
        Person person = new Person.Builder().name("jim").age(12).gender(true).build();
        Assert.assertEquals(person.getName(), "jim");
        Assert.assertEquals(person.getAge(), 12);
        Assert.assertEquals(person.getGender(), true);
    }
}
