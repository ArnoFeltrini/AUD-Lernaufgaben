package linkedLists;

import java.util.Comparator;

public class ListOps{
//          ### Helper method to fill a list ###
    /**
     * This method fills a simply linked list with elements of any given type
     * @param list an input list
     * @param elements an array of elements to place in the list
     * @param <T> the generic type of the elements
     */
    public static<T> void fill(ListItem<T> list, T[] elements){
        list.key = elements[0];
        for(int i = 1; i < elements.length; i++){
            list.append(elements[i]);
        }
    }
//          ### Exercise 1 - Find ###
    /**
     * This method finds an element in a linked list
     * @param list a linked list
     * @param t the key to look for
     * @param <T> the type of the element
     * @return returns true if the element is in the list
     */
    public static<T> boolean find(ListItem<T> list, T t){
        for(ListItem<T> p = list; p != null; p = p.next){
            if(t.equals(p.key)){
                return true;
            }
        }
        return false;
    }
//          ### Exercise 2 - Overwrite ###
    /**
     * This method overwrites an element in a linked list.
     * First the element to be replaced is found, then the first occurrence is replaced.
     * @param list a linked list
     * @param replace the overwriting element
     * @param find the element to be overwritten
     * @param <T> the type of the element
     * @return true if find was found
     */
    public static<T> boolean overwrite(ListItem<T> list, T replace, T find){
        for(ListItem<T> p = list; p != null; p = p.next){
            if(find.equals(p.key)){
                p.key = replace;
                return true;
            }
        }
        return false;
    }
//          ### Exercise 3 - OverwriteAll ###
    /**
     * This method overwrites all elements in a linked list.
     * First the element to be replaced is found, then the first occurrence is replaced.
     * @param list a linked list
     * @param replace the overwriting element
     * @param find the element to be overwritten
     * @param <T> the type of the element
     * @return true if find was found
     */
    public static<T> boolean overwriteAll(ListItem<T> list, T replace, T find){
        boolean ret = false;
        for(ListItem<T> p = list; p != null; p = p.next){
            if(find.equals(p.key)){
                p.key = replace;
                ret = true;
            }
        }
        return ret;
    }
//          ### Exercise 4 - OverwriteAt ###
    /**
     * This method overwrites an element of a linked list at a given index
     * @param list a simply linked list
     * @param replace the overwriting element
     * @param i the index to put the new element
     * @param <T> the type of the list elements
     * @return true if an element was replaced
     */
    public static<T> boolean overwriteAt(ListItem<T> list, T replace, int i){
        int index = 0;
        for(ListItem<T> p = list; p != null; p = p.next){
           if(i == index){
               p.key = replace;
               return true;
           }
           index++;
        }
        return false;
    }
//          ### Exercise 5 - Insert ###

    /**
     * This method inserts an element into a linked list. The list must be sorted for this method to work.
     * @param list the head of a linked list
     * @param t the element to be inserted
     * @param comparator a comparator to compare the lists elements
     * @param <T> the type of the elements
     */
    public static<T> void insert(ListItem<T> list, T t, Comparator<T> comparator){
        if(list == null){
            throw new NullPointerException("Insertion is not possible with an empty list");
        }

        for(ListItem<T> p = list; p != null; p = p.next){
            if(comparator.compare(t, p.key) < 0 ){
                ListItem<T> insert = new ListItem<>();
                ListItem<T> tmp = p.back;
                insert.next = p;
                tmp.next = insert;
                insert.back = tmp;
                insert.key = t;
                return;
            }
        }
        list.append(t);
    }
//          ### Exercise 6 - Remove ###

    /**
     * This method finds an element in a linked list and removes it
     * @param list a linked list
     * @param t an element to find and remove
     * @param <T> the type of the elements
     * @return true if the element was found
     */
    public static <T> boolean remove(ListItem<T> list, T t){
        for(ListItem<T> p = list; p != null; p = p.next){
            if(t.equals(p.key)){
                ListItem<T> tmp = p.back;
                tmp.next  = p.next;
                p.back = null;
                p.next = null;
                return true;
            }
        }
        return false;
    }

//          ### Exercise 7 - RemoveAll ###
    /**
     * This method finds an element in a linked list and removes all occurrences
     * @param list a linked list
     * @param t an element to find and remove
     * @param <T> the type of the elements
     * @return true if the element was found
     */
    public static <T> boolean removeAll(ListItem<T> list, T t){
        boolean ret = false;
        for(ListItem<T> p = list; p != null; p = p.next){
            if(p.key.equals(t)){
                ListItem<T> tmp = p.back;
                tmp.next  = p.next;
                p = tmp;
                ret = true;
            }
        }
        return ret;
    }


























}