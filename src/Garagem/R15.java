package Garagem;

public class R15 {
    public static void main(String[] args) {
        Moto r15 = new Moto();
        r15.modelo = "R15";
        r15.gasolina = 10;
        r15.tamTanque = 20;
        r15.motorLigado = false;
        r15.consumo = 20;

        r15.andar();
        r15.status();
        r15.EncherTanque();
        r15.status();

    }

}
