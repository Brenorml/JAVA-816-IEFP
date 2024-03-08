package codigo_caotico;

import java.util.*;

/**
 * Classe principal que demonstra funcionalidades diversas em Java.
 */
public class Main {

    /**
     * M�todo principal que inicia a execu��o do programa.
     * @param args Os argumentos da linha de comando.
     */
    public static void main(String[] args) {
        exibirLinguagensDeProgramacao();
        int[] numeros = {1, 3, 5, 7, 9};
        int numeroAusente = encontrarNumeroAusente(numeros);
        System.out.println("N�mero ausente na sequ�ncia �: " + numeroAusente);
        exibirCaractere("hello", 3);
        lidarComDivisaoPorZero();
        exibirMapaDeNumeros();
        int soma = calcularSoma(10, 20);
        System.out.println("A soma �: " + soma);
    }

    /**
     * Exibe uma lista de linguagens de programa��o.
     */
    private static void exibirLinguagensDeProgramacao() {
        List<String> linguagensDeProgramacao = Arrays.asList("Java", "C++", "Python", "Ruby");
        System.out.println("Lista de linguagens de programa��o:");
        linguagensDeProgramacao.forEach(System.out::println);
    }

    /**
     * Encontra o n�mero ausente em uma sequ�ncia de n�meros.
     * @param numeros A sequ�ncia de n�meros.
     * @return O n�mero ausente na sequ�ncia.
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
     * Exibe o caractere em uma posi��o espec�fica de uma string.
     * @param str A string.
     * @param posicao A posi��o do caractere a ser exibido.
     */
    private static void exibirCaractere(String str, int posicao) {
        if (posicao >= 0 && posicao < str.length()) {
            System.out.println("O caractere na posi��o " + posicao + " �: " + str.charAt(posicao));
        } else {
            System.out.println("Erro: Posi��o fora dos limites da string");
        }
    }

    /**
     * Trata a exce��o de divis�o por zero.
     */
    private static void lidarComDivisaoPorZero() {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divis�o por zero");
        }
    }

    /**
     * Exibe um mapa de n�meros e seus nomes.
     */
    private static void exibirMapaDeNumeros() {
        Map<Object, Object> mapaDeNumeros = new LinkedHashMap<>(); // Mant�m a ordem de inser��o
        mapaDeNumeros.put(1, "Um");
        mapaDeNumeros.put(2, "Dois");
        mapaDeNumeros.put("Tr�s", 3);
        System.out.println("Mapa de n�meros e seus nomes:");
        for (Map.Entry<Object, Object> entrada : mapaDeNumeros.entrySet()) {
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }
    }

    /**
     * Calcula a soma de dois n�meros.
     * @param x O primeiro n�mero.
     * @param y O segundo n�mero.
     * @return A soma dos dois n�meros.
     */
    private static int calcularSoma(int x, int y) {
        return x + y;
    }
}

