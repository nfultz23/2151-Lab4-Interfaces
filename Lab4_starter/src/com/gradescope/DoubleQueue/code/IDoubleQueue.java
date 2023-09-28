package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures: Creates a queue that contains maxsize amount of empty positions that can fit in the queue.
 *
 *@defines: Array of Doubles called queue and int queueMaxSize for maximum size the array can be.
 *
 *@constraints: 0 < length < queueMaxSize, cant be empty for dequeue, can't be full for enqueue
 *
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     * This function remove an item from the beginning of the queue.
     *
     *@return returns the double's value that gets removed from the queue
     *
     *@pre length > 0
     *
     *@post The function will go to the first index in the queue and return it.
     * Then loop through pushing every index back 1, which removes the first index.
     * New state is everyt index pushed left one and returned index gets removed.
     */
    public Double dequeue();

    /**lengthContract
     * This function determines what the length of the queue is.
     *
     *@return returns and integer representing how many different values are in the queue
     *
     *@pre none
     *
     *@post Index gets returned representing length.
     * Loops through the array until it reaches null, meaning empty index, and increments amount of times it looped.
     * Returns the number of times looped, state of object remains name.
     */
    public int length();

    /**toStringContract
     *  This function returns the queue values in form of a string.
     *
     *@return Returns a string formatted [1][2][3]... where the numbers represent the values in the queue.
     *
     *@pre length must be > 0 but < maxsize
     *
     *@post Program loops through the queue and each iteration print "[" then "queue[index]" then "]"
     * It adds all of these to a string and once all iterations complete, returns the complete string.
     * State of the queue is unchanged.
     */
    public String toString();
}
