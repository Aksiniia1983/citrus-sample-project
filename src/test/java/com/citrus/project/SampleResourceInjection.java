package com.citrus.project;

import com.consol.citrus.annotations.CitrusResource;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.design.TestDesigner;
import com.consol.citrus.dsl.junit.JUnit4CitrusTest;
import org.junit.Test;
import org.testng.TestRunner;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class SampleResourceInjection extends JUnit4CitrusTest {

    @CitrusTest
    @Test
    public void injectDesigner(@CitrusResource TestDesigner designer){

        designer.echo("Before");
        System.out.println("It's a print statement");
        designer.echo("After");

    }

//    @CitrusTest
//    @Test@Parameters("runner")
//    public void injectRunner(@Optional @CitrusResource TestRunner testRunner){
//
//
//
//    }
}
