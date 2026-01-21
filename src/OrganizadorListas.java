import java.util.ArrayList;
import java.util.List; 

public class OrganizadorListas {

public static void main(String[] args) {
    System.out.println ( "Olá turma, sejam bem-vindos");
    List<String> lista = new ArrayList<>();
    lista.add ("0");   
    lista.add ("carlos");
    lista .add ("ana");
       
    int chamada = 1;
    String nome = lista.get(chamada);
    String texto = String.valueOf(chamada);
    String frequencia = frequencia(texto, nome);
    System.out.println(frequencia); 
        
}
 
public static String frequencia (String texto,String nome) {
    return texto.concat("° ").concat(nome);
    
}
}
