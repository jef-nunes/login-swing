package principal;

import view.LoginView;

// Classe principal
public class Principal {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
    }
}
