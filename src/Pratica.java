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

            switch (operação) {
                case "/":
                    System.out.println(dividir(a, b));
                    break;
                case "*":
                    System.out.println(multiplicar(a, b));
                    break;
                case "+":
                    System.out.println(somar(a, b));
                    break;
                case "-":
                    System.out.println(subtrair(a, b));
                    break;
                default:
                    System.out.println("Operação inválida");
            }

            scanner.close();

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