import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 2147483647;
        int x;
        if (!scan.hasNextInt()) {
            System.out.println(result);}
        while (scan.hasNextInt()) {
            x = scan.nextInt();
            if (x < result) {
                result = x;
            }

        }

        System.out.println(result);
    }

}
