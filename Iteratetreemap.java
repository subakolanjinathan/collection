import java.util.*;
public class Iteratetreemap
{
public static void main(String args[])
{
TreeMap <Integer,String> tm=new TreeMap<>();
tm.put(18,"suba");
tm.put(20,"indhu");
tm.put(67,"saro");
tm.put(5,"madhu");
tm.put(3,"muthu");
System.out.println(tm);
for(Map.Entry<Integer,String> e:tm.entrySet())
{
System.out.println(e.getKey()+" "+e.getValue());
}
}
}
