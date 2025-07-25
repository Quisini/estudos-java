import java.util.Scanner;

public class App {

    private final static String WELCOME_MESSAGE = "Olá, por favor, digite seu nome: ";

    public static void main(String[] args) throws Exception {
        //Implicitamente declara o tipo da variável baseado no valor de entrada;
        var myScanner = new Scanner(System.in);

        System.out.print(WELCOME_MESSAGE);

        //Faz a mesma coisa que lá em cima
        // String name = myScanner.next();
        var name = myScanner.next();

        System.out.print("Agora, a sua idade: ");
        int idade = myScanner.nextInt();

        System.out.printf("Olá %s, você tem %s anos!", name, idade);
    }
}
