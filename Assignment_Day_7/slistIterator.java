package Assignment_Day_7;
import java.util.Scanner;

/**
 * Created by zemoso on 17/8/17.
 */
public class slistIterator<T> {
    public Node<T> first,last ,current;
    /**
     * <h1>generic sub class: Node  which gives the Node of user defined </h1>
     * @param <u>next: it' shows link between current and next element
     *    constructor of this node class is taking a element and assign it to item
     */
    public static class Node<u>{
        public Node<u> next;
        public u item;
        Node(u item){
            next=null;
            this.item=item;
        }
    }
    /**
     * Slist constructor initialize the first and last node of the list to null
     */
    public slistIterator(){
        first=null;
        last=null;
        current=first;
    }

    /**
     *
     * printing the list
     */
    public void print(){
        if(first==null){
            System.out.println("list size is zero");
        }else{
            Node<T> temp=first;
            do{
                System.out.print(temp.item+"   ");
                temp=temp.next;
            }while(temp.next!=null);
            System.out.println(temp.item);
        }
    }
    /**
     * Given function is gives the size of the linked list
     *
     * @return integer value, size of the linnked list
     */
    public int sizeOfList(){
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
    public T getElementFromList(int i){
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
    public void setElementAt(int i,T item){
        if(first==null){
            System.out.println("List is empty, nothing to set ");
        }else if(i>sizeOfList()+1){
            System.out.println("You want to set element at location which is out of the size of list");
        }
        else if(i==1){
            first.item=item;
        }else if(i==(sizeOfList()+1)){
            addElementToList(item);
            Node<T> temp_2=first;
            for(int j=0;j<=i-2;j++){
                temp_2=temp_2.next;
            }
            System.out.println("value placed at "+i+" is: "+ temp_2.item);
        }
        else{
            Node<T> temp_2=first;
            for(int j=0;j<=i-2;j++){
                temp_2=temp_2.next;
            }
            temp_2.item=item;
            System.out.println("value placed at "+i+" is: "+ temp_2.item);
        }
    }

    /**
     * this add function adds the element at the last of the linked list
     * @param item item to add in linked list
     */
    public void addElementToList(T item){
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
            current=first;
            System.out.println("first Element added to the list is: "+tmp.item);
        }
    }

    /**
     * this function insert a new element in linked list
     * @param i=ith place a new element to be inserted
     * @param item new element
     */
    public void insertAt(int i, T item){
        if(first==null){
            Node<T> first=new Node<>(item);
            first.item=item;
            first.next=null;
            System.out.println("Element inserted to the list is: "+first.item);
        }else if(i==0 && first!=null){
            Node<T> new_1=new Node<>(item);
            new_1.next=first.next;
            new_1.item=first.item;
            first.next=new_1;
            first.item=item;
        }
        else if(i==1){
            Node<T> new_1=new Node<>(item);
            Node<T> temp =first.next;
            first.next=new_1;
            new_1.next=temp;
            System.out.println("Element inserted to the list is: "+first.next.item);

        }else if(i>sizeOfList()+1){
            System.out.println("inserting location is greater than the size of list");
        }
        else{

            Node<T> temp_2=first;
            for(int count=0;count<i-2;count++){
                temp_2=temp_2.next;
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
    public void removeAt(int i){
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
            System.out.println("Element is removed from the list, Now size is: "+sizeOfList());
        }

    }
     public int count=1;

    /**
     * <p>It will remove the element where the iterator pointing to from the list </p>
     */
     public void remove(){
            if(first==null){
                System.out.println("no Elements in list");
            }else{
                current=current.next;
                removeAt(count);

            }
    }

    /**
     * <p>Item will be add at iterator position </p>
     * @param item element to be add
     */
    public void add(T item){
        if(count>sizeOfList()){
            System.out.println("Can't add ");
        }else if(count==sizeOfList()){
            insertAt(count,item);
        }else{
            insertAt(count,item);
        }
    }

    /**
     * <p>For Iterating to the next position in list</p>
     */
    public void Next(){
        if(count>=sizeOfList()){
            System.out.println("Iterator reached to last element");
        }else{
            count++;
        }
    }

    /**
     * <p></p>Gives the Elements according to the iterator position </p>
     */
    public void getElement(){
        if (count>sizeOfList()) {
            System.out.println("Iterated through all the list");
        }else {
            getElementFromList(count);
        }
    }
    public void askResponse(int userChoice,slistIterator<String> pt){
        Scanner sc=new Scanner(System.in);
        switch (userChoice){
            case 1:{
                System.out.println("Enter the element you want to add in list ");
                String newItem=sc.next();
                pt.addElementToList(newItem);
                break;
            }
            case 2: {
                System.out.println("Size of the list is: ");
                System.out.println(pt.sizeOfList());
                break;
            }
            case 3: {
                System.out.println("Enter the position of element you want");
                int positioninlist=sc.nextInt();
                System.out.println(pt.getElementFromList(positioninlist));
                break;
            }
            case 4: {
                System.out.println("Postion and Element to insert in list");
                int pos=sc.nextInt();
                String element=sc.next();
                pt.insertAt(pos,element);
                break;
            }
            case 5: {
                System.out.println("Postion and Element to set");
                int pos=sc.nextInt();
                String element=sc.next();
                pt.setElementAt(pos,element);
                break;
            }
            case 6 :{
                System.out.println("Position from which you want to remove");
                int pos=sc.nextInt();
                pt.removeAt(pos);
                break;
            }
            default:
                System.out.println("You would have entered 1-6 for any operation");
                break;
        }
    }

}
