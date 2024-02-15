import java.util.Scanner;

public class Entradas{
    public static void main(String[] args) {

        String entrada; //local que armazena um nome.

        System.out.println();//saida padrão.

        Scanner reader = new Scanner(System.in);//criação de objeto para ler teclado "reader".

        System.out.print("digite seu nome: ");
        entrada = reader.next();
        System.out.print("digite um numero: ");
        String e = reader.next();

        int x = Integer.parseInt(e);

        System.out.println("seu nome: " + entrada);// saida.
        System.out.println("o valor do numero int: "+ e +" ou "+x);

        String typeName = e.getClass().getTypeName();



        System.out.println("o type 'e': "+e.getClass().getTypeName());
        System.out.println(typeName);

        int n1=0, n2=0, n3=0,n4=0,soma=0;
        final int MEDIA = 60;
        String nome_10 ="",res = "";

        System.out.print("digite seu nome: ");
        nome_10 = reader.nextLine();
        System.out.println();

        System.out.print("digite a primeira nota: ");
        n1 = reader.nextInt();
        System.out.print("digite a segunda nota: ");
        n2 = reader.nextInt();
        System.out.print("digite a segunda nota: ");
        n3 = reader.nextInt();
        System.out.print("digite a segunda nota: ");
        n4 = reader.nextInt();

        soma = n1 + n2 + n3 + n4;
        if(soma>=MEDIA){
            res = "aprovado";
        }else if(soma >= 40){
            res = "resuperacao";
        }else{
            res = "reprovado";
        }

        System.out.printf("o aluno %s foi %s, sua nota: %d",nome_10,res,soma);

    }
}
