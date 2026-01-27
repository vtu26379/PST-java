interface CheckDigit {
    boolean check(int digit);
}
public class EvenOddSum {
public static void main(String[] args){
int number = 12345;
int evenSum = 0, oddSum = 0;
CheckDigit isEven = digit -> digit % 2 == 0;
while (number > 0) {
int digit = number % 10;
if (isEven.check(digit)) {
evenSum += digit;
} else {
oddSum += digit;
}
            number = number / 10;
        }
        System.out.println("Sum of Even Digits: " + evenSum);
        System.out.println("Sum of Odd Digits: " + oddSum);
    }
}