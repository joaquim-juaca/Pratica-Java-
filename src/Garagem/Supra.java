package Garagem;

public class Supra {
    public static void main(String[] args) {
        Veiculos supra = new Veiculos();
        supra.modelo = "Supra";
        supra.gasolina = 20;
        supra.tamTanque = 60;
        supra.motorLigado = false;
        supra.consumo = 10;

        supra.andar();
        supra.status();
        supra.EncherTanque();
        supra.status();
        
    }

    
}
