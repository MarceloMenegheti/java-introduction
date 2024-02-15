import java.util.Scanner;

public class switchCase {
    public  static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("----bem vindo----");
        System.out.print("informe um numero:");
        int primeiroNumero = reader.nextInt();
        System.out.print("informe outro numero:");
        int segundoNumero = reader.nextInt();

        System.out.println("----escolhas as opcoes abaixo----");
        System.out.println("opcao 1 - Soma.");
        System.out.println("opcao 2 - subtracao.");
        System.out.println("opcao 3 - multiplicacao.");
        System.out.println("opcao 4 - /.");
        System.out.println("opcao 5 - %.");
        int opcao = reader.nextInt();

        switch (opcao){
            case 1:
                System.out.println("soma: "+(primeiroNumero + segundoNumero));
                break;
            case 2:
                System.out.println("subtracao: "+(primeiroNumero - segundoNumero));
                break;
            case 3:
                System.out.println("multiplicacao: "+(primeiroNumero * segundoNumero));
                break;
            case 4:
                System.out.println("divisao: "+(primeiroNumero / segundoNumero));
                break;
            case 5:
                System.out.println("resto: "+(primeiroNumero % segundoNumero));
                break;
            default:
                System.out.println("ta loco!!");
        }

    }
}
