package sistemaimobiliario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class TelaListagem extends JFrame {

    public TelaListagem() {
        setTitle("Listagem de Pessoas");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Pessoas Cadastradas", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(titulo, BorderLayout.NORTH);

        String[] colunas = {"Nome", "Dias para Aprovação", "Status"};
        Object[][] dados = {
            {"João Silva Oliveira", "3 dias", "Aprovado"},
            {"Maria Souza de Silva", "7 dias", "Aguardando"},
            {"Carlos Augusto Lima", "10 dias", "Recusado"},
            {"Roberto Cunha Cardoso", "4 dias", "Recusado"},
            {"Gustavo Coutinho Leite", "8 dias", "Aprovado"},
            {"Mariana Roberta Socorro de Jesus", "5 dias", "Aguardando"},
            {"Gabriela Ferreira", "6 dias", "Recusado"},
            {"Carla Lima Mendes", "1 dia", "Aprovado"}
        };

        JTable tabela = new JTable(new DefaultTableModel(dados, colunas));
        JScrollPane scroll = new JScrollPane(tabela);
        add(scroll, BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JButton atualizar = new JButton("Atualizar");
        atualizar.setBackground(new Color(100, 149, 237));
        atualizar.setForeground(Color.WHITE);
        painelBotoes.add(atualizar);

        JButton voltar = new JButton("Voltar");
        voltar.setBackground(new Color(220, 20, 60));
        voltar.setForeground(Color.WHITE);
        painelBotoes.add(voltar);

        add(painelBotoes, BorderLayout.SOUTH);

        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaHome();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaListagem();
    }
}
