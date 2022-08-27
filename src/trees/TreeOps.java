package trees;

import linkedLists.ListItem;

import java.util.Comparator;

public class TreeOps {

//          ### Exercise 1 - Find ###
    /**
     * This method finds an element in a binary tree
     * @param root the root of a BinaryTree
     * @param t the key to look for
     * @param <T> the type of the element
     * @return returns true if the element is in the tree
     */
    public static<T> boolean find(BinaryTreeNode<T> root, T t){
        throw new RuntimeException("Exercise 1 binary tree not implemented"); //TODO BinaryTree 1
    }

    /**
     * This method finds an element in a ternary tree
     * @param root the root of a TernaryTree
     * @param t the key to look for
     * @param <T> the type of the element
     * @return returns true if the element is in the tree
     */
    public static<T> boolean find(TernaryTreeNode<T> root, T t){
        throw new RuntimeException("Exercise 1 ternary tree not implemented"); //TODO TernaryTree 1
    }

    /**
     * This method finds an element in a multiway tree
     * @param root the root of a MultiWayTree
     * @param t the key to look for
     * @param <T> the type of the element
     * @return returns true if the element is in the tree
     */
    public static<T> boolean find(MultiWayTreeNode<T> root, T t) {
        throw new RuntimeException("Exercise 1 multi way tree not implemented"); //TODO MultiWayTree 1
    }

//          ### Exercise 2 - Overwrite ###
    /**
     * This method overwrites an element in a binary tree.
     * First the element to be replaced is found, then the first occurrence is replaced.
     * @param root the root of a binary tree
     * @param replace the overwriting element
     * @param find the element to be overwritten
     * @param <T> the type of the element
     * @return true if find was found
     */
    public static<T> boolean overwrite(BinaryTreeNode<T> root, T replace, T find){
        throw new RuntimeException("Exercise 2 binary tree not implemented"); //TODO BinaryTree 2
    }

    /**
     * This method overwrites an element in a ternary tree.
     * First the element to be replaced is found, then the first occurrence is replaced.
     * @param root the root of a ternary tree
     * @param replace the overwriting element
     * @param find the element to be overwritten
     * @param <T> the type of the element
     * @return true if find was found
     */
    public static<T> boolean overwrite(TernaryTreeNode<T> root, T replace, T find){
        throw new RuntimeException("Exercise 2 ternary tree not implemented"); //TODO TernaryTree 2
    }

    /**
     * This method overwrites an element in a multiway tree.
     * First the element to be replaced is found, then the first occurrence is replaced.
     * @param root the root of a multiway tree
     * @param replace the overwriting element
     * @param find the element to be overwritten
     * @param <T> the type of the element
     * @return true if find was found
     */
    public static<T> boolean overwrite(MultiWayTreeNode<T> root, T replace, T find){
        throw new RuntimeException("Exercise 2 multi way tree not implemented"); //TODO MultiWayTree 2
    }

//          ### Exercise 3 - overwriteAll ###
    /**
     * This method overwrites each occurrence of an element in a binary tree.
     * First the elements to be replaced is found, then each occurrence is replaced.
     * @param root the root of a binary tree
     * @param replace the overwriting elements
     * @param find the elements to be overwritten
     * @param <T> the type of the elements
     * @return true if find was found
     */
    public static<T> boolean overwriteAll(BinaryTreeNode<T> root, T replace, T find){
        throw new RuntimeException("Exercise 3 binary tree not implemented"); //TODO BinaryTree 3
    }

    /**
     * This method overwrites each occurrence of an element in a ternary tree.
     * First the elements to be replaced is found, then each occurrence is replaced.
     * @param root the root of a ternary tree
     * @param replace the overwriting elements
     * @param find the elements to be overwritten
     * @param <T> the type of the elements
     * @return true if find was found
     */
    public static<T> boolean overwriteAll(TernaryTreeNode<T> root, T replace, T find){
        throw new RuntimeException("Exercise 3 ternary tree not implemented"); //TODO TernaryTree 3
    }

    /**
     * This method overwrites each occurrence of an element in a multiway tree.
     * First the elements to be replaced is found, then each occurrence is replaced.
     * @param root the root of a multiway tree
     * @param replace the overwriting elements
     * @param find the elements to be overwritten
     * @param <T> the type of the elements
     * @return true if find was found
     */
    public static<T> boolean overwriteAll(MultiWayTreeNode<T> root, T replace, T find){
        throw new RuntimeException("Exercise 3 multi way tree not implemented"); //TODO MultiWayTree 3
    }

//          ### Exercise 4 - OverwriteAt ###

    /**
     * This method overwrites an element of a simply linked list at a given index
     * @param root the root of a binary tree
     * @param replace the overwriting element
     * @param i the index to put the new element
     * @param <T> the type of the elements
     * @return true if an element was replaced
     */
    public static<T> boolean overwriteAt(BinaryTreeNode<T> root, T replace, int i){
        throw new RuntimeException("Exercise 4 binary tree not implemented"); //TODO BinaryTree 4
    }

