import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o valor do parametro Um: ");
        int parUm = terminal.nextInt();
        System.out.println("Digite o valor do parametro Dois: ");
        int parDois = terminal.nextInt();

        try {
            contar(parUm, parDois);
            
        } catch (ParametroInvalidoException e) {

            System.err.println("ATENÇÃO: O segundo parametro deverá ser maior que o primeiro!");
        }
    }

    static void contar( int parUm, int parDois) throws ParametroInvalidoException{

        int contagem = parDois - parUm;

        if (parDois < parUm){
            throw new  ParametroInvalidoException();
        }
        
        for (int x = 0; x < contagem; x++){
            System.out.println("Imprimindo a sequencia de nº: " + x);
        }

    }
}   
