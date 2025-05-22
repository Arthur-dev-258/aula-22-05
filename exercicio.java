package aula.pkg22.pkg05;
import java.util.Random;
import java.util.Scanner;
public class Aula2205 {
private static int[] vetor = null; // Vetor inicializado como nulo
public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1 - Preencher vetor");
            System.out.println("2 - Encontrar maior valor");
            System.out.println("3 - Encontrar menor valor");
            System.out.println("4 - Calcular soma dos elementos");
            System.out.println("5 - Calcular média dos elementos");
            System.out.println("6 - Apresentar elemento por posição");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    preencherVetor();
                    break;
                case 2:
                    encontrarMaior();
                    break;
                case 3:
                    encontrarMenor();
                    break;
                case 4:
                    calcularSoma();
                    break;
                case 5:
                    calcularMedia();
                    break;
                case 6:
                    apresentarElemento(leia);
                    break;
                case 7:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 7);

        leia.close();
    }

    private static void preencherVetor() {
        vetor = new int[30];
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            vetor[i] = random.nextInt(101); // Números entre 0 e 100
        }
        System.out.println("Vetor preenchido com sucesso!\n");
         for (int i = 0; i < 30; i++) {
             System.out.print("[" + i + "]=" + vetor[i] + "\t");  
        }
    }

    private static void encontrarMaior() {
        if (vetorVazio()) return;
        int maior = vetor[0];
        for (int num : vetor) {
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("Maior valor no vetor: " + maior);
    }

    private static void encontrarMenor() {
        if (vetorVazio()) return;
        int menor = vetor[0];
        for (int num : vetor) {
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("Menor valor no vetor: " + menor);
    }

    private static void calcularSoma() {
        if (vetorVazio()) return;
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        System.out.println("Soma dos elementos do vetor: " + soma);
    }

    private static void calcularMedia() {
        if (vetorVazio()) return;
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        double media = (double) soma / vetor.length;
        System.out.println("Média dos elementos do vetor: " + media);
    }

    private static void apresentarElemento(Scanner leia) {
        if (vetorVazio()) return;
        System.out.print("Digite a posição desejada (0 a 29): ");
        int posicao = leia.nextInt();
        if (posicao >= 0 && posicao < vetor.length) {
            System.out.println("Elemento na posição " + posicao + ": " + vetor[posicao]);
        } else {
            System.out.println("Posição inválida! Escolha entre 0 e 29.");
        }
    }

    private static boolean vetorVazio() {
        if (vetor == null) {
            System.out.println("O vetor está vazio! Preencha-o primeiro.");
            return true;
        }
        return false;
    }
}


   

    
    

