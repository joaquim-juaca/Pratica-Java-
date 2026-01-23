import java.util.Scanner;

public class Pratica {
    //class 1
    static class calculadora {
        public static void main(String[] args) throws Exception  {
            Scanner scanner  = new Scanner(System.in);
            
            System.out.println("Digite um Sinal:");
            String operação = (scanner.nextLine());
            
            System.out.println("Digite um número:");
            double a = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Digite outro número:");
            double b = Integer.parseInt(scanner.nextLine());
            
            if (operação.equals("/")) {
                double dividir = dividir(a,b);
                System.out.println(dividir);
                scanner.close();
            }
            else if (operação.equals("*")) {
                double multiplicar = multiplicar(a,b);
                System.out.println(multiplicar);
                scanner.close();
            }
            else if (operação.equals("+")) {
                double somar = somar(a,b);
                System.out.println(somar);
                scanner.close();
            }
            else if (operação.equals("-")) {
                double subtrair = subtrair(a,b);
                System.out.println(subtrair);
                scanner.close();
            }
            else {
                System.out.println("Operação inválida");
                scanner.close();
            }
            
        }

        public static double dividir(double a, double b) throws Exception {
            if (b == 0) {
                throw new Exception("Divisão por zero não é permitida.");
            }
            return a / b;
            // método de teste
        }
        public static double somar(double a, double b) throws Exception {
            return a + b;
            // método de teste
        }
        public static double multiplicar(double a, double b) throws Exception {
            return a * b;
            // método de teste
        }
        public static double subtrair(double a, double b) throws Exception {
            return a - b;
            // método de teste
        }
    }
    //inicio de classe
}