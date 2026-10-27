/**
 * This is the public interface for a queue.
 * 
 * @author Prof. White
 * @version Fall 2026
 */
public interface QueueInterface<E>
{
    void enqueue(E element);
    E dequeue();
    E getFront();
    boolean isEmpty();
    void clear();
}
