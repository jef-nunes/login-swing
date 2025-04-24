package dao;

import java.util.ArrayList;
import modelo.Pessoa;

public class PessoaDAO {
    private static ArrayList<Pessoa> lista = new ArrayList<>();
    public void adicionar(Pessoa pessoa){
        lista.add(pessoa);
    }
    public ArrayList<Pessoa> listar(){
        return lista;
    }
}
