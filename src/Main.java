import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n========== APS ChatBot ==========\n");


        System.out.println("""
                
                          _____   _____        _____ _           _   ____        _  \s
                    /\\   |  __ \\ / ____|      / ____| |         | | |  _ \\      | | \s
                   /  \\  | |__) | (___       | |    | |__   __ _| |_| |_) | ___ | |_\s
                  / /\\ \\ |  ___/ \\___ \\      | |    | '_ \\ / _` | __|  _ < / _ \\| __|
                 / ____ \\| |     ____) |     | |____| | | | (_| | |_| |_) | (_) | |_\s
                /_/    \\_\\_|    |_____/       \\_____|_| |_|\\__,_|\\__|____/ \\___/ \\__|
                                                                                    \s
                                                                                    \s
                
                """);

        System.out.print("Entre com seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Entre com seu email: ");
        String email = sc.nextLine();
        System.out.print("Entre com sua senha: ");
        String senha = sc.nextLine();

        // Inicio do bloco de validacao de senha, nome e email.

        if (nome.trim().contains(" ")) {
            //nome
            String[] vect = nome.split(" ");
            String primeiroNome = vect[0];
            String segundoNome = vect[1];
            if (primeiroNome.length() < 3 || segundoNome.length() < 3) {
                System.out.println("Nome invalido! \n" +
                        "Nomes devem ter mais pelo menos 3 letras.");
                System.exit(0);
            }
        } else {
            System.out.println("Nome invalido! \n" +
                    "Você deve informar seu nome completo.");
            System.exit(0);
        }

        if (!email.contains("@") || !email.endsWith(".com")) {
            //email
            System.out.println("Email invalido! \n" +
                    "Deve conter @ e um dominio valido.");
            System.exit(0);
        }

        if (senha.charAt(0) != email.charAt(0) || senha.charAt(1) != email.charAt(1)
                || senha.charAt(2) != email.charAt(2) || senha.length() == 5
                || !Character.isDigit(senha.charAt(3)) || !Character.isDigit(senha.charAt(4))) {
            //senha
            System.out.println("Senha invalida!. \n" +
                    "A mesma deve conter as 3 primeiras letras do seu email, seguida por dois numeros.");
            System.exit(0);
        }

        //Fim do bloco de valicação

        System.out.println("\n Menu: ");
        System.out.println("( 1 ) Alterar Nome");
        System.out.println("( 2 ) Alterar Email");
        System.out.println("( 3 ) Imprimir dados do Participante");
        System.out.println("( 4 ) Comprar Ingresso");
        System.out.println("( 5 ) Sair");

        System.out.print("\nSelecione: ");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.println("\n========== Alteração de Nome ==========\n");
            System.out.print("Informe o novo nome: ");
            sc.nextLine();
            String novoNome = sc.nextLine();
            if (novoNome.length() >= 3 && nome.trim().contains(" ")) {
                nome = novoNome;
                System.out.println("""
                        Nome alterado com sucesso.
                        novo nome: 
                        """ + nome);
            } else {
                System.out.println("Nome menor que 3 letras!");
                System.exit(0);
            }
        }
        if (escolha == 2) {
            System.out.println("\n========== Alteração de Email ==========\n");
            System.out.print("Informe o novo Email: ");
            sc.nextLine();
            String novoEmail = sc.nextLine();
            if (novoEmail.contains("@") && novoEmail.endsWith(".com")) {
                email = novoEmail;
                System.out.println("""
                        Email alterado com sucesso
                        seu novo email é
                        """ + email);
            } else {
                System.out.println("Email Invalido!");
                System.exit(0);
            }
        }
        if (escolha == 3) {

        }
        if (escolha == 4) {
            LocalDate dataHoje = LocalDate.now();
            DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String data = dataHoje.format(formatoBrasileiro);

            Random random = new Random();
            double numeroAleatorio = random.nextDouble(100000000, 1000000000);

            numeroAleatorio *= numeroAleatorio;

            Scanner scan = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);

            System.out.println("Bem-vindo à compra de ingressos!\n" +
                    "Escolha o ingresso que melhor atenda às suas necessidades e garanta seu lugar no nosso evento incrível! Confira as opções abaixo:\n" +
                    "\n" +
                    "Ingresso Meia Estudante: Válido para estudantes com documento de comprovação, garantindo acesso geral ao evento com desconto.\nValor: R$ 25,00.\n" +
                    "Ingresso Padrão: Acesso geral ao evento, incluindo todas as atrações principais.\nValor: R$ 50,00.\n" +
                    "Ingresso Premium: Experiência completa! Acesso VIP, estacionamento gratuito e sessão de fotos com as atrações.\nValor: R$ 150,00.");

            System.out.print("\nInforme o tipo de ingresso que você deseja comprar: 'premium', 'meia' ou 'padrao':");
            String ingresso = scan.nextLine();
            if (!ingresso.equalsIgnoreCase("meia") && !ingresso.equalsIgnoreCase("padrao") && !ingresso.equalsIgnoreCase("premium")) {
                System.out.println("Ingresso Inválido");
                System.exit(0);
            }
            System.out.print("Informe a quantidade de ingresso que deseja comprar \nNo máximo 3 ingressos");
            int quantidade = scan.nextInt();

            if (quantidade >= 4 || 0 >= quantidade) {
                System.out.println("Quantidade Inválida");
                System.exit(0);
            }
            if (ingresso.equalsIgnoreCase("meia")) {
                System.out.println("Informe o código de uso da sua carteirinha");
                String codigo = scan2.nextLine();

                if (codigo.length() == 9) {
                    double valor = 25 * quantidade;
                    System.out.println(
                            "=====================================\n" +
                                    "        Fatura (1ª Impressão)   \n" +
                                    "=====================================\n" +
                                    "Nome: " + nome + "\n" +
                                    "IGRESSO MEIA ESTUDANTE\n" +
                                    "Código de Uso: " + codigo + "\n" +
                                    "Email: " + email + "\n" +
                                    "Data: " + data + "\n" +
                                    "Quantidade de ingressos: " + quantidade +
                                    "\nValor: R$ " + String.format("%.2f", valor) + "\n" +
                                    "=====================================\n" +
                                    "||  |  || ||| ||  |   ||  ||  ||  \n" +
                                    "||  |  || ||| ||  |   ||  ||  ||  \n" +
                                    String.format("%.0f%n", numeroAleatorio) + // Aqui, estamos formatando o número para exibir como inteiro
                                    "=====================================\n" +
                                    "    Agradecemos pela preferência! \n" +
                                    "=====================================");
                } else {
                    System.out.println("Código Inválido");
                }
            }
            if (ingresso.equalsIgnoreCase("padrao")) {

                double valor = 50 * quantidade;
                System.out.println("=====================================\n" +
                        "        Fatura (1ª Impressão)   \n" +
                        "=====================================\n" +
                        "IGRESSO PADRÃO\n" +
                        "Nome: " + nome + "\n" +
                        "Email: " + email + "\n" +
                        "Data: " + data + "\n" +
                        "Quantidade de ingressos: " + quantidade +
                        "\nValor: R$ " + String.format("%.2f", valor) + "\n" +
                        "||  |  || ||| ||  |   ||  ||  ||  \n" +
                        "||  |  || ||| ||  |   ||  ||  ||  \n" +
                        String.format("%.0f%n", numeroAleatorio) +
                        "=====================================\n" +
                        "    Agradecemos pela preferência! \n" +
                        "=====================================");
            }
            if (ingresso.equalsIgnoreCase("premium")) {
                double valor = 150 * quantidade;
                System.out.println("=====================================\n" +
                        "        Fatura (1ª Impressão)   \n" +
                        "=====================================\n" +
                        "IGRESSO PREMIUM\n" +
                        "Nome: " + nome + "\n" +
                        "Email: " + email + "\n" +
                        "Data: " + data + "\n" +
                        "Quantidade de ingressos: " + quantidade +
                        "\nValor: R$ " + String.format("%.2f", valor) + "\n" +
                        "||  |  || ||| ||  |   ||  ||  ||  \n" +
                        "||  |  || ||| ||  |   ||  ||  ||  \n" +
                        String.format("%.0f%n", numeroAleatorio) +
                        "=====================================\n" +
                        "    Agradecemos pela preferência! \n" +
                        "=====================================");
            }
        }
        if (escolha == 5) {
            System.out.print("Informe sua senha para fechar o programa:     ");
            sc.nextLine();
            String senhaDigitada = sc.nextLine();

            if (senha.equals(senhaDigitada)) {
                System.out.println("Senha Correta!");
                System.out.println("Saindo....");
                System.exit(0);
            }

            System.out.println("Senha Invalida!");
            System.exit(0);
        }
        if (escolha > 5) {
            System.out.println("Opcao Invalida!");
            System.exit(0);
        }

        sc.close();


    }
}