package com.citrus.project;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import org.testng.annotations.Test;

@Test
public class SampleVariableDemo extends TestNGCitrusTestRunner {

    @CitrusTest
    public void testVariable1(){

        variable("email", "aksiniia@gmail.com");
        echo("Email Variable declared locally ${email}");
        echo("Global variable ${//project.name//} :-> ${project.name}");
        echo("Global variable ${//test.author//} :-> ${test.author}");
    }

    @CitrusTest
    public void testVariable2(){
       // echo("Email Variable declared locally ${email}");
        echo("Global variable ${//project.name//} :-> ${project.name}");
        echo("Global variable ${//test.author//} :-> ${test.author}");
    }



}
