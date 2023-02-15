import java.util.*;
public class Arraylist
{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList<String>();
al.add("saro");
al.add("suba");
al.add("indhu");
al.add("muthu");
al.add("madhu");
//print the element
//System.out.println(al);

Collections.sort(al);
System.out.println("After ascending sort");
System.out.println(al);

}
}

