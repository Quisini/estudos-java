import java.time.OffsetDateTime;
import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?: ");
        var nome = scanner.next();
        var baseYear = OffsetDateTime.now().getYear();
        System.out.println("Digite o ano que você nasceu: ");
        var anoNasc = scanner.nextInt();
        var idade = baseYear - anoNasc;
        System.out.printf("Olá %s, você hoje tem %s anos.", nome, idade);
    }
}
