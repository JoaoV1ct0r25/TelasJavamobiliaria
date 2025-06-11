package sistemaimobiliario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaHome extends JFrame {

    public TelaHome() {
        setTitle("Home - Sistema Imobiliário");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(245, 245, 245));

        JLabel titulo = new JLabel("Imobiliária Confiança");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titulo.setBounds(120, 30, 300, 30);
        titulo.setForeground(new Color(40, 40, 40));
        add(titulo);

        JLabel subtitulo = new JLabel("Bem-vindo ao sistema de gestão de clientes!");
        subtitulo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        subtitulo.setBounds(90, 70, 400, 25);
        subtitulo.setForeground(new Color(60, 60, 60));
        add(subtitulo);

        JButton btnCadastro = new JButton("Cadastrar Pessoa");
        btnCadastro.setBounds(150, 130, 180, 40);
        btnCadastro.setBackground(new Color(70, 130, 180));
        btnCadastro.setForeground(Color.WHITE);
        btnCadastro.setFont(new Font("Segoe UI", Font.BOLD, 14));
        add(btnCadastro);

        JButton btnListagem = new JButton("Listar Pessoas");
        btnListagem.setBounds(150, 190, 180, 40);
        btnListagem.setBackground(new Color(34, 139, 34));
        btnListagem.setForeground(Color.WHITE);
        btnListagem.setFont(new Font("Segoe UI", Font.BOLD, 14));
        add(btnListagem);

        btnCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaCadastro();
            }
        });

        btnListagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaListagem();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
