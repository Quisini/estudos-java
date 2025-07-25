import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();
        int diferenca = idade2 > idade1 ? idade2 - idade1 : idade1 - idade2;

        System.out.println("Diferença de idade = " + diferenca);

    }
}
