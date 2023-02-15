import java.util.*;
public class Desendingsort
{
public static void main(String args[])
{
List<Integer> al=new ArrayList<>();
al.add(9);
al.add(8);
al.add(12);
al.add(6);
al.add(66);
al.add(87);
al.add(3);
System.out.println("orignal order of arraylist");
System.out.println(al);

Collections.sort(al);
System.out.println("After ascending sort");
System.out.println(al);

Collections.reverse(al);
System.out.println("After decending sort");
for(int i=0; i<al.size();i++)
{
System.out.println(al.get(i));
}
}
}
