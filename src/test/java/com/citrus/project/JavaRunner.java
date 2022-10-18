package com.citrus.project;

import com.citrus.utils.LoggingService;
import com.consol.citrus.actions.AbstractTestAction;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.context.TestContext;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import org.testng.annotations.Test;

@Test
public class JavaRunner extends TestNGCitrusTestRunner {

    LoggingService obj = new LoggingService();

    @CitrusTest
    public void testLogService(){

        echo("Before log called...");

        obj.logs("Logs will be printed...");

        echo("After log called...");

    }


}
