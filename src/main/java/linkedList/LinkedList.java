/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedList;
import queue.Queue;

/**
 *
 * @author fibrizo
 */
public class LinkedList implements Queue {
    
    private Node first;
    
    public LinkedList() {
        first = new Header();
    }
    
    @Override
    public boolean isEmpty() {
        return (first.size() == 0);
    }
    
    @Override
    public int size() {
        return first.size();
    }
    
    @Override
    public void add(Object data) {
        first.insertData(null, data);
    }
    
    @Override
    public Object top() {
        return (first.getNext()).getData();
    }
    
    @Override
    public void remove() {
        
    }
}
