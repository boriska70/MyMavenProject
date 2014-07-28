package com.hp.devops;/**
 * Created with IntelliJ IDEA.
 * User: belozovs
 * Date: 7/28/14
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */

import org.junit.*;

import static junit.framework.Assert.*;


public class MainTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMain() throws Exception {

        MainClass mainClass = new MainClass();
        float result = mainClass.divide(10,2);
        assertEquals(5f, result);

    }

}
