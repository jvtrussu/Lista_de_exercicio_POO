/**
     * Lê dois valores double e um caractere de operação (+, -, *, /).
     * Utiliza uma estrutura switch para realizar o cálculo e exibir o resultado.
     * Trata casos de divisão por zero e operações inválidas.
     */
    public static void exercicio2_CalculadoraSimples() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- Exercício 2: Calculadora Simples ---\n");

        try {
            System.out.print("Digite o primeiro valor (double): ");
            double valor1 = leitor.nextDouble();

            System.out.print("Digite o segundo valor (double): ");
            double valor2 = leitor.nextDouble();

            System.out.print("Digite a operação (+, -, *, /): ");
            char operacao = leitor.next().charAt(0); // Lê o primeiro caractere da string

            double resultado = 0.0;
            boolean operacaoValida = true;

            // O switch seleciona o bloco de código a ser executado com base no valor da variável 'operacao'
            switch (operacao) {

                case '+':
                    resultado = valor1 + valor2;
                    break; // O 'break' impede que a execução continue nos próximos 'case'

                case '-':
                    resultado = valor1 - valor2;
                    break;

                case '*':
                    resultado = valor1 * valor2;
                    break;

                case '/':
                    // Verificação crucial para evitar erro de divisão por zero
                    if (valor2 != 0) {
                        resultado = valor1 / valor2;
                    } else {
                        System.out.println("\n[ERRO] Divisão por zero não é permitida.");
                        operacaoValida = false; // Marca que a operação falhou
                    }
                    break;

                default:
                    // Se o caractere não corresponder a nenhum dos casos acima
                    System.out.println("\n[ERRO] Operação inválida. Use apenas +, -, * ou /.");
                    operacaoValida = false;
                    break;

            }

            // Exibe o resultado apenas se a operação foi bem-sucedida
            if (operacaoValida) {
                System.out.printf("Resultado: %.2f %c %.2f = %.2f\n", valor1, operacao, valor2, resultado);
            }

        } catch (InputMismatchException e) {
            System.out.println("\n[ERRO] Entrada inválida. Por favor, digite números no formato correto.");
        }

    }