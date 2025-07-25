import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nDigite um número:");
        Scanner scanner = new Scanner(System.in);
        var num = scanner.nextInt();
        for(var i = 1; i <= 10; i++)
        {
            System.out.printf("%s X %s = %s\n", num, i, num * i);
        }
    }
}
