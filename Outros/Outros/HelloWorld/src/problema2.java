import java.util.Scanner;

public class problema2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho de um dos lados do quadrado: ");
        int a = scanner.nextInt();
        int area = a * a;

        System.out.println("Área = " + area);

    }
}
