package testerClasses;

import treeClasses.LinkedTree;
import iterators.PathContentIterator;
import labUtils.Utils;
public class TreeTester8 {
    public static void main(String[] args) { 
        LinkedTree<Integer> t = Utils.buildExampleTreeAsLinkedTree(); 

        // display content as a tree
        Utils.displayTree("The structure of the tree is: ", t);
        

        // the following displays those elements in nodes of t that have only one child
        PathContentIterator<Integer> iter = new PathContentIterator<>(t); 
        Utils.displayIter("Strings formed by elements in paths from root to external nodes.", iter);

    }

}

