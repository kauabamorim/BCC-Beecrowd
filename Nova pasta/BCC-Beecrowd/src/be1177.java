import java.util.Scanner;

public class be1177 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        int valor = 0;

        int n[] = new int[100];

        for (int i = 0; i < n.length; i++) {
            
            if (valor >= t)
                valor = 0;
            else 
                n[i] = valor;

            valor++;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i +"] = " + n[i]);
        }

        scanner.close();

    }
}
