import java.text.DecimalFormat;
import java.util.Scanner;

public class be1174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double a[] = new double[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextDouble();
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] <= 10) {
                System.out.println("A[" + i + "] = " + df.format(a[i]));
            }
        }

        scanner.close();
        df.clone();
    }
}
