import java.util.*;
public class Notrepet
{
public static void main(String args[])
{
// to find irst non repeted element in arraylist
ArrayList<Integer> al=new ArrayList<>();
al.add(10);
al.add(10);
al.add(7);
al.add(3);
al.add(3);
al.add(1);
al.add(1);
System.out.println("Element in an arraylist :"+al);
//int nonrepetedelement=0;
for(int i=0; i<al.size();i++)
{
int count=0;
for(int j=0;j<al.size();j++)
{
if(al.get(i)==al.get(j))
{
count = count+1;
}
}
if(count==1)
{
System.out.println("First non repeated element in an arraylist is :"+al.get(i));
break;
}
}
}
}
