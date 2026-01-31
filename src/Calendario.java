import java.util.Scanner;
public class Calendario {
    public static void main(String[] args) {
        System.out.println("Calendário Java");

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o mês (1-12):");
        int mes = scanner.nextInt();
        String nome;

        switch (mes) {
            case 1: 
            System.out.println( "Janeiro");
            nome= "janeiro";
            break;
            case 2: 
            System.out.println( "Fevereiro");
            nome= "fevereiro";
            break;
            case 3: 
            System.out.println( "Março");
            nome= "março";
             break;
            case 4:  
            System.out.println( "Abril");
            nome= "abril";
            break;
            case 5: 
            System.out.println( "Maio");
            nome= "maio";
            break;
            case 6: 
            System.out.println( "Junho");
            nome= "junho";
            break;
            case 7: 
            System.out.println( "Julho");
            nome= "julho";
            break;
            case 8: 
            System.out.println( "Agosto");
            nome= "agosto";
            break;
            case 9: 
            System.out.println( "Setembro");
            nome= "setembro";
            break;
            case 10: 
            System.out.println( "Outubro");
            nome= "outubro";
            break;
            case 11: 
            System.out.println( "Novembro");
            nome= "novembro";
            break;
            case 12: 
            System.out.println( "Dezembro");
            nome= "dezembro";
            break;
            default:System.out.println( "Número de mês inválido");
            nome = "";
            break;  
        }
        System.out.println(decodificar (nome));
        scanner.close();
    }

    public static String decodificar (String nome){
        if (nome == "janeiro" || nome == "julho" || nome == "dezembro"){
            return "Ferias";
            
        }
        else{
            return "Aulas";
        }       
    }
}