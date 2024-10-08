package Exercicio;

import java.util.*;

public class Exercicio {

    // Método a: Recebe uma palavra e imprime as letras separadamente.
    public void imprimirLetras(String palavra) {
        for (char letra : palavra.toCharArray()) {
            System.out.println(letra);
        }
    }

  //   Método b: Recebe um número entre 1 e 10 e imprime a tabuada ou mensagem de erro.
    public void tabuada(int numero) {
        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }

    // Método c: Imprime cinco números inteiros aleatórios entre 1 e 100.
    public void numerosAleatorios() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(rand.nextInt(100) + 1);
        }
    }

    // Método d: Recebe um número entre 1 e 7 e imprime o correspondente ao dia da semana.
    public void diaDaSemana(int numero) {
        String[] dias = {"Inexistente", "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        if (numero < 1 || numero > 7) {
            System.out.println("Inexistente");
        } else {
            System.out.println(dias[numero]);
        }
    }

    // Método e: Recebe uma lista de nomes e imprime todos os nomes.
    public void imprimirNomes(List<String> nomes) {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    // Método f: Recebe uma lista de inteiros e retorna a quantidade de números pares.
    public int contarPares(List<Integer> numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    // Método g: Recebe um array de 10 números inteiros e retorna a soma deles.
    public int somaArray(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    // Método h: Recebe notas de prova e retorna a média aritmética.
    public double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // Método i: Recebe dois números inteiros (n1 e n2) e retorna um vetor com n1 números aleatórios entre 0 e n2.
    public int[] gerarVetorAleatorio(int n1, int n2) {
        int[] vetor = new int[n1];
        Random rand = new Random();
        for (int i = 0; i < n1; i++) {
            vetor[i] = rand.nextInt(n2 + 1);
        }
        return vetor;
    }

    // Método j: Verifica se o CPF está no formato correto.
    public boolean validarCPF(String cpf) {
        if (cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            return true;
        } else {
            return false;
        }
    }
}
