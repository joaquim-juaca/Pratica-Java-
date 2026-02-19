package Garagem;
import java.util.ArrayList;
import java.util.Scanner;

public class Excução {
    public static void main(String[] args) {
         
        Carro supra = new Carro();
        supra.modelo = "Supra";
        supra.gasolina = 20;
        supra.tamTanque = 60;
        supra.motorLigado = false;
        supra.consumo = 10;
  
        Moto r15 = new Moto();
        r15.modelo = "R15";
        r15.gasolina = 10;
        r15.tamTanque = 20;
        r15.motorLigado = false;
        r15.consumo = 20;

        ArrayList<Localidade> lista = new ArrayList<>();

        Localidade localidade1 = new Localidade();
        localidade1.nome = "Padaria";
        localidade1.distancia = 5;
        lista.add(localidade1);

        Localidade localidade2 = new Localidade();
        localidade2.nome = "Mecanica";
        localidade2.distancia = 10;       
        lista.add(localidade2);

        System.out.println("Escolha o veículo para dirigir: ");
        System.out.println("[1]- Toyota Supra MK4" +
                           "\n[2] - Yamaha R15\n"); 

        while (true){
            Scanner scanner = new Scanner(System.in);
            String escolha = scanner.nextLine();
            switch (escolha) {
                case "1":
                    System.out.println("[1] Status do veiculo" + 
                        "\n[2] Ligar/Desligar motor"+ 
                        "\n[3] Andar com o carro" +
                        "\n[4] encher o tanque do carro"+
                        "\n[5] Sair");
                        String opcao1 = scanner.nextLine();
                    switch (opcao1) {
                        case "1":
                            supra.status();
                            break;
                        case "2":
                            supra.motorLigado = !supra.motorLigado;
                            System.out.println("Motor " + (supra.motorLigado ? "ligado" : "desligado"));
                            break;
                        case "3":
                            supra.andar(lista);
                            break;
                        case "4":
                            supra.EncherTanque();
                            break;
                        case "5":
                            System.out.println("Encerrando...");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Opção inválida, tente novamente.");
                            scanner.close();
                            break;
                    }
                case "2":
                    System.out.println(" [1] Status da moto" +
                        "\n[2] Ligar/Desligar motor"+ 
                        "\n[3] Andar com a moto" +
                        "\n[4] encher o tanque da moto"+
                        "\n[5] Sair");
                    String opcao2 = scanner.nextLine();
                    switch (opcao2) {
                        case "1":
                            r15.status();
                            break;
                        case "2":
                            r15.motorLigado = !r15.motorLigado;
                            System.out.println("Motor " + (r15.motorLigado ? "ligado" : "desligado"));
                            break;
                        case "3":
                            r15.andar(lista);
                            break;
                        case "4":
                            r15.EncherTanque();
                            break;
                        case "5":
                            System.out.println("Encerrando...");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Opção inválida, tente novamente.");
                            break;
                    }
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    scanner.close();
                    break;
            }
        }
        

    }

}

