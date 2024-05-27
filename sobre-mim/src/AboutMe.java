import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Argumentos (Entredas/saídas de dados)
        // String nome = args[0];
        // String sobrenome = args[1];
        // int idade = Integer.valueOf(args[2]);
        // double altura = Double.valueOf(args[3]);

        // Classe Scanner (Entredas de dados) via IDE
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o nome: ");
        String nome = scanner.next();
        System.out.println("Digite o sobrenome: ");
        String sobrenome = scanner.next();
        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite a altura: ");
        Double altura = scanner.nextDouble();

        System.out.println(String.format("Meu nome é %s %s", nome, sobrenome));
        System.out.println(String.format("Minha idade é %d", idade));
        System.out.println(String.format("Minha altura é %.2f", altura));

        scanner.close();
    }
}
