import java.util.Scanner;

/*
Prompt user for an integer
create an iff statement
if < 0 then print negative
if > 0 then print positive
 */
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        int number;
        System.out.print("Enter any integer: ");
        number = keybd.nextInt();
        if (number < 0) {
            System.out.printf("%d is a Negative number", number);
        } else System.out.printf("%d is a Positive number", number);
    }
}
