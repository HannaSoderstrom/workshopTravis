package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {
    @Test
    public void testAdd() {
        List l = new List();
        l.add(1);                        // Call method to test
        assertTrue(l.getLength() == 1);  // The logical check
    }

    @Test
    public void testRemove() {
        List l = new List();
        l.add(3);
        int i = l.remove();
        assertEquals(3,i);
        assertTrue(l.getLength() == 0);

    }

    @Test
    public void testGet() {
        List l = new List();
        l.add(3);
        l.add(2);
        l.add(7);
        l.add(9);
        l.add(1);

        int i = l.get(2);

        assertEquals(7,i);
    }

    /*@Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
        // Get a list then ...

        list.get(-1); // Exception!!!
    }*/

    @BeforeClass
    public static void beforeClass(){  //First of all
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){  // Last of all
        System.out.println("After class");
    }

    @Before
    public void before(){  //Before each test method
        System.out.println("Before");
    }

    @After
    public void after(){  //After each test method
        System.out.println("After");
    }

}
