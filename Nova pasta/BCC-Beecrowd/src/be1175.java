import java.util.Scanner;

public class be1175 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n[] = new int[20];
        int count = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        }

        for (int i = 19; i >= 0; i--) { 
            System.out.println("N[" + count + "] = " + n[i]);
            count++;
        }
        scanner.close();
    }
}
