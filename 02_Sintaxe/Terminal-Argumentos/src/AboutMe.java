import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Hello, World!");

        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Nome:" + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        System.out.println("Agora, " + nome + " escolha um número: ");
        double numero = scanner.nextDouble();
        System.out.println("O dobro é: " + numero*2);
        
        scanner.close();
    }
}
