package res;


import java.util.Scanner;

public class A1 {
    public int[] get() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        return new int[]{a, b};
    }
}
