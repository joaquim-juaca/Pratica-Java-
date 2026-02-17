package ExerciciosCurso;
import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos números quer comparar:");
        int quantidade = scanner.nextInt();
        int contador = 0;
        int pares = 0;
        int impares = 0;
        while (contador != quantidade){
            System.out.println(System.lineSeparator() + "Digite o número para a comparação:");
            int num = scanner.nextInt();
            int div = num % 2;
            if (div == 0){
                pares++;
            }else if (div == 1){
                impares++;
            }
            contador++;  
        }
        scanner.close();
        System.out.println("Qauntidade de números Pares: " + pares);
        System.out.println("Qauntidade de números Impares: " + impares);

    }
}
