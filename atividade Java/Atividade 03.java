/**
     * Método auxiliar que retorna o maior entre três números inteiros.
     * @param a O primeiro inteiro.
     * @param b O segundo inteiro.
     * @param c O terceiro inteiro.
     * @return O maior valor entre a, b e c.
     */
    public static int max3(int a, int b, int c) {
        // Esta é uma forma manual de encontrar o maior número.
        // Poderíamos também usar Math.max, como: Math.max(a, Math.max(b, c));

        int maior = a; // Assume que 'a' é o maior inicialmente

        if (b > maior) {
            maior = b; // Se 'b' for maior, atualiza o maior
        }

        if (c > maior) {
            maior = c; // Se 'c' for maior, atualiza o maior
        }

        return maior; // Retorna o valor final
    }

    /**
     * Lê três inteiros, chama o método max3 para encontrar o maior e exibe o resultado.
     */
    public static void exercicio3_MaximoDeTres() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- Exercício 3: Máximo de Três ---\n");

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = leitor.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int num2 = leitor.nextInt();

            System.out.print("Digite o terceiro número inteiro: ");
            int num3 = leitor.nextInt();

            // Chama o método que implementamos para fazer o cálculo
            int resultado = max3(num1, num2, num3);

            System.out.println("\nO maior número entre " + num1 + ", " + num2 + " e " + num3 + " é: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("\n[ERRO] Entrada inválida. Por favor, digite apenas números inteiros.");
        }
    }


}'''