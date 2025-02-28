import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int r, q, num, tmp;
        int pal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        tmp = num;
        while (num != 0) {
            r = num % 10;
            pal = (pal * 10) + r;
            num = num / 10;
        }
        System.out.println(tmp == pal ? (tmp + " is a palindrome") : (tmp + " is not a palindrome"));
        String str;
        System.out.print("Enter a string: ");
        str= sc.next();
        String rev = "";
        int n = str.length()-1;
        for (int i = n; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(str.equals(rev) ? (str + " is a palindrome") : (str + " is not a palindrome"));
    }

}
