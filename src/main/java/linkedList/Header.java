/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedList;

/**
 *
 * @author fibrizo
 */
public class Header implements Node {

    private Node node;
    private Node next;
    
    public Header() {
        next = new NodeWithoutData();
    }
    
    @Override
    public int size() {
        return (0 + next.size());
    }

    public void insertData(Node previous, Object data) {
        next.insertData(this, data);
    }

    @Override
    public Object getData() {
        throw new AssertionError("There are no elements");
    }

    @Override
    public Node getNext() {
        throw new AssertionError("There are no elements");
    }

    @Override
    public void setNext(Node next) {
        throw new UnsupportedOperationException("Not supported operation");
    }
    
}