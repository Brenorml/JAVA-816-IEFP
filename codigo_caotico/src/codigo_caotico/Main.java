package codigo_caotico;

import java.util.*;

/**
 * Classe principal que demonstra funcionalidades diversas em Java.
 */
public class Main {

    /**
     * Método principal que inicia a execução do programa.
     * @param args Os argumentos da linha de comando.
     */
    public static void main(String[] args) {
        exibirLinguagensDeProgramacao();
        int[] numeros = {1, 3, 5, 7, 9};
        int numeroAusente = encontrarNumeroAusente(numeros);
        System.out.println("Número ausente na sequência é: " + numeroAusente);
        exibirCaractere("hello", 3);
        lidarComDivisaoPorZero();
        exibirMapaDeNumeros();
        int soma = calcularSoma(10, 20);
        System.out.println("A soma é: " + soma);
    }

    /**
     * Exibe uma lista de linguagens de programação.
     */
    private static void exibirLinguagensDeProgramacao() {
        List<String> linguagensDeProgramacao = Arrays.asList("Java", "C++", "Python", "Ruby");
        System.out.println("Lista de linguagens de programação:");
        linguagensDeProgramacao.forEach(System.out::println);
    }

    /**
     * Encontra o número ausente em uma sequência de números.
     * @param numeros A sequência de números.
     * @return O número ausente na sequência.
     */
    private static int encontrarNumeroAusente(int[] numeros) {
        final int TAMANHO_SEQUENCIA = 10;
        int totalEsperado = TAMANHO_SEQUENCIA * (TAMANHO_SEQUENCIA + 1) / 2;
        for (int numero : numeros) {
            totalEsperado -= numero;
        }
        return totalEsperado;
    }

    /**
     * Exibe o caractere em uma posição específica de uma string.
     * @param str A string.
     * @param posicao A posição do caractere a ser exibido.
     */
    private static void exibirCaractere(String str, int posicao) {
        if (posicao >= 0 && posicao < str.length()) {
            System.out.println("O caractere na posição " + posicao + " é: " + str.charAt(posicao));
        } else {
            System.out.println("Erro: Posição fora dos limites da string");
        }
    }

    /**
     * Trata a exceção de divisão por zero.
     */
    private static void lidarComDivisaoPorZero() {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero");
        }
    }

    /**
     * Exibe um mapa de números e seus nomes.
     */
    private static void exibirMapaDeNumeros() {
        Map<Object, Object> mapaDeNumeros = new LinkedHashMap<>(); // Mantém a ordem de inserção
        mapaDeNumeros.put(1, "Um");
        mapaDeNumeros.put(2, "Dois");
        mapaDeNumeros.put("Três", 3);
        System.out.println("Mapa de números e seus nomes:");
        for (Map.Entry<Object, Object> entrada : mapaDeNumeros.entrySet()) {
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }
    }

    /**
     * Calcula a soma de dois números.
     * @param x O primeiro número.
     * @param y O segundo número.
     * @return A soma dos dois números.
     */
    private static int calcularSoma(int x, int y) {
        return x + y;
    }
}

