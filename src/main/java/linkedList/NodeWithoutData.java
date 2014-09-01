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
public class NodeWithoutData implements Node {
    
    public NodeWithoutData() {
    }
    
    @Override
    public int size() {
      return 0;  
    }
    
    @Override
    public void setNext(Node next) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("This node can't have next");
    }
    
    @Override
    public Node getNext() {
        throw new UnsupportedOperationException("This node doesn't have next");
    }
       
    @Override
    public void insertData(Node previous, Object data) {
        previous.setNext(new NodeWithData(data));
    }
    
    @Override
    public Object getData() {
        throw new AssertionError("This node has no data");
    }
    
    @Override
    public void erase(Node previous) {
        throw new AssertionError("There are no elements to remove");
    }

}
