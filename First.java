import java.util.*;
public class First
{
public static void main(String argss[])
{
// first element in last element in arrat list
ArrayList<Integer> al=new ArrayList<>();
al.add(5);
al.add(3);
al.add(4);
al.add(5);
al.add(1);
al.add(3);
int first=al.get(0);
int last=al.get(al.size()-1);
System.out.println("First element in an arraylist :"+first);
System.out.println("Last element in an arraylist :"+last);
}
} 
