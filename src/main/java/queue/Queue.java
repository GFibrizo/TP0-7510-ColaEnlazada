/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue;

/**
 *
 * @author fibrizo
 */
public interface Queue {
    boolean isEmpty();
    int size();
    void add(Object data);
    Object top();
    void remove();
}
