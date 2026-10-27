/**
 * This is the public interface for a stack.
 * 
 * @author Prof. White
 * @version Fall 2026
 */
public interface StackInterface<E>
{
    void push(E element);
    E pop();
    E peek();
    boolean isEmpty();
    void clear();
}
