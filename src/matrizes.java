import java.security.SecureRandom;

public class matrizes{
    public static void main(String[] args) {

        final int LINHAS=3;
        final int COLUNAS=5;
        int[][] numeros = new int[LINHAS][COLUNAS];
        int[][] matrix = {{1,2,3,4,5},{21,21,22,33,44},{100,200,330,440,550}};

        for(int l = 0;l< LINHAS;l++){
            for(int c = 0; c<COLUNAS;c++){
                numeros[l][c] = new SecureRandom().nextInt(10);
            }
        }

        System.out.println("\nfor para array tradiconal ");
        for(int n=0;n<LINHAS;n++){
            for(int m = 0;m<COLUNAS;m++){
                System.out.print("|"+numeros[n][m]);
            }
            System.out.print("\n");
        }

        System.out.println("\nfor propio para leituras de array");
        for(int[] j:numeros){
            for(int valor:j){
                System.out.print("|"+valor);
            }
            System.out.print("\n");
        }

        System.out.println("\nfor propio para leituras de array");
        for(int[] j:matrix){
            for(int valor:j){
                System.out.printf("%3d | ",valor);
            }
            System.out.print("\n");
        }
    }
}