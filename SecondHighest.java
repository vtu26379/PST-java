import java.util.*;
public class SecondHighest{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
List<Integer>l=new ArrayList<>();
for(int i=0;i<n;i++)l.add(sc.nextInt());
System.out.println(l.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1));
}
}
