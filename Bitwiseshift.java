import java.util.Scanner;

public class Bitwiseshift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        
        int leftShift = num << 1;
        System.out.println("Left Shift (num << 1): " + leftShift);
        
        
        int rightShift = num >> 1;
        System.out.println("Right Shift (num >> 1): " + rightShift);
        
        scanner.close();
    }
}
