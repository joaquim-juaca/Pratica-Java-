package ExerciciosCurso;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Digite o número para fatorar: ");
     int fatorial = scanner.nextInt();
     int resultado = 1; 
     for( int i = fatorial; i >= 1 ; i--){
        resultado = resultado * i;
     }
     scanner.close();
     System.out.println("Resultado é :" + resultado);
    }
}
