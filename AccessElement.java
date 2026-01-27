import java.util.Scanner;
public class AccessElement{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array:");
int size=sc.nextInt();
int[] arr=new int[size];
System.out.println("enter the "+size+"elements");
for(int i=0;i<size;i++){
arr[i]=sc.nextInt();
}
System.out.print("enter the index(0 to"+ (size-1)+"):");
int index=sc.nextInt();
if(index>=0&&index<size){
System.out.println("the element at index"+index+":"+arr[index]);
}else{
System.out.println("invalid index");
}
sc.close();
}
}