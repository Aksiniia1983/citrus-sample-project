package com.citrus.project;

import com.citrus.utils.LoggingService;
import com.consol.citrus.actions.AbstractTestAction;
import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.context.TestContext;
import com.consol.citrus.dsl.testng.TestNGCitrusTestDesigner;
import org.testng.annotations.Test;
@Test
public class SampleJavaIDesignerDrawbackIT extends TestNGCitrusTestDesigner {

    LoggingService obj = new LoggingService();

    @CitrusTest
    public void testLogService(){

        echo("Before log called");
        action(new AbstractTestAction() {
            @Override
            public void doExecute(TestContext testContext) {
                obj.logs("Logs will be printed");
            }
        });
        echo("After log called");

    }





}
