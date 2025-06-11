package sistemaimobiliario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaCadastro extends JFrame {

    public TelaCadastro() {
        setTitle("Cadastro de Pessoa");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(250, 250, 250));

        JLabel titulo = new JLabel("Cadastro de Pessoa");
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        titulo.setBounds(150, 20, 300, 30);
        add(titulo);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(50, 70, 100, 25);
        add(nomeLabel);
        JTextField nomeField = new JTextField();
        nomeField.setBounds(150, 70, 250, 25);
        add(nomeField);

        JLabel cpfLabel = new JLabel("CPF:");
        cpfLabel.setBounds(50, 110, 100, 25);
        add(cpfLabel);
        JTextField cpfField = new JTextField();
        cpfField.setBounds(150, 110, 250, 25);
        add(cpfField);

        JLabel dataNascLabel = new JLabel("Data de Nascimento:");
        dataNascLabel.setBounds(50, 150, 150, 25);
        add(dataNascLabel);
        JTextField dataNascField = new JTextField();
        dataNascField.setBounds(200, 150, 200, 25);
        add(dataNascField);

        JLabel rendaLabel = new JLabel("Renda:");
        rendaLabel.setBounds(50, 190, 100, 25);
        add(rendaLabel);
        JTextField rendaField = new JTextField();
        rendaField.setBounds(150, 190, 250, 25);
        add(rendaField);

        JLabel estadoCivilLabel = new JLabel("Estado Civil:");
        estadoCivilLabel.setBounds(50, 230, 100, 25);
        add(estadoCivilLabel);
        JTextField estadoCivilField = new JTextField();
        estadoCivilField.setBounds(150, 230, 250, 25);
        add(estadoCivilField);

        JLabel enderecoLabel = new JLabel("Endereço:");
        enderecoLabel.setBounds(50, 270, 100, 25);
        add(enderecoLabel);
        JTextField enderecoField = new JTextField();
        enderecoField.setBounds(150, 270, 250, 25);
        add(enderecoField);

        JLabel trabalhoLabel = new JLabel("Tipo de Trabalho:");
        trabalhoLabel.setBounds(50, 310, 150, 25);
        add(trabalhoLabel);

        String[] tiposTrabalho = {"CLT", "PJ", "Autônomo"};
        JComboBox<String> trabalhoCombo = new JComboBox<>(tiposTrabalho);
        trabalhoCombo.setBounds(200, 310, 200, 25);
        add(trabalhoCombo);

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(170, 370, 130, 35);
        cadastrarButton.setBackground(new Color(70, 130, 180));
        cadastrarButton.setForeground(Color.WHITE);
        add(cadastrarButton);

        JButton voltarButton = new JButton("Voltar");
        voltarButton.setBounds(10, 510, 90, 30);
        add(voltarButton);

        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");
                nomeField.setText("");
                cpfField.setText("");
                dataNascField.setText("");
                rendaField.setText("");
                estadoCivilField.setText("");
                enderecoField.setText("");
                trabalhoCombo.setSelectedIndex(0);
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaHome();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
