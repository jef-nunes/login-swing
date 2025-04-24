package controle;

import dao.PessoaDAO;
import modelo.Pessoa;
import java.util.ArrayList;

public class PessoaControle {
    private PessoaDAO dao = new PessoaDAO();
    public void cadastrar(String nome, int idade){
        Pessoa p = new Pessoa(nome, idade);
        dao.adicionar(p);
    }
    public ArrayList<Pessoa> listar(){
        return dao.listar();
    }
}
