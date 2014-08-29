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
public interface Node {
    
    
    public int size();
    
    public void insertData(Node previous, Object data);
    
    public Object getData();
    
    public Node getNext();
    
    public void setNext(Node next);
    
    public void erase(Node previous);

}
