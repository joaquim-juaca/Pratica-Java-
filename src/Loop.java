import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 0 para sair");
        while (true) {
            System.out.println("Nome: ");
            String nome = scanner.next();

            if (nome.equals("0")) {
                break;
            }

            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            System.out.println("Olá " + nome + ", você tem " + idade + " anos.");  
        }
        System.out.println("Encerrando o programa.");
        scanner.close();
    }
}