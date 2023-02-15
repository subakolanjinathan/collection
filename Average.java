import java.util.*;
public class Average
{
//to find avarage of numeric element present in set
public void Average()
{
TreeSet<Integer> ts=new TreeSet<Integer>();
{
ts.add(9);
ts.add(8);
ts.add(7);
ts.add(6);
ts.add(5);
ts.add(4);
System.out.println("Element in set :"+ts);
int sum=0;
//converting TreeSet into ArrayList because Treeset doesn't have index
ArrayList<Integer> al=new ArrayList<Integer>();
al.addAll(ts);
// sum of all element in set
for(int i=0;i<ts.size();i++)
{
sum=sum+al.get(i);
}
//finding average
int average=sum/al.size();
System.out.println("sum of the element in set :"+sum);
System.out.println("Average of the element in set :"+average);
}
}
public static void main(String args[])
{
Average a=new Average();
a.Average();
}
}
