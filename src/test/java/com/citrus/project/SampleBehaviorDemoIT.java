package com.citrus.project;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import org.testng.annotations.Test;

@Test
public class SampleBehaviorDemoIT extends TestNGCitrusTestRunner {

    @CitrusTest
    public void test1(){

        applyBehavior(new BeforeLogBehaviour());
        echo("The test case started for Test1...");
        applyBehavior(new AfterLogBehaviour());


    }

    @CitrusTest
    public void test2(){

        applyBehavior(new BeforeLogBehaviour());
        echo("The test case started for Test2...");
        applyBehavior(new AfterLogBehaviour());


    }


}
