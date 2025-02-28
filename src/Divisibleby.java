import java.util.Scanner;

public class Divisibleby {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        System.out.println(a%5==0 ? "divisible":"not divisible");
    }
}
