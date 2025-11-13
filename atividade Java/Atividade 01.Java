 /**
     * Lê um número inteiro do teclado e exibe se ele é "Par" ou "Ímpar".
     * Realiza validação da entrada para garantir que um número inteiro seja fornecido.
     */
    public static void exercicio1_ParOuImpar() {

        // Cria uma instância do Scanner para obter a entrada do usuário
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- Exercício 1: Par ou Ímpar ---\n");
        System.out.print("Por favor, digite um número inteiro: ");

        try {

            // Tenta ler o próximo inteiro fornecido pelo usuário
            int numero = leitor.nextInt();

            // O operador de módulo (%) retorna o resto de uma divisão.
            // Se o resto da divisão por 2 for 0, o número é par.
            if (numero % 2 == 0) {

                System.out.println("A resposta é: Par");

            } else {

                System.out.println("A resposta é: Ímpar");

            }

        } catch (InputMismatchException e) {

            // Se o usuário digitar algo que não é um inteiro (ex: "texto"),
            // uma exceção InputMismatchException será lançada.
            // Nós a capturamos aqui para exibir uma mensagem amigável.
            System.out.println("\n[ERRO] Entrada inválida. Você precisa digitar um número inteiro. Tente novamente.");

        }

        // É uma boa prática fechar o scanner quando não for mais usá-lo para liberar recursos,
        // mas como teremos outros métodos usando, vamos deixar aberto por enquanto.
        // leitor.close();

    }