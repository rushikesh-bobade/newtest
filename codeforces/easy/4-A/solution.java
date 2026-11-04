
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int w = input.nextInt();

        int pete = 2;
        int billy = w - pete;

        System.out.println(
            (billy > 0 && billy % 2 == 0) ? "YES" : "NO"
        );

        input.close();
    }
}
