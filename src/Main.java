import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/----------------------------------------------\\");
        System.out.println("|              Calculadora de IMC              |");
        System.out.println("\\----------------------------------------------/");

        System.out.println("\nInsira a sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("\nInsira o seu peso:");
        double peso = scanner.nextDouble();

        double imc = calcularImc(altura, peso);
        String faixaDePeso = verificarFaixaDePeso(imc).toLowerCase();

        System.out.printf("\n\nSeu IMC é %.2f e sua faixa de peso é %s.%n", imc, faixaDePeso);

        scanner.close();
    }

    public static double calcularImc(double altura, double peso) {
        if (altura >= 5) {
            altura /= 100;
        }
        double imc = peso / Math.pow(altura, 2);
        return imc;
    }

    public static String verificarFaixaDePeso(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade Grau 1";
        } else if (imc < 40) {
            return "Obesidade Grau 2";
        } else {
            return "Obesidade Grau 3";
        }
    }
}