import java.util.*;
public class Converthashsettoarray
{
public static void main(String args[])
{
HashSet<Integer> hs=new HashSet<Integer>();
hs.add(1);
hs.add(2);
hs.add(3);
hs.add(4);
hs.add(5);
System.out.println(hs);
//convert hashset to array
int a[]=new int[hs.size()];
int i=0;
for(int x:hs)
{

a[i]=x;
i++;
}
//print the element
for(int j=0;j<a.length;j++)
{
System.out.println(a[j]);
}
}
}
