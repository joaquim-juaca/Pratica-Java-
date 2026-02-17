import java.util.Scanner; 
    
public class EscalaDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a escala de download:");
        int porcentagem = scanner.nextInt();

        switch (porcentagem) {
            case 1:
                System.out.println("/");
                scanner.close();
                break;
            case 2:
                System.out.println("//");
                scanner.close();
                break;
            case 3:
                System.out.println("///");
                scanner.close();
                break;
            case 4:
                System.out.println("////");
                scanner.close();
                break;
            case 5:
                System.out.println("/////");
                scanner.close();
                break;
            case 6:
                System.out.println("//////");
                scanner.close();
                break;
            case 7:
                System.out.println("///////");
                scanner.close();
                break;
            case 8:
                System.out.println("////////");
                scanner.close();
                break;
            case 9:
                System.out.println("/////////");
                scanner.close();
                break;
            case 10:
                System.out.println("//////////");
                scanner.close();
                break;
        
            default:
                System.out.println("Porcentagem inválida");
                scanner.close();
                break;
        }  
        //TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download

    }
}