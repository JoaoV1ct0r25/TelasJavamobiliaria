package sistemaimobiliario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaCadastro extends JFrame {

    public TelaCadastro() {
        setTitle("Formulário de Cadastro");
        setSize(480, 580);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel lblTitulo = new JLabel("Formulário de Cadastro");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitulo.setBounds(140, 15, 300, 30);
        add(lblTitulo);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(40, 60, 100, 25);
        add(lblNome);
        JTextField txtNome = new JTextField();
        txtNome.setBounds(140, 60, 280, 25);
        add(txtNome);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(40, 100, 100, 25);
        add(lblCpf);
        JTextField txtCpf = new JTextField();
        txtCpf.setBounds(140, 100, 280, 25);
        add(txtCpf);

        JLabel lblNascimento = new JLabel("Nascimento:");
        lblNascimento.setBounds(40, 140, 120, 25);
        add(lblNascimento);
        JTextField txtNascimento = new JTextField();
        txtNascimento.setBounds(160, 140, 260, 25);
        add(txtNascimento);

        JLabel lblRenda = new JLabel("Renda Mensal:");
        lblRenda.setBounds(40, 180, 100, 25);
        add(lblRenda);
        JTextField txtRenda = new JTextField();
        txtRenda.setBounds(140, 180, 280, 25);
        add(txtRenda);

        JLabel lblEstado = new JLabel("Estado Civil:");
        lblEstado.setBounds(40, 220, 100, 25);
        add(lblEstado);
        JTextField txtEstado = new JTextField();
        txtEstado.setBounds(140, 220, 280, 25);
        add(txtEstado);

        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setBounds(40, 260, 100, 25);
        add(lblEndereco);
        JTextField txtEndereco = new JTextField();
        txtEndereco.setBounds(140, 260, 280, 25);
        add(txtEndereco);

        JLabel lblTrabalho = new JLabel("Trabalho:");
        lblTrabalho.setBounds(40, 300, 120, 25);
        add(lblTrabalho);
        String[] opcoesTrabalho = {"CLT", "PJ", "Freelancer"};
        JComboBox<String> cmbTrabalho = new JComboBox<>(opcoesTrabalho);
        cmbTrabalho.setBounds(140, 300, 280, 25);
        add(cmbTrabalho);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(160, 360, 150, 35);
        btnSalvar.setBackground(new Color(100, 149, 237));
        btnSalvar.setForeground(Color.WHITE);
        add(btnSalvar);

        JButton btnRetornar = new JButton("Retornar");
        btnRetornar.setBounds(15, 500, 100, 30);
        add(btnRetornar);

        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com êxito!");
                txtNome.setText("");
                txtCpf.setText("");
                txtNascimento.setText("");
                txtRenda.setText("");
                txtEstado.setText("");
                txtEndereco.setText("");
                cmbTrabalho.setSelectedIndex(0);
            }
        });

        btnRetornar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaHome();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
