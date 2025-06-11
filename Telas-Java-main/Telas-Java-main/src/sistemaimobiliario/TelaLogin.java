package sistemaimobiliario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaLogin extends JFrame {

    public TelaLogin() {
        setTitle("Sistema Imobiliário - Login");
        setSize(420, 320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(230, 230, 230));

        JLabel lblTitulo = new JLabel("Login da Imobiliária");
        lblTitulo.setFont(new Font("Verdana", Font.BOLD, 19));
        lblTitulo.setBounds(90, 25, 300, 30);
        add(lblTitulo);

        JLabel lblUsuario = new JLabel("Nome de usuário:");
        lblUsuario.setBounds(40, 80, 110, 25);
        add(lblUsuario);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(160, 80, 210, 25);
        add(txtUsuario);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(40, 120, 110, 25);
        add(lblSenha);

        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBounds(160, 120, 210, 25);
        add(txtSenha);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(160, 170, 100, 35);
        btnLogin.setBackground(new Color(65, 105, 225));
        btnLogin.setForeground(Color.WHITE);
        add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String senha = new String(txtSenha.getPassword());

                if (usuario.equals("admin") && senha.equals("123")) {
                    dispose();
                    new TelaHome();
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou senha inválidos!");
                }
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaLogin());
    }
}
