/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafall2017;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camma
 */
public class Javafall2017Test {
    
    public Javafall2017Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

@Test
    public void TestingCreateNewDatabase() {
        Javafall2017 app = new Javafall2017();
        app.createNewDatabase();
    }
    
    @Test
    public void TestingCreateNewTable() {
        Javafall2017 app = new Javafall2017();
        app.createNewTable();
    }
    
    @Test
    public void TestingInsert() {
        Javafall2017 app = new Javafall2017();
        app.insert("Dr. Seuss", 5);
        app.PrintTable();
    }
}
