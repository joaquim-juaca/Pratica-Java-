package DesafiosCurso;
import java.util.Scanner; 
    
public class MultasVelocidade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        int velocidadeMaxima = 60;  
        if (velocidadeAtual > velocidadeMaxima) {
            System.out.println("Foi multado");
        } else {
            System.out.println("Nao foi multado");
        }   
        leitor.close();
    }
}