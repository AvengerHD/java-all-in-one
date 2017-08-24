package com.avenger.demo.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class TeacherTest {

    @Test
    public void testCreateTeacher(){
        Teacher teacher = Teacher.INSTANCE;
        Assert.assertTrue(!Objects.isNull(teacher));
    }
}
