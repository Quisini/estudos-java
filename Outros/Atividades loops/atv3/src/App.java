import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número: ");

        int num1 = scanner.nextInt();
        int num2, resto;
        
        do {
            
            System.out.print("\nDigite o segundo número (maior que o primeiro): ");
            num2 = scanner.nextInt();
        } while (num2 <= num1);

        System.out.printf("Você quer saber os ímpares (1) ou os pares (2) de %s até %s?: ", num1, num2);
        int opc = scanner.nextInt();

        resto = opc == 1 ? 1 : 0;

        for (int i = num1; i <= num2; i++)
        {
            if (i % 2 == resto) System.out.println(i);
        }

    }
}
