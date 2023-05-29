import java.util.Scanner;

public class be1180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menor = 0;
        int pos = 0;

        int n = scanner.nextInt();
        int X[] = new int[n];

        for (int i = 0; i < X.length; i++) {
            X[i] = scanner.nextInt();
        }

        for (int i = 0; i < X.length; i++) {

            if (i == 0) {
                menor = X[i];
                pos = i;
            } 
            else {
                if (menor > X[i]) {
                    menor = X[i];
                    pos = i;
                }
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + pos);
        
        scanner.close();
    }
}
