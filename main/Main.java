import res.A1;

public class Main {
    static int a;
    static int b;

    public static void main(String[] args) {

        A1 obj = new A1();
        int[] values = obj.get();
        int a = values[0];
        int b = values[1];

        
        int result =sum(a, b);
        System.out.println("Result of Sum method is: "+result);
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}