package com.citrus.project;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestDesigner;
import com.consol.citrus.http.client.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class SampleHttpsRestDemo extends TestNGCitrusTestDesigner {

    @Autowired
    HttpClient customerClient;
    @Test
    @CitrusTest
    public void testGetAllCustomers(){


    }


}
