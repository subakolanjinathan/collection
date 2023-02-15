public class Remove
{
public static void main(String args[])
{
//remove all space in given string 
String s="i like banana";
String a="";
char c[]=new char[s.length()];
for(int i=0;i<c.length;i++)
{
c[i]=s.charAt(i);
}
for(int i=0;i<c.length;i++)
{
if(c[i]!=' ')
a=a+c[i];
}
System.out.println(a);
}
}
