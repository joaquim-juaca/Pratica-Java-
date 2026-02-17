import java.util.Scanner;
// sem array list
public class PrototipoChamadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lista = new String[45];
        System.out.println(" [1] adicionar nomes a chamada"+ System.lineSeparator() + 
                           " [2] exibir a chamada"+ System.lineSeparator() +
                           " [3] criar uma nova lista de chamada"+ System.lineSeparator() +
                           " [4] Sair");
        while(true){
            System.out.println("Digite a opção desejada: ");
            var opcao= scanner.nextLine();
            switch (opcao) {
            case "1":
                adicionar(lista, scanner);
                break;
            case "2":
                frequencia(lista);
                break;
            case "3":
                System.out.println("");
                break;
                case "4":
                scanner.close();
                return;
            default:
                System.out.println("Operação inválida, Digite novamente");
            }
        }
        
    }
    
    public static void frequencia ( String[] lista) {
        int contador = 0;
        while(contador < (lista.length) ){
            String nome = lista[contador];
            if (nome == null){
                break;
            }
            String texto = String.valueOf(contador + 1);
            System.out.println(texto + "°" + nome); 
            contador++;
        }
        
    }
    public static void adicionar ( String[] lista,Scanner scanner){
        
        System.out.println("Digite 0 para sair do loop"+ System.lineSeparator() );
        int contador = 0;
        while (true){
            System.out.println("Digite o que quer adicionar no array:");
            String adicao= scanner.nextLine();
            if ( adicao.equals("0")  ){
                System.out.println(System.lineSeparator() + "Encerrando...");
                break;
            }else if(contador < lista.length){
                lista[contador]=adicao;
                contador++;
            }else{
                System.out.println(" A lista está cheia por favor criar outra lista" 
                + System.lineSeparator() + "Encerrando...");
            }
            
        }
        
    }   
}
