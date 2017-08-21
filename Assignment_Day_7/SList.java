package Assignment_7_generic;

import java.util.Scanner;

/**
 * Created by zemoso on 2/7/17.
 * */
public class SList<T> extends slistIterator<T>{
    public void toStrings(slistIterator<T> pt){
        pt.print();
    }
    public slistIterator<T> returnIterator(){
        return new slistIterator<>();
    }

    public static void main(String[] args){
        SList<String> li=new SList<>();
        slistIterator pt=li.returnIterator();
        System.out.println("how many elements do you want to enter in list");
        Scanner sc=new Scanner(System.in);
        int numberOfElementsInList=sc.nextInt();
        System.out.println("Now enter the element one by one");

        for(int i=0;i<numberOfElementsInList;i++){
            String ElementInList=sc.next();
            pt.addElementToList(ElementInList);
        }
       int exit;
        while(true){
            System.out.println("what do want to do now: \n1) addElementInList  2) Size of list, " +
                    "\n3) get(position)  4) insertElementAt(at,element), \n5) setElementAt(at,element)  6) removeAt(at)");
            System.out.println("Enter any one digit from 1 to 6 as above order");
            int choice=sc.nextInt();
            pt.askResponse(choice,pt);
            System.out.println("Want to exit enter 0 if not then enter any other integer");
            exit=sc.nextInt();
            if(exit==0){
                break;
            }else{
                continue;
            }
        }
        pt.remove();
        pt.remove();
        pt.Next();
        pt.Next();
        pt.add(5);
        li.toStrings(pt);
        pt.getElement();
        pt.Next();
        pt.add(200);
        pt.remove();
        pt.add(1);
        li.toStrings(pt);
        pt.Next();
        pt.getElement();
        pt.add(15);
        pt.add(8);
        pt.getElement();
        pt.getElement();

        System.out.println(pt.sizeOfList());
        li.toStrings(pt);
    }
}


