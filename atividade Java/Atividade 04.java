/**
     * Lê um inteiro n (0-20) e calcula o fatorial de n (n!) iterativamente.
     * Utiliza o tipo 'long' para evitar overflow, limitado a n=20.
     * Trata a validação da faixa e o caso especial de 0! = 1.
     */
    public static void exercicio4_FatorialIterativo() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- Exercício 4: Fatorial Iterativo ---\n");

        try {

            System.out.print("Digite um número inteiro (n) entre 0 e 20: ");
            int n = leitor.nextInt();

            // Validação da faixa de entrada
            if (n < 0 || n > 20) {
                System.out.println("\n[ERRO] O número deve estar no intervalo de 0 a 20 para evitar overflow.");
                return; // Sai do método se a entrada for inválida
            }

            // O tipo 'long' é usado para armazenar o resultado, pois o fatorial cresce muito rápido.
            // 20! é o maior que cabe em um 'long'.
            long fatorial = 1;

            // Caso especial: 0! é definido como 1.
            if (n == 0) {

                fatorial = 1;

            } else {

                // Loop 'for' para calcular o fatorial de forma iterativa.
                // Multiplica 'fatorial' por todos os números de 1 até n.
                for (int i = 1; i <= n; i++) {

                    fatorial = fatorial * i;

                }

            }

            System.out.println("\nO fatorial de " + n + " (" + n + "!) é: " + fatorial);

        } catch (InputMismatchException e) {
            System.out.println("\n[ERRO] Entrada inválida. Por favor, digite um número inteiro.");
        }

    }