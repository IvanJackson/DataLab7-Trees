package iterators;

import java.util.ArrayList;
import java.util.Iterator;

import pair.Pair;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class LevelsCountPairIterator<E> implements Iterator<Pair<Integer,Integer>> {
	
	private ArrayList<Pair<Integer,Integer>> list = new ArrayList<>();  
	private Iterator<Pair<Integer,Integer>> iter; 
	private Pair<Integer,Integer> last = null; 
	private LinkedTree<E> t;
	
	public LevelsCountPairIterator(LinkedTree<E> t) {
		this.t = t;
		this.list.add(new Pair<Integer, Integer>(0, 1));
		if(!t.isEmpty()) {
			ArrayList<Integer> arr = countSubTree(this.t.root(), 1);
			for (Integer i : arr) System.out.println(i);
			this.iter = this.list.iterator();
		}
	}
	
	private ArrayList<Integer> countSubTree(Position<E> p, int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		int children = this.t.numChildren(p);
		arr.add(children);
		n++;
		for (Position<E> s : this.t.children(p)) {
			countSubTree(s, n);
		}
		return arr;
	}
	
	@Override
	public boolean hasNext() {
		return iter.hasNext(); 
	}

	@Override
	public Pair<Integer, Integer> next() {
		last = iter.next();   
		return last;
	}
}


