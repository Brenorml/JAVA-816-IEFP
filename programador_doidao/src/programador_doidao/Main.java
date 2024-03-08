package programador_doidao;

import java.util.*;
import java.io.*;

/**
 * Classe que demonstra opera��es diversas em Java.
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
        functionZ(3, "hello");
        handleDivisionByZero();
        exibirMapaDeNumeros();
        exibirNomeUsuarioSistema();
        System.out.println("Valor da soma �: " + calcularSoma(10, 20));
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
     * @param a A posi��o do caractere.
     * @param b A string.
     */
    private static void functionZ(int a, String b) {
        if (a >= 0 && a < b.length()) {
            System.out.println("Caractere na posi��o " + a + ": " + b.charAt(a));
        } else {
            System.out.println("Erro: Posi��o fora dos limites da string");
        }
    }

    /**
     * Trata a exce��o de divis�o por zero.
     */
    private static void handleDivisionByZero() {
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
        Map<Object, Object> mapaDeNumeros = new LinkedHashMap<>();
        mapaDeNumeros.put(1, "Um");
        mapaDeNumeros.put(2, "Dois");
        mapaDeNumeros.put("Tr�s", 3);
        System.out.println("Mapa de n�meros e seus nomes:");
        for (Map.Entry<Object, Object> entrada : mapaDeNumeros.entrySet()) {
            System.out.println(entrada.getKey() + " = " + entrada.getValue());
        }
    }

    /**
     * Exibe o nome de usu�rio atual do sistema.
     */
    private static void exibirNomeUsuarioSistema() {
        String sistemaOperacional = System.getProperty("os.name");
        if (sistemaOperacional.toLowerCase().contains("windows")) {
            exibirNomeUsuarioWindows();
        } else {
            System.out.println("Opera��o n�o suportada para este sistema operacional");
        }
    }

    /**
     * Exibe o nome de usu�rio atual em um sistema Windows.
     */
    private static void exibirNomeUsuarioWindows() {
        try {
            System.out.println("Nome de usu�rio do Windows:");
            ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "echo %USERNAME%");
            Process p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Usu�rio atual: " + line);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o nome do usu�rio: " + e.getMessage());
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

