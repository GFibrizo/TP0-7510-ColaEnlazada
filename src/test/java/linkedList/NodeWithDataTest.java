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
public class NodeWithDataTest {
    
    NodeWithData node;
    
    public NodeWithDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        node = new NodeWithData("data");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNext method, of class NodeWithData.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        Node result = node.getNext();
        assertTrue(result != null);
    }

    /**
     * Test of setNext method, of class NodeWithData.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        Node next = new NodeWithData("nextData");
        node.setNext(next);
        assertTrue(node.size() == 2);
        assertTrue(node.getNext().getClass() == NodeWithData.class);
    }

    /**
     * Test of setData method, of class NodeWithData.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        node.setData("differentData");
        assertEquals("differentData", node.getData());
    }

    /**
     * Test of size method, of class NodeWithData.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        assertEquals(node.size(), 1); 
        node.setNext(new NodeWithData("newData"));
        assertEquals(node.size(), 2);
    }

    /**
     * Test of insertData method, of class NodeWithData.
     */
    @Test
    public void testInsertData() {
        System.out.println("insertData");
        NodeWithData previous = new NodeWithData("nothing");
        String str = "NewData";
        node.insertData(previous, str);
        assertEquals(node.getNext().getData(), str);
        
    }

    /**
     * Test of getData method, of class NodeWithData.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        String str = "Data";
        node.setData(str);
        assertEquals(node.getData(), str);
    }

    /**
     * Test of erase method, of class NodeWithData.
     */
    @Test
    public void testErase() {
        NodeWithData previous = new NodeWithData("First");
        previous.setNext(node);
        NodeWithData next = new NodeWithData("Last");
        node.setNext(next);
        node.erase(previous);
        assertEquals(node.size(), 2);
    }
    
}
