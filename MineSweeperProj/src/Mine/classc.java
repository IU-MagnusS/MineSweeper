package Mine;

import java.util.Iterator;
import java.util.List;

public class classc<E> implements Iterator<E> {

    private List<String> root;

	public classc() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E next() {
        // TODO Auto-generated method stub
        return null;
    }
    
    public boolean contains(Object o) {
        @SuppressWarnings("unchecked")
        List<String> path = (List<String>) o;
        return root.contains(path);
    }

}

