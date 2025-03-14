import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int  input, digit = 0, pow = 1, tempNumber = 0;
        int digitVal = 0, result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        input = sc.nextInt();
        tempNumber = input;
        while (tempNumber != 0 ){
            tempNumber /= 10;
            digit++;
        }
        tempNumber = input;
        while (tempNumber != 0){
            digitVal = tempNumber % 10;
            pow = 1;
            for (int i = 0; i < digit; i++){
                pow *= digitVal;
            }
            result += pow;
            tempNumber /= 10;
        }
        if (result == input) System.out.println(input + " is an Armstrong number");
        else System.out.println(input + " is not an Armstrong number");
    }
}
