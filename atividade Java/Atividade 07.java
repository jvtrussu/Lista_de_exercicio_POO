/**
     * Lê N inteiros em um vetor e um valor alvo X.
     * Informa quantas vezes X ocorre no vetor.
     */
    public static void exercicio7_ContagemOcorrencias() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- Exercício 7: Contagem de Ocorrências ---\n");

        try {

            System.out.print("Digite o número de elementos inteiros (N): ");
            int n = leitor.nextInt();

            if (n <= 0) {
                System.out.println("\n[ERRO] O número de elementos deve ser positivo.");
                return;
            }

            int[] vetor = new int[n];

            System.out.println("Digite os " + n + " números inteiros:");

            // Leitura dos elementos do vetor
            for (int i = 0; i < n; i++) {
                System.out.print("Elemento [" + (i + 1) + "/" + n + "]: ");
                vetor[i] = leitor.nextInt();
            }

            System.out.print("\nDigite o valor alvo (X) que você deseja contar: ");
            int valorAlvo = leitor.nextInt();

            int contadorOcorrencias = 0;

            // Percorre o vetor para contar as ocorrências
            for (int elemento : vetor) { // Uso do for-each para simplificar a leitura

                // Verifica se o elemento atual é igual ao valor alvo
                if (elemento == valorAlvo) {
                    contadorOcorrencias++; // Incrementa o contador
                }

            }

            System.out.println("\nO valor " + valorAlvo + " ocorre " + contadorOcorrencias + " vez(es) no vetor.");

        } catch (InputMismatchException e) {
            System.out.println("\n[ERRO] Entrada inválida. Por favor, digite apenas números inteiros.");
        }

    }

}