package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import pair.Pair;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class LevelsCountPairIterator<E> 
implements Iterator<Pair<Integer, Integer>>{

   private int level = 0;
   ArrayList<Integer> list = new ArrayList<>(); 
    
   public LevelsCountPairIterator(LinkedTree<E> t) { 
    if (!t.isEmpty()) 
       fill(t, t.root(), 0); 
   }

   // fill list using a preorder traversal of tree so that it ends 
   // having size equal to the number of levels in t, and where its
   // i-th element is the number of nodes at level i. 
   private void fill(LinkedTree<E> t, Position<E> r, int level) { 
      // ADD CODE HERE.... TO PROPERLY FILL LIST

   } 

   public boolean hasNext() {
    return level < list.size(); 
   }

   public Pair<Integer, Integer> next() {
    if (!hasNext()) throw new NoSuchElementException("No more pairs."); 
    Pair<Integer, Integer> p = new Pair<>(level, list.get(level)); 
    level++; 
    return p;
   }

}
