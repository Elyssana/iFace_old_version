import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class Conta {
    
    public static void criar(ArrayList<Usuario> usuarios){//criação de conta

        Scanner input = new Scanner(System.in);

        String nome;
        String senha;
        String login;
        Usuario usuario = null;

        System.out.println("Insira o login do usuário");
        login = input.next();

        System.out.println("Insira a senha do usuário");
        senha = input.next();

        System.out.println("Insira o nome do usuário");
        nome = input.next();


        usuario = new Usuario(login, senha, nome);

        usuarios.add(usuario);

        System.out.println("\nUsuário criado com sucesso!\n");

    }

    public static void remover(ArrayList<Usuario> usuarios) {//remoção da conta
    
        Scanner input = new Scanner(System.in);
        String nome;

        System.out.println("Nome do usuario");
        nome = input.next();

        for (Usuario i : usuarios) {
            if (Objects.equals(nome, i.nome)) {

                System.out.println(i.nome);
                usuarios.remove(i);

            }
            else{
                System.out.println("usuario não encontrado");
            }
            
        }
        
    }
    
}