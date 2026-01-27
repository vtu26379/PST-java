import java.util.*;
import java.time.*;
class Event{String name;LocalDate date;Event(String name,LocalDate date){this.name=name;this.date=date;}}
public class JavaDateAndTime{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
List<Event> events=new ArrayList<>();
for(int i=0;i<n;i++){String name=sc.next();LocalDate date=LocalDate.parse(sc.next());events.add(new Event(name,date));}
int month=sc.nextInt();
events.sort(Comparator.comparing(e->e.date));
System.out.println(String.join(" ",events.stream().map(e->e.name).toArray(String[]::new)));
System.out.println(events.get(0).name);
System.out.println(events.get(events.size()-1).name);
System.out.println(String.join(" ",events.stream().filter(e->e.date.getMonthValue()==month).map(e->e.name).toArray(String[]::new)));
}
}
