import java.util.*;
public class IterateHashmap
{
public static void main(String args[])
{
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(5,"saro");
hm.put(8,"suba");
hm.put(4,"indhu");
hm.put(3,"muthu");
hm.put(7,"madhu");
System.out.println(hm);
for(Map.Entry<Integer,String> e:hm.entrySet())  //for(String s:hm)
{
System.out.println(e.getKey()+" "+e.getValue());
}
}
}
