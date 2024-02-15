public class Strings {
    public static void main(String[] args){

        String primeiroNome = "Marcelo";
        String sobrenome = "Menegheti";

        //Comprimento da corda
        System.out.println("nome completo: "+primeiroNome+" "+sobrenome);

        //Mais métodos de string
        System.out.println("toLowerCase(): "+primeiroNome.toLowerCase());
        System.out.println("toUpperCase(): "+primeiroNome.toUpperCase());
        System.out.println("Length(primeiroNome, sobrenome): "+primeiroNome.length()+" - "+sobrenome.length());
        System.out.println("IndexOf(): "+primeiroNome.indexOf("rc"));//O indexOf()método retorna o índice
        System.out.println("concat(): "+primeiroNome.concat(sobrenome));

        //concatenacao de Strings e int
        String x = "10";
        int y = 20;
        String z = x + y;
        System.out.println(z);

    }
}
