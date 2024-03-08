package programador_doidao;

import java.util.*;
import java.io.*;

/**
 * Classe que demonstra operações diversas em Java.
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
        functionZ(3, "hello");
        handleDivisionByZero();
        exibirMapaDeNumeros();
        exibirNomeUsuarioSistema();
        System.out.println("Valor da soma é: " + calcularSoma(10, 20));
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
     * @param a A posição do caractere.
     * @param b A string.
     */
    private static void functionZ(int a, String b) {
        if (a >= 0 && a < b.length()) {
            System.out.println("Caractere na posição " + a + ": " + b.charAt(a));
        } else {
            System.out.println("Erro: Posição fora dos limites da string");
        }
    }

    /**
     * Trata a exceção de divisão por zero.
     */
    private static void handleDivisionByZero() {
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
        Map<Object, Object> mapaDeNumeros = new LinkedHashMap<>();
        mapaDeNumeros.put(1, "Um");
        mapaDeNumeros.put(2, "Dois");
        mapaDeNumeros.put("Três", 3);
        System.out.println("Mapa de números e seus nomes:");
        for (Map.Entry<Object, Object> entrada : mapaDeNumeros.entrySet()) {
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }
    }

    /**
     * Exibe o nome de usuário atual do sistema.
     */
    private static void exibirNomeUsuarioSistema() {
        String sistemaOperacional = System.getProperty("os.name");
        if (sistemaOperacional.toLowerCase().contains("windows")) {
            exibirNomeUsuarioWindows();
        } else {
            System.out.println("Operação não suportada para este sistema operacional");
        }
    }

    /**
     * Exibe o nome de usuário atual em um sistema Windows.
     */
    private static void exibirNomeUsuarioWindows() {
        try {
            System.out.println("Nome de usuário do Windows:");
            ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "echo %USERNAME%");
            Process p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Usuário atual: " + line);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o nome do usuário: " + e.getMessage());
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

