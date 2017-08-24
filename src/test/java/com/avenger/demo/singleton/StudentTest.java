package com.avenger.demo.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class StudentTest {

    @Test
    public void testCreateStudent(){

        Student student = Student.getInstance();
        Assert.assertTrue(!Objects.isNull(student));
    }
}
