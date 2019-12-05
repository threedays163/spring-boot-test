package org.example;

import org.example.properties.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class})
public class SpringTest {

    @Autowired
    Student student;

    @Test
    public void test1(){
        System.out.println(student);
    }

    @Test
    public void test2(){

    }

}
