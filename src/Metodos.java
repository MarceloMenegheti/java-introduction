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

    }
}