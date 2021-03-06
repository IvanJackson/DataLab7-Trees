package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;

public class TreeTester4 {

	public static void main(String[] args) throws CloneNotSupportedException { 
		LinkedBinaryTree<Integer> t = Utils.buildExampleTreeAsLinkedBinaryTree(); 

		// display content as a tree
		Utils.displayTree("The structure of the tree is: ", t);
		
		// display elements as a list
		Utils.displayTreeElements("The elements of the tree are: ", t);
		
		LinkedBinaryTree<Integer> tClone = t.clone();
		Utils.displayTree("The structure of the tree is: ", tClone);
		
	}

}
