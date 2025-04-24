package controle;

import dao.UsuarioDAO;

public class UsuarioControle {
    private final UsuarioDAO dao = new UsuarioDAO();
    public boolean autenticar(String nomeUsuario, String senha){
        return dao.autenticar(nomeUsuario, senha);
    }
}
