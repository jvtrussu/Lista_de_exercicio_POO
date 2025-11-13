/**
     * Implementa o algoritmo de ordenação Selection Sort.
     * A cada passo, encontra o índice do menor elemento no restante do vetor
     * e o troca com o elemento na posição atual.
     * @param v O vetor de inteiros a ser ordenado.
     */
    public static void selectionSort(int[] v) {

        int n = v.length;

        // Percorre todo o vetor
        for (int i = 0; i < n - 1; i++) {

            // Assume que o elemento atual é o menor
            int indiceMenor = i;

            // Encontra o índice do menor elemento no restante do vetor (v[i+1] até v[n-1])
            for (int j = i + 1; j < n; j++) {

                if (v[j] < v[indiceMenor]) {
                    indiceMenor = j;
                }

            }

            // Troca o menor elemento encontrado com o elemento na posição 'i'
            // Isso coloca o menor elemento na sua posição final correta
            if (indiceMenor != i) {

                int temp = v[i];
                v[i] = v[indiceMenor];
                v[indiceMenor] = temp;

            }

        }

    }

    /**
     * Wrapper para o Selection Sort: lê o vetor, ordena e exibe o resultado.
     */
    public static void exercicio8_SelectionSort() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- Exercício 8: Ordenação por Seleção (Selection Sort) ---\n");

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

            // Exibe o vetor antes da ordenação
            System.out.print("\nVetor ANTES da ordenação: ");
            imprimirVetor(vetor);

            // Chama o método de ordenação
            selectionSort(vetor);

            // Exibe o vetor depois da ordenação
            System.out.print("Vetor DEPOIS da ordenação: ");
            imprimirVetor(vetor);

        } catch (InputMismatchException e) {
            System.out.println("\n[ERRO] Entrada inválida. Por favor, digite apenas números inteiros.");
        }

    }

    // Método auxiliar para imprimir o vetor (reutilizável)
    private static void imprimirVetor(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }