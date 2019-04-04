package iterators;

import java.util.ArrayList;
import java.util.Iterator;

import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class PathContentIterator<E> implements Iterator<String> {
	private ArrayList<String> list = new ArrayList<>(); 
	private Iterator<String> iter; 
	private LinkedTree<E> t;                

	public PathContentIterator(LinkedTree<E> t) { 
		this.t = t; 
		if (!t.isEmpty()) {
			fillArrayList(t.root(), "");
			this.iter = this.list.iterator();
		}               
	} 

	private void fillArrayList(Position<E> r, String s) { 
		s = s + r.getElement();
		if (r.getElement() instanceof Integer) {
			this.list.add(s);
		} else {
			if (s.contains("]"))
				this.list.add(s);
		}
		for (Position<E> p : t.children(r))
			fillArrayList(p, s);
	} 

	public boolean hasNext() { 
		return iter.hasNext(); 
	} 

	public String next() { 
		return iter.next();   
	} 
}
