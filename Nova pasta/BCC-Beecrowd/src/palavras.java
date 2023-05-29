import java.util.Random;
import java.util.Scanner;

public class palavras {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        char matriz[][] = new char[10][10];

        // MAPEAR
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = generateRandomLetter();
            }
        }

        String palavras[] = new String[5];
        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = read.nextLine();
        }

        matriz = seletorPalavras(palavras, matriz);

        // IMPRIMIR
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char generateRandomLetter() {
        Random random = new Random();
        int randomNumber = random.nextInt(26);
        char randomLetter = (char) (randomNumber + 'A');

        return randomLetter;
    }

    public static char[][] seletorPalavras(String[] palavra, char[][] matriz) {

        Random random = new Random();

        int linha = 0;
        int coluna = 0;
        int teste[] = new int[palavra.length];

        for (int i = 0; i < palavra.length; i++) {
            String pauloVetor[] = palavra[i].split("-");

            linha = random.nextInt(matriz.length - 1);

            for (int j = 0; j < teste.length; j++) {
                while (linha == teste[j]) {
                    linha = random.nextInt(matriz.length - 1);
                }
            }

            coluna = random.nextInt((matriz.length - 1) -palavra.length);

            for (int j = 0; j < pauloVetor.length; j++) {
                matriz[linha][coluna] = pauloVetor[j].charAt(0);

                coluna++;
            }

            teste[i] = linha;
        }

        return matriz;
    }
}
