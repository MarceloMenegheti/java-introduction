import java.util.ArrayList;

public class Metodos {
    public static void main(String[] args) {

        //Declarando um arrays dinamicos do tipo int.
        ArrayList<Integer> idades = new ArrayList<Integer>();

        //Metodos auxiliares
        idades.add(22);//add valores no array.
        idades.add(23);
        idades.add(24);
        System.out.println("imprimindo o array dinamico: " + idades);

        idades.remove(0);//removendo valor.
        idades.get(1);//pegar um valor.
        idades.size();//retorna o tamanho.
        System.out.println("imprimindo o array dinamico: " + idades + " apos a mudanca");
        System.out.println("imprimindo o valor do index[1]: " + idades.get(1));
        System.out.println("imprimindo o tamanho: " + idades.size());//imprimi o tamanho.
        System.out.println(" ");

        for(int i =0;i<3;i++){
            System.out.print(i +" - ");
            //metodo canal();
            canal();
        }

        System.out.println();

        //metodo msg();
        msg("ola",3);

        //chamando esse metodo quantas vezes quiser
        //msg("denovo");
        //msg("como");
        //msg("vai?");

        int n1=8,n2=3,s;
        s = soma(n1,n2);

        System.out.printf("a soma entre os numeros %d + %d = %d",n1,n2,s);
        System.out.println("\n");

        //chamando o metodo e passando valores quanto eu quiser,SOMANDO.
        System.out.println("soma numeros int: " + soma2(1,2,3,7,8));


        //chamando o metodo e sobrecarregando
        System.out.println("soma numeros double: " + soma2(1.2,3.7,8.9));
        System.out.println();

    }

    //metodo sem retorno
    public static void canal(){
        System.out.println("Marcelo");
    }

    //metodo com string e int
    public static void msg(String m, int l){
        for(int i= 0; i < l; i++){
            System.out.println(m + " - " + i);
        }}

    //criando um novo metodo com retorno
    public static int soma(int x, int y){
        int res = x + y;
        return res;
    }

    //criando um metodo com uma lista de parametros
    public static int soma2(int... numeros){
        int res = 0;
        for(int n:numeros){
            res = res + n;
        }
        return res;
    }

    //sobrecarga de um metodo com uma lista de parametros
    public static double soma2(Double... numeros){
        double res = 0;
        for(double n:numeros){
            res = res + n;
        }
        return res;
    }


}