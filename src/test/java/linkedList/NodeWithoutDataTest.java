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
public class NodeWithoutDataTest {
    
    NodeWithoutData node;
    
    public NodeWithoutDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        node = new NodeWithoutData();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of size method, of class NodeWithoutData.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        assertEquals(node.size(), 0);
    }

    /**
     * Test of setNext method, of class NodeWithoutData.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        try {
            node.setNext(null);
        } catch (UnsupportedOperationException e) {
            assertTrue(true);
        }
    }

    /**
     * Test of getNext method, of class NodeWithoutData.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        try {
            node.setNext(null);
        } catch (UnsupportedOperationException e) {
            assertTrue(true);
        }
    }

    /**
     * Test of insertData method, of class NodeWithoutData.
     */
    @Test
    public void testInsertData() {
        System.out.println("insertData");
        NodeWithData previous = new NodeWithData("Data");
        previous.setNext(node);
        node.insertData(previous, "newData");
        assertTrue(previous.size() == 2);
        assertEquals(previous.getNext().getData(), "newData");
    }

    /**
     * Test of getData method, of class NodeWithoutData.
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
     * Test of erase method, of class NodeWithoutData.
     */
    @Test
    public void testErase() {
        System.out.println("erase");
        try {
            node.erase(null);
        } catch (AssertionError e) {
            assertTrue(true); 
        }
    }
    
}
