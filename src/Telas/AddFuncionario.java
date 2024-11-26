package com.mycompany.trabalhosexta;

import model.dao.DaoFactory;
import model.dao.FuncionarioDao;
import model.entities.Funcionario;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AddFuncionario extends JFrame {

    // Declaração dos componentes
    private JTextField nomeField, cpfField, emailField, idadeField, dataNascField, cargoField, cepField, sexoField;
    private JButton salvarButton, sairButton;

    // Construtor
    public AddFuncionario() {
        initComponents();
    }

    // Método para inicializar os componentes da interface
    private void initComponents() {
        // Configurações da janela
        setTitle("Adicionar Funcionário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(750, 200);
        setSize(400, 400);
        setLayout(new BorderLayout());

        // Painel principal
        JPanel mainPanel = new JPanel(new GridLayout(10, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.setBackground(Color.LIGHT_GRAY);

        // Labels e campos de texto
        mainPanel.add(new JLabel("Nome: "));
        nomeField = new JTextField();
        mainPanel.add(nomeField);

        mainPanel.add(new JLabel("CPF: "));
        cpfField = new JTextField();
        mainPanel.add(cpfField);

        mainPanel.add(new JLabel("Email: "));
        emailField = new JTextField();
        mainPanel.add(emailField);

        mainPanel.add(new JLabel("Idade: "));
        idadeField = new JTextField();
        mainPanel.add(idadeField);

        mainPanel.add(new JLabel("Data de Nascimento: "));
        dataNascField = new JTextField("dd/MM/yyyy");
        mainPanel.add(dataNascField);

        mainPanel.add(new JLabel("Cargo: "));
        cargoField = new JTextField();
        mainPanel.add(cargoField);

        mainPanel.add(new JLabel("CEP: "));
        cepField = new JTextField();
        mainPanel.add(cepField);

        mainPanel.add(new JLabel("Sexo: "));
        sexoField = new JTextField();
        mainPanel.add(sexoField);

        // Botões
        salvarButton = new JButton("Salvar");
        salvarButton.addActionListener(e -> salvarFuncionario());
        mainPanel.add(salvarButton);

        sairButton = new JButton("Sair");
        sairButton.addActionListener(e -> this.dispose());
        mainPanel.add(sairButton);

        // Adicionando o painel principal à janela
        add(mainPanel, BorderLayout.CENTER);

        pack(); // Ajusta o tamanho da janela
        setVisible(true);
    }

    // Método para salvar o funcionário
    private void salvarFuncionario() {
        try {
            // Criando o objeto Funcionario
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(nomeField.getText());
            funcionario.setCpf(cpfField.getText());
            funcionario.setEmail(emailField.getText());
            funcionario.setIdade(Integer.parseInt(idadeField.getText()));
            funcionario.setDataNascimento(Integer.parseInt(dataNascField.getText()));
            funcionario.setCargo(cargoField.getText());

            // Salvando o funcionário via DAO
            FuncionarioDao funcionarioDao = DaoFactory.createFuncionarioDao();
            funcionarioDao.createFuncionario(funcionario);

            // Mostra mensagem de sucesso e limpa os campos
            JOptionPane.showMessageDialog(this, "Funcionário salvo com sucesso!");
            limparCampos();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro: Idade deve ser um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro: Data de nascimento no formato inválido. Use dd/MM/yyyy.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar o funcionário: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para limpar os campos
    private void limparCampos() {
        nomeField.setText("");
        cpfField.setText("");
        emailField.setText("");
        idadeField.setText("");
        dataNascField.setText("dd/MM/yyyy");
        cargoField.setText("");
        cepField.setText("");
        sexoField.setText("");
    }

    // Método para converter uma String para LocalDate
    private LocalDate parseDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, formatter);
    }

    // Método principal para executar a aplicação
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AddFuncionario::new);
    }
}
