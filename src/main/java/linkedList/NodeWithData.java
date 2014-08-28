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
public class NodeWithData implements Node {
    
    private Node next = new NodeWithoutData();
    private Object data = null;
    
    
    public NodeWithData(Object data) {
        this.data = data;
    }
    
    @Override
    public Node getNext() {
        return next;
    }

    @Override
    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
    @Override
    public int size() {
      return (1 + next.size());  
    }
    
    @Override
    public void insertData(Node previous, Object data) {
        next.insertData(this, data);
    }
    
    @Override
    public Object getData() {
        return next.getData();
    }
    
}
