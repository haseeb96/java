# java
import java.util.*;
class Shift{
public static void main(String[] args){
Scanner nr=new Scanner(System.in);
StringBuffer s=new StringBuffer(nr.next);
s.reverse();
String output1=s.toString();
String output2=output1;
for(int i=0;i<output2.length();i++)
{
char a=output2.charAt(i);
for(int j=i+1;j<output2.length();j++)
{
char b=output2.charAt(j);
if(a==b)
{
output2.replace(b,'');
}
}
}
System.out.println(output1);
System.out.println(output2);
}
}
