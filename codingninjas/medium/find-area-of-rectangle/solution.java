import java.util.Scanner;

class Solution {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int B = sc.nextInt();

        int area = L * B;

        System.out.println(area);

        sc.close();
    }
}