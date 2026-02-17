package ExerciciosCurso;
import java.util.Scanner;

public class Adivinho {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao jogo do Adivinho!");
        Scanner scanner = new Scanner(System.in);
        int num= 6;
        int tentativa;
        System.out.println("Digite um numero de 1 a 10:");
        while (true){
            tentativa = scanner.nextInt();
            if (num == tentativa){
                System.out.println("Parabéns! Você acertou o número");
                scanner.close();
                break;
            }else if(10 <tentativa){
                System.out.println("Número invalido.Tente novamente");
            }else{
                System.out.println("Número errado.Tente novamente");
            }
        }
    }
}
