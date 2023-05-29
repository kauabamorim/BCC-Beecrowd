import java.util.Scanner;

public class be1173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = new int[10];
        // int n[] = new int[10];

        int v = scanner.nextInt();
        n[0] = v;

        // n.lenght
        for (int i = 1; i < n.length; i++) {
            n[i] = n[i - 1] * 2;
        }
        
        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i +"] = " + n[i]);
        }

        scanner.close();
    }
}
