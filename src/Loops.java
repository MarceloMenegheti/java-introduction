import java.util.Scanner;
public class Loops{
    public static void main(String[] args) {

        //Declarando novas variaveis.
        int i = 1;
        int j = 20;
        int idade = 24;

        //lacos de repeticao - loops
        System.out.println("For:");
        for (i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }System.out.println(" ");


        //while
        System.out.println("While:");
        while(j <= idade){
            System.out.println("x - " + j);
            j++;
        }System.out.println(" ");


            /*
        FOR
        //inicialização/controle/incremento//
        for(int cont = 0; cont < 4; cont++){
            System.out.println(cont+" informe uma nota:");
        }
        System.out.println("fim do programa");*/

        Scanner ler = new Scanner(System.in);

        System.out.print("informe um numero: ");
        int max = ler.nextInt();


        /*
        //WHILE
        int cont = 0;//precisa inicializar fora
        while(cont < max){//controle
            System.out.println(cont+" - ola");
            cont++;//incremento dentro, senao vai ate o infinito
        }*/

        int cont=0;//inicializar fora do escopo
        do{//primeiro faz.
            System.out.println(cont + " - ola");
            cont++;
        }while(cont < max);//depois verifica.
        System.out.println("fim do programa");

    }
}