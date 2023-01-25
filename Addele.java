import java.util.*;
//Add element in Specific index
public class Addele
{
public static void main(String args[])
{
List<Integer> al=new ArrayList<Integer>();
al.add(3);
al.add(10);
al.add(7);
al.add(9);
al.add(66);
al.add(8);
System.out.println(al);
al.add(4,1);
System.out.println("After adding element 1");
System.out.println(al);
}
}
