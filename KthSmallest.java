import java.util.*;
public class KthSmallest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array:");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("enter the"+n+"elements:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
System.out.println("enter the value of k:");
int k = sc.nextInt();
Arrays.sort(arr);
System.out.println("kth smallest element:"+arr[k - 1]);
sc.close();
}
}
