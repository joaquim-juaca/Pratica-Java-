package DesafiosCurso;
import java.util.Scanner; 
    
public class TempoLeitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int tempo = paginas / paginasLidas;

        System.out.println(tempo + " dias");
        leitor.close();

        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros
    }
}
