package Assignment_7_generic;
import java.util.*;

/**
 * Created by zemoso on 2/7/17.
 */
public class SList<T> implements slist<T>{
    public Node<T> first,last;

    /**
     * <h1>generic sub class: Node  which gives the Node of user defined </h1>
     * @param <u>next: it' shows link between current and next element
     *    constructor of this node class is taking a element and assign it to item
     */
    public static class Node<u>{
        public Node<u> next=null;
        public u item;
        Node(u item){
            this.item=item;

        }
    }

    /**
     * Slist constructor initialize the first and last node of the list to null
     */
    public SList(){
        first=null;
        last=null;

    }

    /**
     * As mentioned in question all the works in linklist is done this this slistiterator which reutrn the slist
     * @return
     */
    public slist<T> slistiterator(){
        return new SList<>();

    }

    /**
     * Given function is gives the size of the linked list
     *
     * @return integer value, size of the linnked list
     */

    public int getcount(){
        if(first==null){
            return 0;
        }else{
            Node<T> temp=first;
            int count=0;
            while(temp.next!=null){
                temp=temp.next;
                count++;
            }
            return count+1;
        }

    }

    /**
     * get count givees the ith element of the linked list
     * @param
     * @return returns the element of the linked list asked for(ith element)
     */
    public T get(int i){
        if(first==null){
            System.out.println("no elements in the list yet");
            return null;
        }else{
            Node<T> temp=first;
            //Node<T> temp_next=temp.next;
            if(i==1){
                return first.item;
            }else {
                for (int count = 0; count <= i - 2; count++) {
                    temp = temp.next;
                }
                System.out.println("returning element "+i+ " is: " + temp.item);
                return temp.item;

            }
        }





    }

    /**
     *
     * @param i = place at which we want to reset the value
     * @param item= the value to be replaced
     */
    public void set(int i,T item){
        if(first==null){
            System.out.println("List is empty, nothing to set ");
        }else if(i>getcount()){
            System.out.println("setting location is greater than the size of list");
        }
        else if(i==1){
            first.item=item;
        }
        else{
            //Node<T> temp_1= new Node<>(item);
            Node<T> temp_2=first;
            for(int j=0;j<=i-2;j++){
                temp_2=temp_2.next;
            }
            temp_2.item=item;
            System.out.println("value placed at"+i+"is: "+ temp_2.item);
        }

    }

    /**
     * this add function adds the element at the last of the linked list
     * @param item item to add in linked list
     */
    public void add(T item){
       if(first!=null){
           Node<T> new_4=new Node<>(item);
           Node<T> temp_7=first;
           //System.out.println(temp_7.item);
           while(temp_7.next!=null){
               temp_7=temp_7.next;

           }
           temp_7.next=new_4;
           System.out.println("Element added to the list is: "+temp_7.next.item);


       }else{
           Node<T> tmp=new Node<>(item);
           first=tmp;
           System.out.println("first Element added to the list is: "+tmp.item);



       }


    }

    /**
     * this function insert a new element in linked list
     * @param i=ith place a new element to be inserted
     * @param item new element
     */
    public void insert(int i, T item){
        if(first==null){
            Node<T> first=new Node<>(item);
            first.item=item;
            first.next=null;
            System.out.println("Element inserted to the list is: "+first.item);
        }else if(i==1){
            Node<T> new_1=new Node<>(item);
            Node<T> temp =first.next;

            first.next=new_1;
            new_1.next=temp;
            System.out.println("Element inserted to the list is: "+first.next.item);

        }else if(i>getcount()){
            System.out.println("inserting location is greater than the size of list");
        }
        else{

            Node<T> temp_2=first;


            for(int count=0;count<i-2;count++){
               temp_2=temp_2.next;
               //System.out.println(temp_2.item);
                // temp_prev=temp_current;
                //temp_current=temp_current.next;
                //temp_next=temp_current.next;
            }
            Node<T> temp_1=new Node<>(item);
            Node<T> gt=temp_2.next;
            temp_2.next=temp_1;
            temp_1.next=gt;
            System.out.println("Element inserted to the list is: "+temp_2.next.item);
        }

    }

    /**
     * this function remove the ith element from the linked list
     * @param i ith element to be removed
     */
    public void removeat(int i){
        if(first==null){
            System.out.println("this is an empty list");
        }else if(i==1){
            first=first.next;

        }else{
            Node<T> temp_prev=null;
            Node<T> temp_current=first;
            Node<T> temp_next=null;
            for(int count=0;count<=i-2;count++){
                temp_prev=temp_current;
                temp_current=temp_current.next;
                temp_next=temp_current.next;

            }
            temp_prev.next=temp_next;
            System.out.println("Element is removed from the list, Now size is: "+getcount());

        }





    }
    public static void main(String[] args){
        SList<String> li=new SList<>();
        slist<String>pt=li.slistiterator();
        pt.getcount();
        pt.add("one");
        pt.add("two");
        pt.get(2);
        pt.insert(3,"three");
        pt.set(3,"four");
        pt.set(5,"five");
        pt.add("three");
        pt.add("four ");
        pt.add("five");

        System.out.println(pt.get(3));
        pt.removeat(2);
        System.out.println(pt.get(3));
        System.out.println(pt.getcount());

    }





}

