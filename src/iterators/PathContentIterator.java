package iterators;

import java.util.ArrayList;
import java.util.Iterator;

import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class PathContentIterator<E> implements Iterator<String> {
    private ArrayList<String> list = new ArrayList<>();   // again, we use its iterator....
    private Iterator<String> iter; 
    private LinkedTree<E> t;                  // the tree to iterate on

    public PathContentIterator(LinkedTree<E> t) { 
        this.t = t; 
        if (!t.isEmpty()) 
            fillArrayList(t.root(), "");
//        ADD MISSING CODE HERE                 
    } 

    private void fillArrayList(Position<E> r, String s) { 
        s = s + r.getElement();
//        ADD MISSING CODE HERE
        for (Position<E> p : t.children(r))
            fillArrayList(p, s);
    } 

    public boolean hasNext() { 
        return iter.hasNext(); 
    } 

    public String next() { 
        return iter.next();    // takes care of the exception
    } 
}
