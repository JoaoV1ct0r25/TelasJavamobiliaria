package sistemaimobiliario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaHome extends JFrame {

    public TelaHome() {
        setTitle("Página Inicial - Sistema de Imóveis");
        setSize(520, 420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(230, 230, 230));

        JLabel lblTitulo = new JLabel("Imobiliária Esperança");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 26));
        lblTitulo.setBounds(110, 25, 350, 35);
        lblTitulo.setForeground(new Color(30, 30, 30));
        add(lblTitulo);

        JLabel lblMensagem = new JLabel("Gerencie aqui seus clientes e cadastros!");
        lblMensagem.setFont(new Font("Arial", Font.PLAIN, 15));
        lblMensagem.setBounds(100, 70, 350, 25);
        lblMensagem.setForeground(new Color(50, 50, 50));
        add(lblMensagem);

        JButton btnNovoCadastro = new JButton("Novo Cadastro");
        btnNovoCadastro.setBounds(160, 130, 190, 45);
        btnNovoCadastro.setBackground(new Color(65, 105, 225));
        btnNovoCadastro.setForeground(Color.WHITE);
        btnNovoCadastro.setFont(new Font("Arial", Font.BOLD, 14));
        add(btnNovoCadastro);

        JButton btnVerLista = new JButton("Ver Lista de Clientes");
        btnVerLista.setBounds(160, 200, 190, 45);
        btnVerLista.setBackground(new Color(46, 139, 87));
        btnVerLista.setForeground(Color.WHITE);
        btnVerLista.setFont(new Font("Arial", Font.BOLD, 14));
        add(btnVerLista);

        btnNovoCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaCadastro();
            }
        });

        btnVerLista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaListagem();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
