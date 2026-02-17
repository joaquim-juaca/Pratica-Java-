package Garagem;
import java.util.Scanner;

class Carro {
    int gasolina;
    int tamTanque;
    boolean motorLigado;
    String modelo;
    int consumo; // consumo em km/l

    
    void EncherTanque(){
        double preço = 6.31;
        int litros = this.tamTanque - this.gasolina;
        double valor = litros * preço;
        System.out.println("O valor para encher o tanque é: " + valor);
        this.gasolina = this.tamTanque;
    }

    void andar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância que você quer percorrer em km: ");
        int distancia = scanner.nextInt();
        int gasto = distancia / this.consumo;
        if (gasto > this.gasolina) {
            int prego = (gasto - this.gasolina) * this.consumo;
            System.out.println("Faltou combustível para completar a rota, faltou " + prego + " quilometros.");
            this.gasolina = 0;
        } else {
            this.gasolina -= gasto;
            System.out.println("Gasolina restante: " + this.gasolina + " litros.");
        } 
        scanner.close();  
    }

    void status (){
        System.out.println("Modelo: " + modelo);
        System.out.println("Gasolina: " + gasolina + " litros");
        System.out.println("Tanque: " + tamTanque + " litros");
        System.out.println("Motor ligado: " + (motorLigado ? "Sim" : "Não"));
    }
}

