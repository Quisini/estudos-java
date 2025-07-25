import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o seu peso: ");

        var peso = scanner.nextInt();
        System.out.print("Digite a sua altura (em m): ");

        var altura = scanner.nextFloat();
        var imc = peso/(altura * altura);
        String msg;

        System.out.println(imc);
        
        if (imc <= 18.5) msg = "Abaixo do peso";
        else if (imc <= 24.9) msg = "Peso ideal";
        else if (imc <= 29.9) msg = "Levemente acima do peso";
        else if (imc <= 34.9) msg = "Obesidade I";
        else if (imc <= 39.9) msg = "Obesidade II";
        else msg = "Obesidade III";

        System.out.println(msg);
    }

}
