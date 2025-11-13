// Variável estática para armazenar a lista de números, acessível por todos os métodos do menu.
    private static ArrayList<Integer> listaDeNumeros = new ArrayList<>();

    /**
     * Exibe o menu de opções para o usuário.
     */
    private static void exibirMenu() {
        System.out.println("\n--- MENU INTERATIVO ---");
        System.out.println("(1) Inserir número na lista");
        System.out.println("(2) Listar números");
        System.out.println("(3) Somar números");
        System.out.println("(4) Limpar lista");
        System.out.println("(0) Sair");
        System.out.print("Escolha uma opção: ");
    }

    /**
     * Insere um número inteiro na lista.
     * @param leitor O objeto Scanner para leitura.
     */
    private static void inserirNumero(Scanner leitor) {
        try {
            System.out.print("Digite o número inteiro a ser inserido: ");
            int numero = leitor.nextInt();
            listaDeNumeros.add(numero);
            System.out.println("-> Número " + numero + " inserido com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("[ERRO] Entrada inválida. Por favor, digite um número inteiro.");
            leitor.next(); // Limpa o buffer do scanner
        }
    }

    /**
     * Lista todos os números presentes na lista.
     */
    private static void listarNumeros() {
        if (listaDeNumeros.isEmpty()) {
            System.out.println("-> A lista está vazia.");
            return;
        }

        System.out.println("\n--- Números na Lista ---");
        for (int i = 0; i < listaDeNumeros.size(); i++) {
            System.out.println("Posição " + i + ": " + listaDeNumeros.get(i));
        }
        System.out.println("Total de elementos: " + listaDeNumeros.size());
    }

    /**
     * Calcula e exibe a soma de todos os números na lista.
     */
    private static void somarNumeros() {
        if (listaDeNumeros.isEmpty()) {
            System.out.println("-> A lista está vazia. A soma é 0.");
            return;
        }

        long soma = 0; // Usamos long para evitar overflow, caso a lista seja grande
        for (int numero : listaDeNumeros) {
            soma += numero;
        }

        System.out.println("-> A soma de todos os números na lista é: " + soma);
    }

    /**
     * Limpa todos os elementos da lista.
     */
    private static void limparLista() {
        if (listaDeNumeros.isEmpty()) {
            System.out.println("-> A lista já está vazia.");
            return;
        }

        listaDeNumeros.clear();
        System.out.println("-> Lista limpa com sucesso!");
    }

    /**
     * Implementa o programa principal do menu interativo usando do-while.
     */
    public static void exercicio10_MenuInterativo() {

        Scanner leitor = new Scanner(System.in);
        int opcao = -1; // Inicializa com um valor que não seja 0 para entrar no loop

        System.out.println("\n--- Exercício 10: Menu Interativo ---\n");

        // O loop 'do-while' garante que o menu seja exibido pelo menos uma vez
        do {

            exibirMenu();

            try {
                // Tenta ler a opção do usuário
                opcao = leitor.nextInt();

                // Estrutura 'switch' para executar a ação correspondente à opção
                switch (opcao) {
                    case 1:
                        inserirNumero(leitor);
                        break;
                    case 2:
                        listarNumeros();
                        break;
                    case 3:
                        somarNumeros();
                        break;
                    case 4:
                        limparLista();
                        break;
                    case 0:
                        System.out.println("\n-> Saindo do programa. Até mais!");
                        break;
                    default:
                        System.out.println("[AVISO] Opção inválida. Por favor, escolha uma opção entre 0 e 4.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("[ERRO] Entrada inválida. Por favor, digite um número inteiro para a opção.");
                leitor.next(); // Limpa o buffer do scanner para evitar loop infinito
                opcao = -1; // Garante que o loop continue
            }

            // Adiciona uma linha em branco para melhor separação visual entre as interações
            System.out.println("\n------------------------------------");

        } while (opcao != 0); // O loop continua enquanto a opção não for '0' (Sair)

    }

}