import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1182 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        int C = scanner.nextInt();

        System.out.println("Operacao desejada (S - soma, M - media): ");
        String T = scanner.next().toUpperCase();

        double matriz[][] = new double[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        if (T.charAt(0) == 'S') {
            double soma = somaColuna(matriz, C);
            System.out.println(df.format(soma));
        } 
        else if (T.charAt(0) == 'M') {
            double media = calcularMediaColuna(matriz, C);
            System.out.println(df.format(media));
        }

        scanner.close();
    }

    public static double somaColuna(double[][] matriz, int coluna) {
        double soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][coluna];
        }

        return soma;
    }

    public static double calcularMediaColuna(double[][] matriz, int coluna) {
        double soma = somaColuna(matriz, coluna);
        double media = soma / matriz.length;

        return media;
    }
}
