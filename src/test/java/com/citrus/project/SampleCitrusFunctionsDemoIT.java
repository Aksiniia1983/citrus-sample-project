package com.citrus.project;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import org.testng.annotations.Test;

@Test
public class SampleCitrusFunctionsDemoIT extends TestNGCitrusTestRunner {

    @CitrusTest
    public void testStringFunctions(){

        variable("uname", "Aksiniia Ielchaninova");
        echo("My name is citrus:substring(${uname},0,8)");
        echo("citrus:concat(My name is ${uname})");
        echo("${uname} has length => citrus:stringLength(${uname})");
    }

    @CitrusTest
    public void testNumberFunctions(){


        echo("citrus:maximum(12,0,8)");
        echo("citrus:sum(1,2,3,4,5,6, 7)");
        echo("citrus:randomNumber(2)");
    }

    @CitrusTest
    public void testJsonFunctions(){
        variable("person", "{\"name\":\"ksusha\", \"city\":\"kyiv\"}");
        echo("JSon object => ${person}");
        echo("Name: citrus:jsonPath(${person}, '$.city ')");
    }

}
