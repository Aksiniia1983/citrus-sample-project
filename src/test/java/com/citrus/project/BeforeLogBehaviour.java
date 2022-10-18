package com.citrus.project;

import com.consol.citrus.dsl.runner.AbstractTestBehavior;

public class BeforeLogBehaviour extends AbstractTestBehavior {
    @Override
    public void apply() {
        echo("Before the actions execute citrus:currentDate()");
    }
}
