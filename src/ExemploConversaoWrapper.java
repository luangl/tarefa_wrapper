import java.util.Scanner;

public class ExemploConversaoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor numérico: ");
        int numero = scanner.nextInt(); // Lê um valor numérico do console

        // Converte a variável primitiva 'numero' para o tipo wrapper Integer
        Integer numeroWrapper = Integer.valueOf(numero);

        System.out.println("Valor numérico digitado: " + numeroWrapper);
    }
}