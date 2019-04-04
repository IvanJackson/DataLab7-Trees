package labUtils;

import java.util.Iterator;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		Position<Integer> root = t.addRoot(4);
		Position<Integer> p9 = t.addChild(root, 9);
		t.addChild(p9, 7);
		t.addChild(p9,10);
		Position<Integer> p20 = t.addChild(root, 20);
		Position<Integer> p15 = t.addChild(p20, 15);
		t.addChild(p15, 12);
		Position<Integer> p17=t.addChild(p15, 17);
		t.addChild(p17, 19);
		Position<Integer> p21=t.addChild(p20, 21);
		Position<Integer> p40=t.addChild(p21, 40);
		t.addChild(p40, 30);
		t.addChild(p40, 45);
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		t.addRoot(4);
		Position<Integer> p9 = t.addLeft(t.root(), 9);
		t.addLeft(p9, 7);
		t.addRight(p9,10);
		Position<Integer> p20 = t.addRight(t.root(), 20);
		Position<Integer> p15 = t.addLeft(p20, 15);
		t.addLeft(p15, 12);
		Position<Integer> p17=t.addRight(p15, 17);
		t.addLeft(p17, 19);
		Position<Integer> p21=t.addRight(p20, 21);
		Position<Integer> p40=t.addRight(p21, 40);
		t.addLeft(p40, 30);
		t.addRight(p40, 45);
		return t; 
	}

	public static <E> void displayIter(String msg, Iterator<E> iter) { 
	    System.out.println(msg); 
	    while (iter.hasNext()) 
	         System.out.println(iter.next()); 
	}

	public static LinkedTree<Character> buildTrieAsLinkedTree() { 
		   String[] words = {"sal", "sala", "salado", "salto", "si", "u", "un", "uno"}; 

		   /*
		   String[] words = {"aleluya", "aleluyado", "aleta", "aletas", "alerta", 
		        "alertado", "altercado", "altercados", "altura", "alturo", "alturito", 
		         "balacera", "bala", "balas", "bala", "balon", "barato"};
		   */ 
		        
		   LinkedTree<Character> t = new LinkedTree<>(); 
		   Position<Character> p = t.addRoot('['); 
		   for (String s : words)
		    addWordToTrie(t, p, s, 0);   // auxiliary method below
		            
		   return t; 
		}
		    
		private static void addWordToTrie(LinkedTree<Character> t, 
		        Position<Character> r, String s, int index) {
		   if (index == s.length()) 
		    t.addChild(r,  ']'); 
		   else { 
		      Position<Character> pcc = null;   // position in children of r containing s[index] 
		    for (Position<Character> p : t.children(r))
		       if (p.getElement().equals(s.charAt(index))) pcc = p; 
		    if (pcc == null)
		       r = t.addChild(r, s.charAt(index)); 
		    else 
		       r = pcc;
		    addWordToTrie(t, r, s, index+1); 

		   }
		}

//3,4,6,7
}
