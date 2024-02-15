import java.util.Scanner;
import java.util.Arrays;
public class array {
    public static void main(String[] args) {

        //Declarando arrays
        int[] array = {2,3,4,5}; //inicializando o array com o tamanho [4].
        String[] nomes = new String[10];// declarando o tamanho, mas array vazio.
        boolean[] booleano = new boolean[8];
        System.out.println("imprimindo o tamanho do array: "+array.length);//mostra o tamanho do array.
        System.out.println();

        //imprimindo arrays
        System.out.print("imprimindo os valores do array com For: ");
        for (int i = 0; i< array.length;i++){
            System.out.print(array[i]+" ");
        }System.out.println();


        System.out.println("imprimindo um array: "+ java.util.Arrays.toString(array));
        System.out.println();

        System.out.print("imprimindo um array vazio: ");
        System.out.println(java.util.Arrays.toString(nomes));
        System.out.println();

        /*
        //int n1,n2,n3,n4,n5;
        final int TAM = 5;
        int[] num = new int[TAM];//inicializado com valores 0
        int[] numeros = {10,20,30,40,50,60,70,80};

        num[0] = 10;
        num[1] = 5;
        num[2] = 11;
        num[3] = 9;
        num[4] = 3;

        System.out.printf("%d",num[1]);
        System.out.printf("%n%d",numeros[1]);//index fixo
        System.out.println();

        for(int i = 0; i < numeros.length;i++){
            System.out.printf("%d -  ",numeros[i]);
        }*/

        final int TAM = 5;
        char[] gabarito = {'a','b','c','d','e'};
        char[] respostas = new char[TAM];
        int nota = 0;
        Scanner ler = new Scanner(System.in);

        /*respostas[0] = 'a';respostas[1] = 'b';respostas[2] = 'd';respostas[3] = 'd';respostas[4] = 'b';*/

        for(int i = 0; i <TAM; i++){//pedindo a resposta atraves de um loop
            System.out.printf("informe a alternativa %d:",i);
            respostas[i] = ler.nextLine().charAt(0);
        }

        for(int i = 0;i <TAM;i++){
            if(respostas[i] == gabarito[i]){
                nota++;
            }
        }
        System.out.printf("%nA nota do aluno foi: %d",nota);

        final int TAMA = 10;
        int[] num={2,1,4,3,6,8,9,7,5,0};
        int[] numeros = new int[TAMA];
        int p = 3;

        /*//For normal
        for(int i = 0;i < num.length;i++){
            System.out.printf("%d - ",num[i]);
        }*/
        System.out.println("\n");


        //metodo de ordernar um array
        //Arrays.sort(num);

        //metodo preencher arrays
        //Arrays.fill(numeros,5);

        //metodo para copiar array
        System.arraycopy(num, 0, numeros, 0, TAMA);

        System.out.println();
        System.out.print("imprimindo o array num[]: ");
        //For somente para leitura
        for(int n:num){
            System.out.printf("%d ",n);
        }

        System.out.println();
        System.out.print("imprimindo o array numeros[]: ");
        for(int n:numeros){
            System.out.printf("%d ",n);
        }
        System.out.println("\n");

        //metodo comparação de arrays
        System.out.printf("Arrays sao iguais:%s",Arrays.equals(num, numeros) ? "sim":"nao ");

        System.out.println();
        //metodo comparação de arrays, mas para acontecer tem que ordernar o array primeiro.
        Arrays.sort(num);
        int posicao;
        posicao = Arrays.binarySearch(num, p);

        System.out.printf("o elemento %d esta no array? %s e na posicao %d",p, posicao > 0 ? "sim" : "nao ",posicao);

    }
}

