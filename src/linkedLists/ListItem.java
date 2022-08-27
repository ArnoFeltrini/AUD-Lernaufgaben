package linkedLists;

public class ListItem<T> {
//a few different methods that might be of use https://www.geeksforgeeks.org/doubly-linked-list/

    public T key;
    public ListItem<T> next;
    public ListItem<T> back;

    /**
     * This method appends an element to a doubly linked list
     * @param t the key to be appended
     */
    public void append(T t){

        ListItem<T> p = this;
        ListItem<T> insert = new ListItem<>();
        insert.key = t;
        while(p.next != null){
            p = p.next;
        }
        p.next = insert;
        insert.back = p;
    }

    /**
     * This method returns a string containing each element of the list
     * @return a string containing each element of the list
     */
    public String toString(){
        StringBuilder listAsText = new StringBuilder();
        for(ListItem<T> p = this; p != null; p = p.next){
            listAsText.append(p.key);
            listAsText.append(" ");
        }
        return listAsText.toString();
    }

    /**
     * This method returns a string representation of the key of the current element as well as the keys of the previous and next elements
     * @return a string representation of the key of the current element as well as the keys of the previous and next elements
     */
     public String nodeToString(){
        String back = this.back == null ? "null":this.back.key.toString();
        String next = this.next == null ? "null":this.next.key.toString();

        return "back: " +
                back +
                "\n" +
                "key: " +
                this.key +
                "\n" +
                "next: " +
                next;
     }
}
