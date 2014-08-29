/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import linkedList.LinkedList;
import java.util.ArrayList;

/**
 *
 * @author fibrizo
 */
public class QueueTest {
    
    Queue queue;
    
    public QueueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        queue = new LinkedList();
    }
    
    @After
    public void tearDown() {
        queue = null;
    }

    /**
     * Test of isEmpty method, of class Queue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        boolean result = queue.isEmpty();
        assertEquals(result, true);
    }

    /**
     * Test of size method, of class Queue.
     */
    @Test
    public void testSizeIsZero() {
        System.out.println("size");
        int result = queue.size();
        assertEquals(result, 0);
    }

    /**
     * Test of add method, of class Queue.
     */
    @Test
    public void testAddOneElementAndCheckIfEmpty() {
        System.out.println("add");
        Object data = 1;
        queue.add(data);
        assertFalse(queue.isEmpty());
        assertEquals(queue.size(), 1);
    }

    /**
     * Test of top method, of class Queue.
     */
    @Test
    public void testTopInEmptyQueueTrhowsException() {
        System.out.println("top");
        Object expResult = null;
        try {
            queue.top();
        } catch (AssertionError e){
            assertTrue(true);
        }
    }

    /**
     * Test of remove method, of class Queue.
     */
    @Test
    public void testRemoveInEmptyQueueThrowsException() {
        System.out.println("remove");
        try {
            queue.remove();
        } catch (AssertionError e){
            assertTrue(true);
        }
    }

    
    
    /**
     * Test add method of class Queue with 100 elements.
     */
    @Test
    public void testAdd1000Elements() {
        System.out.println("Add 1000 elements");
        for(int i = 0; i < 1000; i++) {
            queue.add(i);
        }
        assertFalse(queue.isEmpty());
        assertEquals(queue.size(), 1000);
        for (int i = 0; i < 1000; i++) {
            int value = (int) queue.top();
            assertEquals(value, i);
            queue.remove();
        }
        assertTrue(queue.isEmpty());
    }

    
    /**
     * Test add 3 and remove 2 for 5000 elements and
     * then empty the queue.
     */
    @Test
    public void testAdd3Remove2for6000Elements() {
        System.out.println("Add 6000 elements");
        ArrayList valores = new ArrayList();
        for(int i = 0; i < 6000; i++) {
            valores.add(i);
        }
        
        int j = 0;
        int x = 0;
        while (j < 6000) {
            if (x < 3) {
                queue.add(j);
                j++;
                x++;
            } else {
                for(int i = 0; i < 2; i++) {
                    int value = (int) queue.top();
                    assertEquals(value, (int) valores.get(0));
                    valores.remove(0);
                    queue.remove();
                }
                x = 0; 
            }
        }
        
        while (!queue.isEmpty()) {
            int value = (int) queue.top();
            assertTrue(value != 0);
            queue.remove();
        }
        
        assertTrue(queue.isEmpty());
    }
}
