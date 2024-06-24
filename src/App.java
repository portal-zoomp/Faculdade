import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello World"); //Print "Hello World".

        // Cria a função scanner para a entradade dados.
        Scanner scanner = new Scanner(System.in);

        // Solicita a nota.
        System.out.print("Olá, dê uma nota de 0 a 10 para este trabalho: ");

        // Entrada de dados.
        double nota = scanner.nextDouble();

        // Verifica se o digitado é válido.
        if (nota >= 0 && nota <= 10) {
            System.out.println("Nota: " + nota + "\nObrigado!");
        } else {
            System.out.println("Nota inválida. Por favor, informe uma nota entre 0 e 10.");
        }

        // Finaliza scanner
        scanner.close();
    }
}
