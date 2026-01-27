import java.io.*;import java.util.*;import java.util.stream.*;
class Person{
String name;int age;
Person(String n,int a){name=n;age=a;}
static boolean olderThan(Person p,int limit){return p.age>limit;}
}
public class Task3 {
public static void main(String[]args)throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
List<Person>list=new ArrayList<>();
for(int i=0;i<n;i++){
String[]s=br.readLine().split(" ");
list.add(new Person(s[0],Integer.parseInt(s[1])));
}
int limit=Integer.parseInt(br.readLine());
list.stream().map(p->p.name).sorted(String::compareTo).forEach(x->System.out.print(x+" "));
System.out.println();
list.stream().filter(p->Person.olderThan(p,limit)).map(p->p.name).forEach(x->System.out.print(x+" "));
System.out.println();
list.stream().map(p->p.name).map(String::toUpperCase).forEach(x->System.out.print(x+" "));
}
}
