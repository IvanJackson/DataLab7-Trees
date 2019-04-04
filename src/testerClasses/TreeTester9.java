package testerClasses;

import iterators.PathContentIterator;
import labUtils.Utils;
import treeClasses.LinkedTree;

public class TreeTester9 {
    public static void main(String[] args) { 
        LinkedTree<Character> t = Utils.buildTrieAsLinkedTree(); 
        
        // display content as a tree
        Utils.displayTree("The structure of the tree is: ", t);

        // the following displays those elements in nodes of t that have only one child
        PathContentIterator<Character> iter = new PathContentIterator<Character>(t); 
        Utils.displayIter("Strings formed by elements in paths from root to external nodes.", iter);

    }
}
