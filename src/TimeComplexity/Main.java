package TimeComplexity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        test test = new test();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println(size);
        test.func1(size);

        System.out.println(test.func1(size));
    }
}
