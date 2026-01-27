import java.util.Scanner;
public class BinarySearchExample {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of the sorted array: ");
int size = sc.nextInt();
int[] arr = new int[size];
System.out.println("Enter " + size + " sorted elements:");
for (int i = 0; i < size; i++) {
arr[i] = sc.nextInt();
}
System.out.print("Enter the element to search: ");
int target = sc.nextInt();
int result = binarySearch(arr, target);
if (result == -1) {
System.out.println("Element not found in the array.");
} else {
System.out.println("Element found at index: " + result);
}
sc.close();
}
public static int binarySearch(int[] arr, int target) {
int left = 0;
int right = arr.length - 1;
while (left <= right) {
int mid = left + (right - left) / 2; 
if (arr[mid] == target) {
return mid; 
} else if (arr[mid] < target) {
left = mid + 1; 
} else {
right = mid - 1; 
}
}
return -1;   
}
}
