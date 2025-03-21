import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

        System.out.println("\n Menu: ");
        System.out.println("( 1 ) Alterar Nome");
        System.out.println("( 2 ) Alterar Email");
        System.out.println("( 3 ) Imprimir dados do Participante");
        System.out.println("( 4 ) Comprar Ingresso");
        System.out.println("( 5 ) Sair");

        System.out.print("\nSelecione: ");
        int escolha = sc.nextInt();

        if (escolha == 1){
            System.out.println("\n========== Alteração de Nome ==========\n");

            System.out.print("Informe o novo nome: ");
            sc.nextLine();
            String novoNome = sc.nextLine();

            if(novoNome.length() >= 3){
                nome = novoNome;
                if(nome.trim().contains(" ")){
                    System.out.println("""
                                   Nome alterado com sucesso.
                                   novo nome: 
                                   """+novoNome);
                }else {
                    System.out.println("nome sem espaço");
                    System.exit(0);
                }


            }else{
                System.out.println("Nome menor que 3 letras");
                System.exit(0);
            }
        }
        if (escolha == 2){


            String novoEmail = "andre";

            if (novoEmail.contains("@") && novoEmail.endsWith(".com")){

                    System.out.println("""
                                   Email alterado com sucesso
                                   seu novo email é
                                   """+novoEmail);

            }


        }
        if (escolha == 3){

        }
        if (escolha == 4){

        }
        if (escolha == 5){

        }
        if (escolha < 5){

        }

        sc.close();


    }
}