package com.citrus.project;

import com.consol.citrus.dsl.runner.AbstractTestBehavior;

public class AfterLogBehaviour extends AbstractTestBehavior {
    @Override
    public void apply() {
        echo("After  the actions execute citrus:currentDate()");
    }
}
