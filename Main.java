import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args)
    {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        while(true){
            Conta.criar(usuarios);
        }

        //Conta.remover(usuarios);
    }

}