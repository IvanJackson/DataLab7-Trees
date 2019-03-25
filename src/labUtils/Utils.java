package labUtils;

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

//3,4,6,7
}