    /**
     * This method overwrites an element of a simply linked list at a given index
     * @param root the root of a ternary tree
     * @param replace the overwriting element
     * @param i the index to put the new element
     * @param <T> the type of the elements
     * @return true if an element was replaced
     */
    public static<T> boolean overwriteAt(TernaryTreeNode<T> root, T replace, int i){
        throw new RuntimeException("Exercise 4 ternary tree not implemented"); //TODO TernaryTree 4
    }
    
    /**
     * This method overwrites an element of a simply linked list at a given index
     * @param root the root of a multiway tree
     * @param replace the overwriting element
     * @param i the index to put the new element
     * @param <T> the type of the elements
     * @return true if an element was replaced
     */
    public static<T> boolean overwriteAt(MultiWayTreeNode<T> root, T replace, int i){
        throw new RuntimeException("Exercise 4 multiway tree not implemented"); //TODO MultiWayTree 4
    }

//          ### Exercise 5 - Insert ###

    /**
     * This method inserts an element into a binary tree
     * @param root the root of a binary tree
     * @param t the element to be inserted
     * @param comparator a comparator to compare the elements of the tree 
     * @param <T> the type of the elements
     */
    public static<T> void insert(BinaryTreeNode<T> root, T t, Comparator<T> comparator) {
        throw new RuntimeException("Exercise 5 binary tree not implemented"); //TODO BinaryTree 5
    }

    /**
     * This method inserts an element into a ternary tree
     * @param root the root of a ternary tree
     * @param t the element to be inserted
     * @param comparator a comparator to compare the elements of the tree 
     * @param <T> the type of the elements
     */
    public static<T> void insert(TernaryTreeNode<T> root, T t, Comparator<T> comparator) {
        throw new RuntimeException("Exercise 5 ternary tree not implemented"); //TODO TernaryTree 5
    }

    /**
     * This method inserts an element into a multiway tree
     * @param root the root of a multiway tree
     * @param t the element to be inserted
     * @param comparator a comparator to compare the elements of the tree 
     * @param <T> the type of the elements
     */
    public static<T> void insert(MultiWayTreeNode<T> root, T t, Comparator<T> comparator) {
        throw new RuntimeException("Exercise 5 multiway tree not implemented"); //TODO MultiWayTree 5
    }

//          ### Exercise 6 - Remove ###

    /**
     * This method removes an element from a binary tree
     * @param root the root of a binary tree
     * @param t the element to be removed 
     * @param comparator a comparator to compare the elements of the tree
     * @param <T> the type of the elements
     * @return true if the element was found and removed
     */
    public static<T> boolean remove(BinaryTreeNode<T> root, T t, Comparator<T> comparator){
        throw new RuntimeException("Exercise 6 binary tree not implemented"); //TODO BinaryTree 6
    }

    /**
     * This method removes an element from a ternary tree
     * @param root the root of a ternary tree
     * @param t the element to be removed 
     * @param comparator a comparator to compare the elements of the tree
     * @param <T> the type of the elements
     * @return true if the element was found and removed
     */
    public static<T> boolean remove(TernaryTreeNode<T> root, T t, Comparator<T> comparator){
        throw new RuntimeException("Exercise 6 ternary tree not implemented"); //TODO TernaryTree 6
    }

    /**
     * This method removes an element from a multiway tree
     * @param root the root of a multiway tree
     * @param t the element to be removed 
     * @param comparator a comparator to compare the elements of the tree
     * @param <T> the type of the elements
     * @return true if the element was found and removed
     */
    public static<T> boolean remove(MultiWayTreeNode<T> root, T t, Comparator<T> comparator){
        throw new RuntimeException("Exercise 6 multiway tree not implemented"); //TODO MultiwayTree 6
    }

//          ### Exercise 7 - removeAll ###

    /**
     * This method removes all elements from a binary tree
     * @param root the root of a binary tree
     * @param t the element to be removed 
     * @param comparator a comparator to compare the elements of the tree
     * @param <T> the type of the elements
     * @return true if the element was found and removed
     */
    public static<T> boolean removeAll(BinaryTreeNode<T> root, T t, Comparator<T> comparator){
        throw new RuntimeException("Exercise 7 binary tree not implemented"); //TODO BinaryTree 7
    }

    /**
     * This method removes all elements from a ternary tree
     * @param root the root of a ternary tree
     * @param t the element to be removed 
     * @param comparator a comparator to compare the elements of the tree
     * @param <T> the type of the elements
     * @return true if the element was found and removed
     */
    public static<T> boolean removeAll(TernaryTreeNode<T> root, T t, Comparator<T> comparator){
        throw new RuntimeException("Exercise 7 ternary tree not implemented"); //TODO TernaryTree 7
    }

    /**
     * This method removes all elements from a multiway tree
     * @param root the root of a multiway tree
     * @param t the element to be removed 
     * @param comparator a comparator to compare the elements of the tree
     * @param <T> the type of the elements
     * @return true if the element was found and removed
     */
    public static<T> boolean removeAll(MultiWayTreeNode<T> root, T t, Comparator<T> comparator){
        throw new RuntimeException("Exercise 7 multiway tree not implemented"); //TODO MultiwayTree 7
    }
}

