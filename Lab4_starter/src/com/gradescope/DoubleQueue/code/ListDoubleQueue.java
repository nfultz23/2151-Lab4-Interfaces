/*
 *Rowan Froeschner
 *Ryan Pisciotti
 *Noah Fultz
 */

package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**ListDoubleQueueContract
 *
 *
 * @invariant: maxListSize > 0 AND LQueue.size() <= maxListSize
 *
 * @corresponds: queue_max_size = maxListSize
 *
 */
public class ListDoubleQueue implements IDoubleQueue {
    private ArrayList<Double> LQueue;
    private int maxListSize;

    /**ListDoubleQueueConstructorContact
     *
     *
     * @param maxSize
     *
     * @pre maxsize > 0
     *
     * @post maxListSize = maxSize AND self = new ArrayList<Double>();
     *       (input value becomes maximum list size and the LQueue member is a new and empty ArrayList<Double> object
     *
     */
    public ListDoubleQueue(int maxSize) {
        this.LQueue = new ArrayList<Double>();
        this.maxListSize = maxSize;
    }

    /**enqueueContact
     *
     *
     * @param val
     *
     * @pre none
     *
     * @post self = #self, except an item is appended to the ArrayList, but if the queue has reached its maximum size,
     *         then the final value of the list is changed to the enqueued value. 
     *         maxListSize = #maxListSize
     *
     */
    @Override
    public void enqueue(Double val) {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize-1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue() {
        return LQueue.remove(0);
    }


    @Override
    public int length() {
        return LQueue.size();
    }


    public String toString() {
        String ret = "";
        for(Double d : LQueue) {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

}
