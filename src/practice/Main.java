package practice;

import practice.linkedlist.LinkedList;


//https://www.javatpoint.com/java-tutorial
public class Main {


    public static void test(LinkedList list){
        list.insert(89);
    }

    public static void ptTest(Integer a){
        a = 200;
    }

    public static void main(String[] args) {
	// write your code here


        LinkedList linkedList;
        linkedList = new LinkedList();// null
        linkedList.print();
        linkedList.insert(20);  // 20 -> null
        linkedList.print(); // will print // 20 -> null
        linkedList.insert(30);// 20 -> 30-> null
        linkedList.insert(15);// // 20 -> 30 -> 15 -> null
        linkedList.print();// 20 -> 30 -> 15 -> null
        linkedList.delete(30); // 20 -> 15 -> null


        linkedList.print();
        test(linkedList);
        linkedList.print();

        Integer a = 100;
        System.out.println(a);
        ptTest(a);
        System.out.println(a);
        linkedList.insert(22);


        // int, float, boolean, double

    }
}
