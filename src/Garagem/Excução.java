package Garagem;
import java.util.ArrayList  ;

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

        r15.status();
        r15.andar(lista);
    }

}

