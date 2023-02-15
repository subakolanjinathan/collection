import  java.util.*;
public class Middleelement
{
public static void main(String args[])
{
// to find the middle element of linked list
LinkedList <Integer> ll=new LinkedList<>();
ll.add(67);
ll.add(8);
ll.add(6);
ll.add(56);
ll.add(7);
System.out.println(ll);
if(ll.size()%2==0)
{
System.out.println("middle element in linked list is :"+ll.get(ll.size()/2-1));
//System.out.println("middle element in linked list is :"+ll.get(ll.size()/2));
}
else
{
System.out.println("middle element in the linkedlist is :"+ll.get(ll.size()/2));
}
}
}


