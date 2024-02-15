import java.util.Scanner;//importando o class de entrada Scanner

public class Condiconais{
    public static void main(String[] args){

        //criando o obj leitor de entrada.
        Scanner reader = new Scanner(System.in);

        System.out.print("INFORME QUE HORAS SÃO: ");
        String entrada = reader.next();

        //tranformando em numero int
        int time = Integer.parseInt(entrada);

        //int time = 22;//DECLARANDO VARIAVEL

        if (time < 10) {
            System.out.println("Good morning.");
        }else if(time < 18){
            System.out.println("Good day.");
        }else if(time <=24){
            System.out.println("Good evening.");
        }else{
            System.out.println("Ta loco!!");
        }

        System.out.println("Agora informe um numero: ");
        int primeiroNumero = reader.nextInt();

        System.out.println("Agora informe outro numero: ");
        int segundoNumero = reader.nextInt();

        //imprimindo os numeros!!
        System.out.println("primeiro: "+ primeiroNumero+" "+ "segundo: "+segundoNumero);

        if (primeiroNumero > segundoNumero){
            System.out.print("o Primeiro numero eh Maior!!");
        }else if(primeiroNumero == segundoNumero){
            System.out.print("o Primeiro numero eh Igual ao Segundo!!");
        }else{
            System.out.print("o Segundo numero eh Maior!!");
        }
        System.out.println();


        //Short hand if...else
        System.out.println("Informe um valor: ");
        int valor = reader.nextInt();

        String result = (valor < 18) ? "Good day." : "Good evening.";
        System.out.print(result);
    }
}
