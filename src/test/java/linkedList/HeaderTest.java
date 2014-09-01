/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fibrizo
 */
public class HeaderTest {
    
    Node node = new Header();
    
    public HeaderTest() {
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
        node = null;
    }

    /**
     * Test of size method, of class Header.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        assertEquals(node.size(), 0);
    }

    /**
     * Test of insertData method, of class Header.
     */
    @Test
    public void testInsertData() {
        System.out.println("insertData");
        node.insertData(null, "Data");
        assertEquals(node.size(), 1);
        assertEquals(node.getNext().getData(), "Data");
    }

    /**
     * Test of getData method, of class Header.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        try {
            node.getData();
        } catch (AssertionError e) {
            assertTrue(true);
        }
    }

    /**
     * Test of getNext method, of class Header.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        assertTrue(node.getNext() != null);
        assertEquals(node.getNext().getClass(), NodeWithoutData.class);
    }

    /**
     * Test of setNext method, of class Header.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        Node next = new NodeWithData("newData");
        node.setNext(next);
        assertTrue(node.getNext() != null);
        assertEquals(node.getNext().getClass(), NodeWithData.class);
        assertEquals(node.getNext().getData(), "newData");
    }
    
}
