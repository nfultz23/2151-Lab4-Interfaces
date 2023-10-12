//package com.gradescope.DoubleQueue.code;

/**ArrayDoubleQueueContract
 * Array implementation for the Double queue.
 *
 * @invariant: queueMaxSize > 0
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue<T> implements IDoubleQueue<T>
{
    private Object[] queue;
    private int queueMaxSize;

    /**ArrayDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue.
     *
     * @param maxSize max size of the array
     *
     * @pre maxSize > 0
     *
     * @post queueMaxSize = maxSize AND self = new Double[queueMaxSize].
     *
     */
    public ArrayDoubleQueue(int maxSize)
    {
        queueMaxSize = maxSize;
        //queue = new T[queueMaxSize];
        queue = new Object[queueMaxSize];
    }

    /**enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the Double to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(T val)
    {
        int index = 0;

        while (index < queueMaxSize - 1 && queue[index] != null) {
            index++;
        }

        queue[index] = val;

    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public T dequeue()
    {
        int index = 1;

        if (queue.length != 0) {
            T dequeued = (T) queue[0];
            while (index < queueMaxSize && queue[index] != null) {
                queue[index - 1] = queue[index];
                index++;
            }
            queue[index - 1] = null;
                return dequeued;  
        } 
        else {
            return null;
        }

    }

    @Override
    public int length()
    {
        int index = 0;

        while (index < queueMaxSize && queue[index] != null) {
            index++;
        }
        return index;
    }

    public String toString()
    {
        String outString = "";
        int index = 0;
        while(index < this.queueMaxSize) {
            outString += "[";
            outString += queue[index++];
            if (index  == this.queueMaxSize) {
                outString += "]";

            }
            else {
                outString += "] ";
            }

        };
        return outString;

    }

    //-----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize()
    {
        return this.queueMaxSize;
    }

    public T[] getQueue()
    {
        return (T[]) this.queue;
    }
}
