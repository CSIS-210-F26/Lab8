/**
 * Implements a generic queue.
 * 
 * @author (names)
 * @version (date)
 */
public class Queue<E> implements QueueInterface<E>
{
    private class Node<E>
    {
        private E value;
        private Node<E> next;
        private Node<E> previous;

        public Node(E value, Node<E> next)
        {
            this.value = value;
            this.next = next;
            this.previous = null;
        }
    }

    private Node<E> head;
    private Node<E> tail;

    public Queue()
    {
        head = null;
        tail = null;
    }
}
