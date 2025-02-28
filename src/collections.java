import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class collections {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.stream(arr).toList());
        for(int i =0;i<5;i++) {
            System.out.println(arr[i]);
        }
        List<Object> lst = new ArrayList<>();
        lst.add("hi");
        lst.add("hello");
        lst.add(5);
        lst.add(86.35);
        System.out.println(lst);
        System.out.println(lst.get(2));
        lst.remove(1);
        System.out.println(lst);

    }
}