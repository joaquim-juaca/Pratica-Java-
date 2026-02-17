package Garagem;

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
    }

}

