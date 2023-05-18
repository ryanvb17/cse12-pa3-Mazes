/*
 * Class to implement SearchWorklist as a Stack and a Queue.
 * You can use any built-in Java collections for this class.
 */
import java.util.*;



class StackWorklist implements SearchWorklist {
	Stack<Square> s;
	
	public StackWorklist() { s = new Stack<Square>();}
	public void add(Square c) { s.push(c);}
	public Square remove() { return s.pop();}
	public boolean isEmpty() { return s.size() <= 0;}
}

class QueueWorklist implements SearchWorklist {
	Queue<Square> q;
	
	public QueueWorklist() { q = new LinkedList<Square>();}
	public void add(Square c) { q.add(c);}
	public Square remove() { return q.remove();}
	public boolean isEmpty() { return q.size() <= 0;}
}

public interface SearchWorklist {
	void add(Square c);
	Square remove();
	boolean isEmpty();
}

