package com.citrus.project;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.junit.JUnit4CitrusTestDesigner;
import org.junit.Test;

public class SampleJavaJunit4 extends JUnit4CitrusTestDesigner {

    @Test
    @CitrusTest
    public void sayHelloFromJunit(){

        echo("Say Hello From Junit4");

    }



}
