import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello and welcome!");

        //Declarando variaveis
        var nome = "Marcelo";
        byte idade = 24;
        boolean bool = true;
        char letra = 'A';
        String nome_2 = "marcelinho";
        double id = 22.44444;
        float id_1 = 22.33F;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(bool);
        System.out.println(letra);
        System.out.println(nome_2);
        System.out.println(id);
        System.out.println(id_1);
        System.out.println(" ");

        //condiconais
        if(id > id_1){
            System.out.println("E maior");
        }else{
            System.out.println("Nao e maior");
        }

        //Declarando arrays
        int[] array = {2,3,4,5}; //inicializando o array com o tamanho [4].
        String[] nomes = new String[10];// declarando o tamanho, mas array vazio.
        boolean[] eCorno = new boolean[8];
        System.out.println(array.length);//mostra o tamanho do array.

        //Declarando arrays dinamicos
        ArrayList<Integer> idades = new ArrayList<Integer>();

        //Metodos auxiliares
        idades.add(22);//add valores no array.
        idades.add(23);
        idades.add(24);
        idades.remove(0);//removendo valor.
        idades.get(1);//pegar um valor.
        idades.size();//retorna o tamanho.
        System.out.println(idades);
        System.out.println(" ");

        //lacos de repeticao - loops
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println(" ");

        //while
        int j = 20, idade_1 = 24;//Declarando novas variaveis.
        while(j <= idade_1){
            System.out.println("x - " + j);
            j++;
        }

        System.out.println(" ");

        //casting - mudando os tipos das variaveis.
        short idade_2 = idade;// mudou de byte (line 9) para short de maneira automatica.
        idade = (byte) idade_2;//mudou de short para byte.

        String Letra = String.valueOf(letra);//mudou de char(line 11) para string
        letra = Letra.charAt(0);//mudou de string para char.

        String nome_3 = String.valueOf(j);//mudou de int (line 49) para String.
        j = Integer.parseInt(nome_3);//mudou de String para inteiro.

        System.out.println(idade_2 +  " - agora eh um short");
        System.out.println(Letra   +" - agora eh uma String");
        System.out.println(nome_3  +" - agora eh uma string");
        System.out.println(   j    +    " - agora eh um int");

        System.out.println(" ");

        //POO

    }
}