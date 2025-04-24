package dao;

import java.util.ArrayList;
import modelo.Usuario;

public class UsuarioDAO {
    private final ArrayList<Usuario> usuarios = new ArrayList();
    public UsuarioDAO(){
        usuarios.add(new Usuario("admin","admin"));
    }
    public boolean autenticar(String nomeUsuario, String senha){
        for(Usuario u : usuarios){
            if (u.getNomeUsuario().equals(nomeUsuario) && u.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
}