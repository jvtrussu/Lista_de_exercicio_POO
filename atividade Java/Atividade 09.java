/**
     * Implementa o algoritmo de Busca Binária em um vetor ordenado.
     * Retorna o índice do elemento encontrado ou -1 caso não exista.
     * @param v O vetor de inteiros ORDENADO.
     * @param x O valor a ser buscado.
     * @return O índice do elemento ou -1.
     */
    public static int buscaBinaria(int[] v, int x) {

        int inicio = 0;
        int fim = v.length - 1;

        // O loop continua enquanto o intervalo de busca for válido
        while (inicio <= fim) {

            // Calcula o índice do meio. A forma (inicio + fim) / 2 pode causar overflow
            // para vetores muito grandes, mas esta forma é mais segura.
            int meio = inicio + (fim - inicio) / 2;

            // Caso 1: O elemento do meio é o valor procurado
            if (v[meio] == x) {
                return meio; // Encontrado! Retorna o índice.
            }

            // Caso 2: O valor procurado está na metade esquerda
            if (x < v[meio]) {
                fim = meio - 1; // Descarta a metade direita
            }

            // Caso 3: O valor procurado está na metade direita
            else { // x > v[meio]
                inicio = meio + 1; // Descarta a metade esquerda
            }

        }

        // Se o loop terminar, o elemento não foi encontrado
        return -1;
    }

    /**
     * Wrapper para a Busca Binária: lê o vetor (assumindo que está ordenado),
     * lê o valor alvo, chama a busca e exibe o resultado.
     */
    public static void exercicio9_BuscaBinaria() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- Exercício 9: Busca Binária ---\n");

        try {

            // Para simplificar o teste, vamos usar um vetor já ordenado.
            // Em um cenário real, o vetor deveria ser ordenado antes da busca.
            int[] vetorOrdenado = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
            System.out.print("Vetor de teste (já ordenado): ");
            imprimirVetor(vetorOrdenado);

            System.out.print("\nDigite o valor que você deseja buscar (X): ");
            int valorAlvo = leitor.nextInt();

            // Chama o método de busca
            int indice = buscaBinaria(vetorOrdenado, valorAlvo);

            if (indice != -1) {
                System.out.println("\nO valor " + valorAlvo + " foi encontrado no índice: " + indice);
            } else {
                System.out.println("\nO valor " + valorAlvo + " NÃO foi encontrado no vetor (retorno: -1).");
            }

            // Teste de caso de borda: elemento no início
            int testeInicio = buscaBinaria(vetorOrdenado, 2);
            System.out.println("Teste de borda (valor 2): Índice " + testeInicio);

            // Teste de caso de borda: elemento no fim
            int testeFim = buscaBinaria(vetorOrdenado, 91);
            System.out.println("Teste de borda (valor 91): Índice " + testeFim);

        } catch (InputMismatchException e) {
            System.out.println("\n[ERRO] Entrada inválida. Por favor, digite apenas números inteiros.");
        }

    }

}