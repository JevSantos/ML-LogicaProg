import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        int num1 = 0;
        int num2 = 0;

        do {
            System.out.println("\n\t****** Benvindo a Calculadora Básica! ******");
            System.out.println("\t 1 - Somar");
            System.out.println("\t 2 - Subtrair");
            System.out.println("\t 3 - Multiplicar");
            System.out.println("\t 4 - Dividir");
            System.out.println("\t 5 - Verificar se o número é Par ou Ímpar");
            System.out.println("\t 6 - Fatorial");
            System.out.println("\t 7 - Tabuada");
            System.out.println("\t 8 - Sair");
            System.out.println("\t Escolha uma operação:");
            while ((!sc.hasNextInt())){
                System.out.print("Digite um número válido: ");
                sc.next();
            }

            escolha = sc.nextInt();

            if (escolha != 8){
            System.out.print("Digite o primeiro número:");
            num1 = sc.nextInt();}

            if ((escolha > 0) && (escolha < 5)){
                System.out.print("Digite o segundo número:");
                num2 = sc.nextInt();}

            switch (escolha) {
                case 1 -> System.out.print("A soma dos números é: " + somar(num1, num2));
                case 2 -> System.out.print("A subtração dos números é: " + subtrair(num1, num2));
                case 3 -> System.out.print("A multiplicação dos números é: " + multiplicar(num1, num2));
                case 4 -> {
                    if(num2 == 0) {
                        System.out.println("Não é possível dividir por zero!");
                    } else {
                        System.out.print("A divisão dos números é: " + dividir(num1, num2));
                    }
                }
                case 5 -> paruoimpar(num1);
                case 6 -> System.out.print("O fatorial do número é: " + tirarfatorial(num1));
                case 7 -> fazertabuada(num1);
                case 8 -> System.out.println("Saindo...") ;
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (escolha != 8);
        sc.close();
        }
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }
    public static double multiplicar(int num1, int num2) {
        return num1 * num2;
    }
    public static double dividir(double num1, double num2) {
        double div = 0;
        if (num2 != 0) {
            div = num1 / num2;
        }
        return div;
    }
    public static void paruoimpar(int num1) {
        if (num1 % 2 == 0) {
            System.out.println("O número " + num1 + " É Par.");
        } else {
            System.out.println("O número " + num1 + " É Ímpar.");
        }
    }
    public static long tirarfatorial(int num1) {
        if (num1 < 0) {
            return -1; // Indica um erro
        } else if (num1 == 0) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 1; i <= num1; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
    public static void fazertabuada(int num1){
        for(int i = 0; i <=10; i++){
            System.out.println("\t "+ num1 + " x "+ i +"= " + (num1 * i));
        }
    }
}

