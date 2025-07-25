import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        int num2;
        
        do {
            System.out.print("Digite outro número: ");
            num2 = scanner.nextInt();
        } while (num2 % num != 0);
    }
}
