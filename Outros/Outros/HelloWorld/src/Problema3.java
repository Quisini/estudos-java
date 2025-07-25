import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        int a = scanner.nextInt();
        System.out.print("Digite a altura do retângulo: ");
        int b = scanner.nextInt();
        int area = a * b;

        System.out.println("Área = " + area);

    }
}
