package sistemaimobiliario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class TelaListagem extends JFrame {

    public TelaListagem() {
        setTitle("Lista de Clientes");
        setSize(720, 420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel lblTopo = new JLabel("Clientes Registrados", SwingConstants.CENTER);
        lblTopo.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblTopo.setBorder(BorderFactory.createEmptyBorder(12, 0, 12, 0));
        add(lblTopo, BorderLayout.NORTH);

        String[] headers = {"Nome Completo", "Prazo para Aprovação", "Situação"};
        Object[][] registros = {
            {"Ana Paula Lima", "2 dias", "Aguardando"},
            {"Fernando Rocha", "5 dias", "Aprovado"},
            {"Bruno Cesar Costa", "9 dias", "Recusado"},
            {"Larissa Martins", "3 dias", "Aprovado"},
            {"Tiago Henrique Silva", "6 dias", "Recusado"},
            {"Juliana Moreira", "7 dias", "Aguardando"},
            {"Patrícia Gomes", "4 dias", "Aprovado"},
            {"Eduardo Nascimento", "8 dias", "Recusado"}
        };

        JTable table = new JTable(new DefaultTableModel(registros, headers));
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JButton btnRefresh = new JButton("Recarregar");
        btnRefresh.setBackground(new Color(65, 105, 225));
        btnRefresh.setForeground(Color.WHITE);
        bottomPanel.add(btnRefresh);

        JButton btnBack = new JButton("Retornar");
        btnBack.setBackground(new Color(178, 34, 34));
        btnBack.setForeground(Color.WHITE);
        bottomPanel.add(btnBack);

        add(bottomPanel, BorderLayout.SOUTH);

        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaHome();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaListagem());
    }
}
