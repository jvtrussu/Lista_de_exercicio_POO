/**
     * Lê um inteiro n (n >= 1) e imprime os n primeiros termos da sequência de Fibonacci.
     * A sequência é definida como: F(n) = F(n-1) + F(n-2), com F(0)=0 e F(1)=1.
     * Utiliza um laço 'while' para o controle.
     */
    public static void exercicio5_Fibonacci() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- Exercício 5: Sequência de Fibonacci ---\n");

        try {

            System.out.print("Quantos termos da sequência de Fibonacci você deseja (n >= 1)? ");
            int n = leitor.nextInt();

            if (n < 1) {
                System.out.println("\n[ERRO] O número de termos deve ser maior ou igual a 1.");
                return;
            }

            // A sequência de Fibonacci começa com 0 e 1.
            // F(0) = 0
            // F(1) = 1
            long termoAnterior = 0; // F(n-2)
            long termoAtual = 1;    // F(n-1)

            int contador = 1; // Começamos a contar a partir do primeiro termo (0)

            System.out.print("\nOs " + n + " primeiros termos são: ");

            // Imprime o primeiro termo (F(0) = 0)
            if (n >= 1) {
                System.out.print(termoAnterior);
            }

            // Loop 'while' para gerar os termos restantes
            while (contador < n) {

                // Imprime o termo atual (F(1) = 1, F(2) = 1, F(3) = 2, ...)
                System.out.print(", " + termoAtual);

                // Calcula o próximo termo: F(n) = F(n-1) + F(n-2)
                long proximoTermo = termoAnterior + termoAtual;

                // Atualiza as variáveis acumuladoras para a próxima iteração
                termoAnterior = termoAtual; // O termo atual se torna o anterior
                termoAtual = proximoTermo;  // O próximo termo se torna o atual

                contador++; // Incrementa o contador de termos gerados
            }

            System.out.println("\n"); // Linha final para formatação

        } catch (InputMismatchException e) {
            System.out.println("\n[ERRO] Entrada inválida. Por favor, digite um número inteiro.");
        }

    }

}