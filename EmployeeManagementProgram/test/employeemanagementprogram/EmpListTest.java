/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employeemanagementprogram;

import java.util.Comparator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexanderegan
 */
public class EmpListTest {
    
    public EmpListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sort method, of class EmpList.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        Comparator c = null;
        EmpList instance = new EmpList();
        instance.sort(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printAll method, of class EmpList.
     */
    @Test
    public void testPrintAll() {
        System.out.println("printAll");
        EmpList instance = new EmpList();
        instance.printAll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printManagers method, of class EmpList.
     */
    @Test
    public void testPrintManagers() {
        System.out.println("printManagers");
        EmpList instance = new EmpList();
        instance.printManagers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printSalaried method, of class EmpList.
     */
    @Test
    public void testPrintSalaried() {
        System.out.println("printSalaried");
        EmpList instance = new EmpList();
        instance.printSalaried();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printHourly method, of class EmpList.
     */
    @Test
    public void testPrintHourly() {
        System.out.println("printHourly");
        EmpList instance = new EmpList();
        instance.printHourly();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeOvertimeRate method, of class EmpList.
     */
    @Test
    public void testChangeOvertimeRate() {
        System.out.println("changeOvertimeRate");
        double aRate = 0.0;
        EmpList instance = new EmpList();
        instance.changeOvertimeRate(aRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeHourlyRate method, of class EmpList.
     */
    @Test
    public void testChangeHourlyRate() {
        System.out.println("changeHourlyRate");
        double aRate = 0.0;
        EmpList instance = new EmpList();
        instance.changeHourlyRate(aRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class EmpList.
     */
    @Test
    public void testAdd_Manager() {
        System.out.println("add");
        Manager m = null;
        EmpList instance = new EmpList();
        instance.add(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class EmpList.
     */
    @Test
    public void testAdd_Salaried() {
        System.out.println("add");
        Salaried s = null;
        EmpList instance = new EmpList();
        instance.add(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class EmpList.
     */
    @Test
    public void testAdd_Hourly() {
        System.out.println("add");
        Hourly h = null;
        EmpList instance = new EmpList();
        instance.add(h);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class EmpList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Employee e = null;
        EmpList instance = new EmpList();
        instance.remove(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
