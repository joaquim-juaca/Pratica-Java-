import java.util.ArrayList;
import java.util.Scanner;
// adicionar função salvar(em arquivo txt ) e organizar (em ordem alfabetica)
public class Chamadas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        while (true) {
            System.out.println(
                    "\n[1] Adicionar nomes à chamada\n" +
                    "[2] Exibir a chamada\n" +
                    "[3] Criar uma nova lista de chamada\n" +
                    "[4] Sair"
            );

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    adicionar(lista, scanner);
                    break;

                case "2":
                    frequencia(lista);
                    break;

                case "3":
                    lista.clear();
                    System.out.println("Nova lista criada com sucesso!");
                    break;

                case "4":
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // Exibe a lista
    public static void frequencia(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + "° " + lista.get(i));
        }
    }

    // Adiciona nomes
    public static void adicionar(ArrayList<String> lista, Scanner scanner) {
        System.out.println("Digite 0 para voltar ao menu");

        while (true) {
            System.out.print("Digite o nome: ");
            String entrada = scanner.nextLine();

            if (entrada.equals("0")) {
                System.out.println("Voltando ao menu...");
                break;
            }

            lista.add(entrada);
        }
    }
}
