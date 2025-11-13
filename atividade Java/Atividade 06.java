/**
     * Lê N (1-100) e N números double em um vetor.
     * Calcula e exibe a soma, a média, o mínimo e o máximo, percorrendo o vetor uma vez.
     */
    public static void exercicio6_SomaMediaMinMaxVetor() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- Exercício 6: Soma, Média, Mínimo e Máximo de Vetor ---\n");

        try {

            System.out.print("Digite o tamanho do vetor (N, entre 1 e 100): ");
            int n = leitor.nextInt();

            // Validação do tamanho do vetor
            if (n < 1 || n > 100) {
                System.out.println("\n[ERRO] O tamanho do vetor (N) deve estar entre 1 e 100.");
                return;
            }

            // Criação do vetor de números double
            double[] vetor = new double[n];

            System.out.println("Digite os " + n + " números double:");

            // Variáveis acumuladoras e de controle
            double soma = 0.0;
            double minimo = Double.MAX_VALUE; // Inicializa com o maior valor possível
            double maximo = Double.MIN_VALUE; // Inicializa com o menor valor possível

            // Loop para leitura e cálculo simultâneo (percorre o vetor apenas uma vez)
            for (int i = 0; i < n; i++) {

                System.out.print("Valor [" + (i + 1) + "/" + n + "]: ");
                vetor[i] = leitor.nextDouble();

                // 1. Acumula a soma
                soma += vetor[i];

                // 2. Verifica o mínimo
                if (vetor[i] < minimo) {
                    minimo = vetor[i];
                }

                // 3. Verifica o máximo
                if (vetor[i] > maximo) {
                    maximo = vetor[i];
                }

            }

            // Cálculo da média
            double media = soma / n;

            System.out.println("\n--- Resultados ---");
            System.out.printf("Soma dos elementos: %.2f\n", soma);
            System.out.printf("Média dos elementos: %.2f\n", media);
            System.out.printf("Mínimo encontrado: %.2f\n", minimo);
            System.out.printf("Máximo encontrado: %.2f\n", maximo);

        } catch (InputMismatchException e) {
            System.out.println("\n[ERRO] Entrada inválida. Certifique-se de digitar números no formato correto.");
        } catch (NegativeArraySizeException e) {
            System.out.println("\n[ERRO] O tamanho do vetor não pode ser negativo.");
        }

    }