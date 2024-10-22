import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        double soma = 0.0;

        System.out.println("Bem-vindo à Calculadora de Média!");
        
        while (true) {
            System.out.print("Digite uma nota (ou -1 para finalizar): ");
            double nota = scanner.nextDouble();
            
            if (nota == -1) {
                break;  // Finaliza a entrada de notas
            }
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                continue;  // Solicita nova entrada se a nota for inválida
            }
            notas.add(nota);
            soma += nota;
        }

        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota foi inserida.");
        } else {
            double media = soma / notas.size();  // Calcula a média
            System.out.printf("A média das notas é: %.2f%n", media);
            
            if (media >= 6.0) {
                System.out.println("Aluno Aprovado!");
            } else {
                System.out.println("Aluno Reprovado!");
            }
        }
        
        scanner.close();  // Fecha o scanner
    }
}
