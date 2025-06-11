package sistemaimobiliario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaLogin extends JFrame {

    public TelaLogin() {
        setTitle("Login - Sistema Imobiliário");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(240, 240, 240));

        JLabel titulo = new JLabel("Bem-vindo à Imobiliária!");
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        titulo.setBounds(80, 20, 300, 30);
        add(titulo);

        JLabel usuarioLabel = new JLabel("Usuário:");
        usuarioLabel.setBounds(50, 70, 80, 25);
        add(usuarioLabel);

        JTextField usuarioField = new JTextField();
        usuarioField.setBounds(130, 70, 200, 25);
        add(usuarioField);

        JLabel senhaLabel = new JLabel("Senha:");
        senhaLabel.setBounds(50, 110, 80, 25);
        add(senhaLabel);

        JPasswordField senhaField = new JPasswordField();
        senhaField.setBounds(130, 110, 200, 25);
        add(senhaField);

        JButton loginButton = new JButton("Entrar");
        loginButton.setBounds(150, 160, 100, 30);
        loginButton.setBackground(new Color(70, 130, 180));
        loginButton.setForeground(Color.WHITE);
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioField.getText();
                String senha = new String(senhaField.getPassword());

                if (usuario.equals("admin")&& senha.equals("123")) {
                    dispose();
                    new TelaHome();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
                }
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaLogin();
    }
}
