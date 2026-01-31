import java.util.Scanner;

public class Comparar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int maior = 0;
        double soma = 0;
        int num;
        do{
            System.out.println("Digite o número:");
            num = scanner.nextInt();
            if(num > maior){
                maior = num;
            }
            soma += num;
            contador++;
        }while(contador < 5);
        double media =  soma / contador;
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A média dos números digitados foi: " + media);
        scanner.close();
    }
    
}
