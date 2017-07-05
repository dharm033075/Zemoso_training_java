package Assignment_7_generic;

/**
 * Created by zemoso on 2/7/17.
 */
public interface slist<T> {
    int getcount();// number of elements in list
    T get(int i); //get element at i
    void set(int i,T item); //set element at ith
    void add( T item); // add element at end
    void insert(int i,T item);//insert element at index i
    void removeat(int i); //remove element at index i

}
