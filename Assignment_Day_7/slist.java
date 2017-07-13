package Assignment_7_generic;

/**
 * Created by zemoso on 2/7/17.
 */
public interface slist<T> {
    int sizeOfList();// number of elements in list
    T getElementFromList(int i); //get element at i
    void setElementAt(int i,T item); //set element at ith
    void addElementToList( T item); // add element at end
    void insertAt(int i,T item);//insert element at index i
    void removeAt(int i); //remove element at index i

}
