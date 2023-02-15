import java.util.*;
public class Suba
{
//Find the element in 3rd position of ArrayList
public void thirdposition()
{
ArrayList<Integer> al=new ArrayList<>();
{
al.add(9);
al.add(3);
al.add(4);
al.add(8);
al.add(10);
System.out.println("Element in an arraylist :"+al);
System.out.println("Element in 3rd position :"+al.get(2));
}
}
public static void main(String args[])
{
Suba a=new Suba();
a.thirdposition();
}
}
