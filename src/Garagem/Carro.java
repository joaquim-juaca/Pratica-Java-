package Garagem;
import java.util.ArrayList;
import java.util.Scanner;

class Carro {
    int gasolina;
    int tamTanque;
    boolean motorLigado;
    String modelo;
    int consumo; // consumo em km/l
    int distanciaPercorrida = 0;
    
    void EncherTanque(){
        double preço = 6.31;
        int litros = this.tamTanque - this.gasolina;        
        double valor = litros * preço;
        System.out.println("O valor para encher o tanque é: " + valor);
        this.gasolina = this.tamTanque;
    }

    void andar(ArrayList<Localidade> localidades){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Para onde deseja ir? ");
        String destino = scanner.nextLine();
        boolean encontrado = false;

        for(Localidade local : localidades){    
            if(local.nome.equalsIgnoreCase(destino)){
                gastarCombustivel(local.distancia);
                System.out.println("Você chegou em: " + local.nome);
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("Localidade não encontrada");
            scanner.close();
         }
    }

    void gastarCombustivel(int distancia){
        int gasto = distancia / this.consumo;
        if (gasto > this.gasolina) {
            int prego = (gasto - this.gasolina) * this.consumo;
            System.out.println("Faltou combustível para completar a rota, faltou " + prego + " quilometros.");
            this.gasolina = 0;
        } else {
            this.gasolina -= gasto;
            System.out.println("Gasolina restante: " + this.gasolina + " litros.");
        }     
    }

    void status (){
        System.out.println("Modelo: " + modelo);
        System.out.println("Gasolina: " + gasolina + " litros");
        System.out.println("Tanque: " + tamTanque + " litros");
        System.out.println("Motor ligado: " + (motorLigado ? "Sim" : "Não"));
    }
}

