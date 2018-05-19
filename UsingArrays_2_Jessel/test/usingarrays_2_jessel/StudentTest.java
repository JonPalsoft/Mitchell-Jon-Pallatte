/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingarrays_2_jessel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mitchellpallatte
 */
public class StudentTest {
    
    public StudentTest() {
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

    /**
     * Test of setStudentNumber method, of class Student.
     */
    @Test
    public void testSetStudentNumber() {
        System.out.println("setStudentNumber");
        String strNewStudentNumber = "";
        Student instance = new Student();
        instance.setStudentNumber(strNewStudentNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentNumber method, of class Student.
     */
    @Test
    public void testGetStudentNumber() {
        System.out.println("getStudentNumber");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getStudentNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String strNewName = "";
        Student instance = new Student();
        instance.setName(strNewName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourse method, of class Student.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        String strNewCourse = "";
        Student instance = new Student();
        instance.setCourse(strNewCourse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourse method, of class Student.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
