import java.util.Scanner;

public class EvenOrNot {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.println(num%2==0 ? (num + " is Even"):(num + " is not Even"));


    }

}
