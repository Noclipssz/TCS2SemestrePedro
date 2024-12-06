/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;


import model.dao.*;
import model.entities.Car;
import model.entities.Cliente;
import model.entities.Franquia;
import model.entities.Funcionario;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class MenuPrincipal extends javax.swing.JFrame {


    public MenuPrincipal() {
        initComponents();
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(false);
        jDeletar.setVisible(false);
        jMenuPrincipal.setVisible(true);

    }

    private void preencherTabelaFuncionario() {
        // Definindo as colunas da tabela
        String[] colunas = {"ID", "Nome", "CPF", "Email", "Idade", "Data de Nascimento", "CEP", "Cargo"};

        // Criando o modelo de tabela com as colunas
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        // Obtendo a lista de funcionários do banco de dados
        FuncionarioDao funcionarioDao = DaoFactory.createFuncionarioDao();
        List<Funcionario> funcionarios = funcionarioDao.findAll(); // Supondo que o método 'findAll()' traga todos os funcionários

        // Preenchendo a tabela com os dados da lista de funcionários
        for (Funcionario funcionario : funcionarios) {
            modelo.addRow(new Object[]{
                    funcionario.getIdFuncionario(),
                    funcionario.getNome(),
                    funcionario.getCpf(),
                    funcionario.getEmail(),
                    funcionario.getIdade(),
                    funcionario.getDataNascimento(),
                    funcionario.getCep(),
                    funcionario.getCargo()
            });
        }

        // Definindo o modelo da tabela na JTable
        jTabela.setModel(modelo);


        jTabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        // Associando a tabela ao JScrollPane
        jScrollPane1.setViewportView(jTabela);
    }

    private void preencherTabelaCliente() {

        String[] colunas = {"ID", "Nome", "CPF", "Email", "CEP", "Idade", "Data de Nascimento"};

        // Criando o modelo de tabela com as colunas
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        // Obtendo a lista de clientes do banco de dados
        ClienteDao clienteDao = DaoFactory.createClienteDao();
        List<Cliente> clientes = clienteDao.findAll(); // Supondo que o método 'findAll()' traga todos os clientes

        // Preenchendo a tabela com os dados da lista de clientes
        for (Cliente cliente : clientes) {
            modelo.addRow(new Object[]{
                    cliente.getId(),
                    cliente.getNome(),
                    cliente.getCpf(),
                    cliente.getEmail(),
                    cliente.getCep(),
                    cliente.getIdade(),
                    cliente.getDataNascimento()
            });
        }

        // Definindo o modelo da tabela na JTable
        jTabela.setModel(modelo);

        // Definindo a borda da tabela
        jTabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        // Associando a tabela ao JScrollPane
        jScrollPane1.setViewportView(jTabela);
    }

    private void preencherTabelaFranquia() {
        // Definindo as colunas da tabela
        String[] colunas = {"ID", "CEP", "Gerente", "Número de Funcionários"};

        // Criando o modelo de tabela com as colunas
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        // Obtendo a lista de franquias do banco de dados
        FranquiaDao franquiaDao = DaoFactory.createFranquiaDao();
        List<Franquia> franquias = franquiaDao.findAll(); // Supondo que o método 'findAll()' traga todas as franquias

        // Preenchendo a tabela com os dados da lista de franquias
        for (Franquia franquia : franquias) {
            modelo.addRow(new Object[]{
                    franquia.getIdFranquia(),
                    franquia.getCep(),
                    franquia.getGerente(),
                    franquia.getNumeroFuncionarios()
            });
        }

        // Definindo o modelo da tabela na JTable
        jTabela.setModel(modelo);

        // Definindo a borda da tabela
        jTabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        // Associando a tabela ao JScrollPane
        jScrollPane1.setViewportView(jTabela);
    }

    private void preencherTabelaCar() {
        // Definindo as colunas da tabela
        String[] colunas = {"ID", "Marca", "Modelo", "Ano", "Cor", "Preço"};

        // Criando o modelo de tabela com as colunas
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        // Obtendo a lista de carros do banco de dados
        CarDao carDao = DaoFactory.createCarDao();
        List<Car> cars = carDao.findAll(); // Supondo que o método 'findAll()' traga todos os carros

        // Preenchendo a tabela com os dados da lista de carros
        for (Car car : cars) {
            modelo.addRow(new Object[]{
                    car.getId(),
                    car.getMarca(),
                    car.getModelo(),
                    car.getAno(),
                    car.getCor(),
                    car.getValor()
            });
        }

        // Definindo o modelo da tabela na JTable
        jTabela.setModel(modelo);

        // Definindo a borda da tabela
        jTabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        // Associando a tabela ao JScrollPane
        jScrollPane1.setViewportView(jTabela);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jAddFuncionario = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        idadeField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cpfField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dataNascField = new javax.swing.JTextField();
        cargoField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bSalvarfuncionario = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cepField = new javax.swing.JTextField();
        bVoltarFuncionario = new javax.swing.JButton();
        jAddFranquia = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fGerente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fTotalF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        bSalvarFranquia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Fcep = new javax.swing.JTextField();
        bVoltarFranquia = new javax.swing.JButton();
        jAddCliente = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cIdade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cCpf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cData = new javax.swing.JTextField();
        cEmail = new javax.swing.JTextField();
        cCep = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cNome = new javax.swing.JTextField();
        jSalvarCliente = new javax.swing.JButton();
        bVoltarCliente = new javax.swing.JButton();
        jAddCarro = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tfCor = new javax.swing.JTextField();
        tfPlaca = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        tfModelo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        bSalvarCarro = new javax.swing.JButton();
        bVoltarCarro = new javax.swing.JButton();
        jMenuPrincipal = new javax.swing.JPanel();
        bAddCarro = new javax.swing.JButton();
        bAddCliente = new javax.swing.JButton();
        bAddFranquia = new javax.swing.JButton();
        bAddFuncionario = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        bSair1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDeletar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        bDeletarId = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        bVoltarTabela = new javax.swing.JButton();
        tfInserirId = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        ComboBox13 = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jAddFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        jAddFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Adicionar Funcionario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 1, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Nome  :");

        nomeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("idade  :");

        idadeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("CPF  :");

        cpfField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Data/Nasc  :");

        dataNascField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dataNascField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascFieldActionPerformed(evt);
            }
        });

        cargoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Cargo  :");

        bSalvarfuncionario.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 14)); // NOI18N
        bSalvarfuncionario.setText("Salvar");
        bSalvarfuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSalvarfuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarfuncionarioActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Email  :");

        emailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setText("CEP  :");

        cepField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bVoltarFuncionario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bVoltarFuncionario.setText("<");
        bVoltarFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bVoltarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jAddFuncionarioLayout = new javax.swing.GroupLayout(jAddFuncionario);
        jAddFuncionario.setLayout(jAddFuncionarioLayout);
        jAddFuncionarioLayout.setHorizontalGroup(
                jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jAddFuncionarioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bSalvarfuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                        .addGroup(jAddFuncionarioLayout.createSequentialGroup()
                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jAddFuncionarioLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(bVoltarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jAddFuncionarioLayout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(jAddFuncionarioLayout.createSequentialGroup()
                                                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jLabel11)
                                                                        .addComponent(jLabel12))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cargoField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jAddFuncionarioLayout.createSequentialGroup()
                                                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel8))
                                                                .addGap(34, 34, 34)
                                                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(idadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(dataNascField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(69, Short.MAX_VALUE))
        );
        jAddFuncionarioLayout.setVerticalGroup(
                jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jAddFuncionarioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bVoltarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jAddFuncionarioLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(idadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(dataNascField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(cargoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jAddFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(cepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(bSalvarfuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        jAddFranquia.setBackground(new java.awt.Color(204, 204, 204));
        jAddFranquia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Adicionar Franquia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 1, 14))); // NOI18N
        jAddFranquia.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Gerente  :");

        fGerente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fGerenteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Total de ");

        fTotalF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fTotalF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTotalFActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel13.setText("Funcionarios  :");

        bSalvarFranquia.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 14)); // NOI18N
        bSalvarFranquia.setText("Salvar");
        bSalvarFranquia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSalvarFranquia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarFranquiaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("CEP  :");

        Fcep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Fcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FcepActionPerformed(evt);
            }
        });

        bVoltarFranquia.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bVoltarFranquia.setText("<");
        bVoltarFranquia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bVoltarFranquia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarFranquiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jAddFranquiaLayout = new javax.swing.GroupLayout(jAddFranquia);
        jAddFranquia.setLayout(jAddFranquiaLayout);
        jAddFranquiaLayout.setHorizontalGroup(
                jAddFranquiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jAddFranquiaLayout.createSequentialGroup()
                                .addContainerGap(54, Short.MAX_VALUE)
                                .addGroup(jAddFranquiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jAddFranquiaLayout.createSequentialGroup()
                                                .addGroup(jAddFranquiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jAddFranquiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel1))
                                                        .addComponent(jLabel3))
                                                .addGap(31, 31, 31))
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jAddFranquiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fTotalF)
                                        .addComponent(fGerente)
                                        .addComponent(Fcep, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
                        .addGroup(jAddFranquiaLayout.createSequentialGroup()
                                .addGroup(jAddFranquiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jAddFranquiaLayout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addComponent(bSalvarFranquia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jAddFranquiaLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(bVoltarFranquia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jAddFranquiaLayout.setVerticalGroup(
                jAddFranquiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jAddFranquiaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bVoltarFranquia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addGroup(jAddFranquiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jAddFranquiaLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13))
                                        .addGroup(jAddFranquiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jAddFranquiaLayout.createSequentialGroup()
                                                        .addGap(96, 96, 96)
                                                        .addComponent(fTotalF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jAddFranquiaLayout.createSequentialGroup()
                                                        .addComponent(Fcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(fGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(bSalvarFranquia, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
        );

        jAddCliente.setBackground(new java.awt.Color(204, 204, 204));
        jAddCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Adicionar Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 1, 14))); // NOI18N

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setText("idade  :");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cIdade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cIdade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel15.setText("CPF  :");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cCpf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCpfActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setText("Data/Nasc  :");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setText("Email  :");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cData.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDataActionPerformed(evt);
            }
        });

        cEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        cCep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cCep.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel18.setText("Nome  :");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setText("CEP  :");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSalvarCliente.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 14)); // NOI18N
        jSalvarCliente.setText("Salvar");
        jSalvarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarClienteActionPerformed(evt);
            }
        });

        bVoltarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bVoltarCliente.setText("<");
        bVoltarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bVoltarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jAddClienteLayout = new javax.swing.GroupLayout(jAddCliente);
        jAddCliente.setLayout(jAddClienteLayout);
        jAddClienteLayout.setHorizontalGroup(
                jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jAddClienteLayout.createSequentialGroup()
                                .addGroup(jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jAddClienteLayout.createSequentialGroup()
                                                .addGap(96, 96, 96)
                                                .addComponent(jSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jAddClienteLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(bVoltarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(133, Short.MAX_VALUE))
                        .addGroup(jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jAddClienteLayout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jAddClienteLayout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jAddClienteLayout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jAddClienteLayout.createSequentialGroup()
                                                        .addComponent(jLabel17)
                                                        .addGap(58, 58, 58)
                                                        .addComponent(cEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jAddClienteLayout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jAddClienteLayout.createSequentialGroup()
                                                        .addGroup(jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel19)
                                                                .addComponent(jLabel18))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(cNome, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                                .addComponent(cCep))))
                                        .addContainerGap(58, Short.MAX_VALUE)))
        );
        jAddClienteLayout.setVerticalGroup(
                jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jAddClienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bVoltarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                                .addComponent(jSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                        .addGroup(jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jAddClienteLayout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel18)
                                                .addComponent(cNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel19))
                                        .addGap(18, 18, 18)
                                        .addGroup(jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel14)
                                                .addComponent(cIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel15)
                                                .addComponent(cCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel16)
                                                .addComponent(cData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jAddClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel17)
                                                .addComponent(cEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(120, Short.MAX_VALUE)))
        );

        jAddCarro.setBackground(new java.awt.Color(204, 204, 204));
        jAddCarro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Adicionar Carro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semibold", 1, 14))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setText("Placa  :");

        tfAno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setText("Valor  :");

        tfCor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfPlaca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setText("Ano  :");

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel23.setText("Cor  :");

        tfMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMarcaActionPerformed(evt);
            }
        });

        tfModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tfModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfModeloActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel24.setText("Marca  :");

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel25.setText("Modelo  :");

        tfValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        bSalvarCarro.setFont(new java.awt.Font("Source Code Pro Semibold", 0, 14)); // NOI18N
        bSalvarCarro.setText("Salvar");
        bSalvarCarro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSalvarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarCarroActionPerformed(evt);
            }
        });

        bVoltarCarro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bVoltarCarro.setText("<");
        bVoltarCarro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bVoltarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarCarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jAddCarroLayout = new javax.swing.GroupLayout(jAddCarro);
        jAddCarro.setLayout(jAddCarroLayout);
        jAddCarroLayout.setHorizontalGroup(
                jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jAddCarroLayout.createSequentialGroup()
                                .addGroup(jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jAddCarroLayout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addComponent(bSalvarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jAddCarroLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(bVoltarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jAddCarroLayout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel24)
                                                .addComponent(jLabel25)
                                                .addComponent(jLabel22)
                                                .addComponent(jLabel20)
                                                .addComponent(jLabel21)
                                                .addComponent(jLabel23))
                                        .addGap(37, 37, 37)
                                        .addGroup(jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfMarca)
                                                .addComponent(tfModelo)
                                                .addComponent(tfAno)
                                                .addComponent(tfPlaca)
                                                .addComponent(tfValor, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                                .addComponent(tfCor))
                                        .addContainerGap(63, Short.MAX_VALUE)))
        );
        jAddCarroLayout.setVerticalGroup(
                jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jAddCarroLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bVoltarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                                .addComponent(bSalvarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                        .addGroup(jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jAddCarroLayout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(9, 9, 9)
                                        .addGroup(jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel22))
                                        .addGap(10, 10, 10)
                                        .addGroup(jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14)
                                        .addGroup(jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jAddCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(175, Short.MAX_VALUE)))
        );

        jMenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        jMenuPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bAddCarro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bAddCarro.setText("Carro");
        bAddCarro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bAddCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddCarroActionPerformeds(evt);
            }
        });

        bAddCliente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bAddCliente.setText("Cliente");
        bAddCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddClienteActionPerformed(evt);
            }
        });

        bAddFranquia.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bAddFranquia.setText("Franquia");
        bAddFranquia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bAddFranquia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddFranquiaActionPerformed(evt);
            }
        });

        bAddFuncionario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bAddFuncionario.setText("Funcionário");
        bAddFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bAddFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddFuncionarioActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel27.setText("Adicionar");
        jLabel27.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel28.setBackground(new java.awt.Color(102, 102, 102));
        jLabel28.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel28.setText("Visualizar / Deletar :");
        jLabel28.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        bSair1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bSair1.setText("Sair");
        bSair1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSair1ActionPerformed(evt);
            }
        });

        jButton1.setText("Carro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Franquia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Funcionario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMenuPrincipalLayout = new javax.swing.GroupLayout(jMenuPrincipal);
        jMenuPrincipal.setLayout(jMenuPrincipalLayout);
        jMenuPrincipalLayout.setHorizontalGroup(
                jMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jMenuPrincipalLayout.createSequentialGroup()
                                .addGroup(jMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jMenuPrincipalLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel26)))
                                .addGroup(jMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jMenuPrincipalLayout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(jLabel27))
                                        .addGroup(jMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jMenuPrincipalLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel28))
                                                        .addGroup(jMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(bAddCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bAddFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bAddCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bAddFranquia, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(139, Short.MAX_VALUE))
        );
        jMenuPrincipalLayout.setVerticalGroup(
                jMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jMenuPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jLabel26)
                                .addGap(517, 517, 517))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMenuPrincipalLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27)
                                .addGap(24, 24, 24)
                                .addComponent(bAddCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bAddFranquia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(bAddFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
        );

        jDeletar.setBackground(new java.awt.Color(204, 204, 204));
        jDeletar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tabela", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));

        jTabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabela.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                },
                new String[]{
                        "id", "make", "model", "year", "color", "mileage", "price"
                }
        ));
        jScrollPane1.setViewportView(jTabela);

        bDeletarId.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bDeletarId.setText("Deletar");
        bDeletarId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bDeletarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletarIdActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel29.setText("Digite o id a ser deletado  :");

        bVoltarTabela.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        bVoltarTabela.setText("<");
        bVoltarTabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bVoltarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarTabelaActionPerformed(evt);
            }
        });

        tfInserirId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Carro\t", "Cliente", "Funcionario", "Franquia"}));
        ComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jDeletarLayout = new javax.swing.GroupLayout(jDeletar);
        jDeletar.setLayout(jDeletarLayout);
        jDeletarLayout.setHorizontalGroup(
                jDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDeletarLayout.createSequentialGroup()
                                .addGroup(jDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jDeletarLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(jDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                                                        .addGroup(jDeletarLayout.createSequentialGroup()
                                                                .addComponent(bVoltarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 642, Short.MAX_VALUE))))
                                        .addGroup(jDeletarLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel29)
                                                .addGap(52, 52, 52)
                                                .addComponent(tfInserirId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(52, 52, 52)
                                                .addComponent(bDeletarId, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jDeletarLayout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDeletarLayout.setVerticalGroup(
                jDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDeletarLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(bVoltarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfInserirId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel29)
                                        .addComponent(bDeletarId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(158, 158, 158)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jAddFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jAddFranquia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jAddCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jAddFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jAddCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jAddFranquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(39, Short.MAX_VALUE))
        );

        jMenuPrincipal.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bAddCarroActionPerformeds(ActionEvent evt) {
        CarDao carDao = DaoFactory.createCarDao();
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(true);
        jDeletar.setVisible(false);
        jMenuPrincipal.setVisible(false);

        carDao.inserir(new Car(null, tfValor.getText(), tfPlaca.getText(), tfModelo.getText(), Integer.parseInt(tfAno.getText()), tfMarca.getText(), tfAno.getText()));
        tfValor.setText(""); tfCor.setText(""); tfModelo.setText(""); tfAno.setText(""); tfPlaca.setText("");
        tfMarca.setText("");
        tfMarca.grabFocus();
    }

    private void dataNascFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNascFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascFieldActionPerformed

    private void bSalvarfuncionarioActionPerformed(java.awt.event.ActionEvent evt) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nomeField.getText());
        funcionario.setCpf(cpfField.getText());
        funcionario.setEmail(emailField.getText());
        funcionario.setIdade(Integer.parseInt(idadeField.getText()));
        funcionario.setDataNascimento(Integer.parseInt(dataNascField.getText()));
        funcionario.setCargo(cargoField.getText());
        funcionario.setCep(cepField.getText());

        FuncionarioDao funcionarioDao = DaoFactory.createFuncionarioDao();
        funcionarioDao.createFuncionario(funcionario);
        nomeField.setText("");
        cpfField.setText("");
        emailField.setText("");
        idadeField.setText("");
        dataNascField.setText("");
        cargoField.setText("");
        cepField.setText("");
    }

    private void bVoltarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarFuncionarioActionPerformed
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(false);
        jDeletar.setVisible(false);
        jMenuPrincipal.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarFuncionarioActionPerformed

    private void fTotalFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTotalFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTotalFActionPerformed

    private void bSalvarFranquiaActionPerformed(java.awt.event.ActionEvent evt) {
        FranquiaDao franquiaDao = DaoFactory.createFranquiaDao();
        franquiaDao.inserir(new Franquia(null, Fcep.getText(), fGerente.getText(), fTotalF.getText()));
        Fcep.setText("");
        fGerente.setText("");
        fTotalF.setText("");
    }

    private void FcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FcepActionPerformed
        //
    }//GEN-LAST:event_FcepActionPerformed

    private void fGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fGerenteActionPerformed

    private void bVoltarFranquiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarFranquiaActionPerformed
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(false);
        jDeletar.setVisible(false);
        jMenuPrincipal.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarFranquiaActionPerformed

    private void cDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDataActionPerformed

    private void jSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarClienteActionPerformed
        ClienteDao clienteDao = DaoFactory.createClienteDao();
        clienteDao.inserir(new Cliente(null, cNome.getText(), cCpf.getText(), cEmail.getText(), cCep.getText(), Integer.parseInt(cIdade.getText()), Integer.parseInt(cData.getText())));
        cNome.setText("");
        cCpf.setText("");
        cEmail.setText("");
        cCep.setText("");
        cIdade.setText("");
        cData.setText("");
        cNome.grabFocus();
    }//GEN-LAST:event_jSalvarClienteActionPerformed

    private void bVoltarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarClienteActionPerformed
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(false);
        jDeletar.setVisible(false);
        jMenuPrincipal.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarClienteActionPerformed

    private void tfModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfModeloActionPerformed

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorActionPerformed

    private void bSalvarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarCarroActionPerformed
        CarDao carDao = DaoFactory.createCarDao();
        carDao.inserir(new Car(null,tfValor.getText(), tfPlaca.getText(), tfModelo.getText(), Integer.parseInt(tfAno.getText()), tfMarca.getText(), tfAno.getText()));
        tfValor.setText(""); tfCor.setText(""); tfModelo.setText(""); tfAno.setText(""); tfPlaca.setText("");
        tfMarca.setText("");
        tfMarca.grabFocus();
    }//GEN-LAST:event_bSalvarCarroActionPerformed

    private void bVoltarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarCarroActionPerformed
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(false);
        jDeletar.setVisible(false);
        jMenuPrincipal.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_bVoltarCarroActionPerformed

    private void bVoltarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarTabelaActionPerformed
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(false);
        jDeletar.setVisible(false);
        jMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_bVoltarTabelaActionPerformed

    private void bSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSair1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_bSair1ActionPerformed

    private void bAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddFuncionarioActionPerformed
        jAddFuncionario.setVisible(true);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(false);
        jDeletar.setVisible(false);
        jMenuPrincipal.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_bAddFuncionarioActionPerformed

    private void bAddFranquiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddFranquiaActionPerformed
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(true);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(false);
        jDeletar.setVisible(false);
        jMenuPrincipal.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_bAddFranquiaActionPerformed

    private void bAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddClienteActionPerformed
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(true);
        jAddCarro.setVisible(false);
        jDeletar.setVisible(false);
        jMenuPrincipal.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_bAddClienteActionPerformed

    private void cCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCpfActionPerformed

    private void tfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMarcaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        preencherTabelaCar();
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(false);
        jMenuPrincipal.setVisible(false);
        jDeletar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        preencherTabelaFranquia();
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(false);
        jMenuPrincipal.setVisible(false);
        jDeletar.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        preencherTabelaFuncionario();
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(false);
        jMenuPrincipal.setVisible(false);
        jDeletar.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        preencherTabelaCliente();
        jAddFuncionario.setVisible(false);
        jAddFranquia.setVisible(false);
        jAddCliente.setVisible(false);
        jAddCarro.setVisible(false);
        jMenuPrincipal.setVisible(false);
        jDeletar.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bDeletarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeletarIdActionPerformed
        String selecionado = (String) ComboBox13.getSelectedItem();
        if (selecionado.equalsIgnoreCase("Carro\t")) {
            CarDao carDao = DaoFactory.createCarDao();
            carDao.deleteById(Integer.parseInt(tfInserirId.getText()));
            preencherTabelaCar();
        }
        if (selecionado.equalsIgnoreCase("Cliente")) {
            ClienteDao carDao = DaoFactory.createClienteDao();
            carDao.deleteById(Integer.parseInt(tfInserirId.getText()));
            preencherTabelaCliente();
        }
        if (selecionado.equalsIgnoreCase("funcionario")) {
            FuncionarioDao carDao = DaoFactory.createFuncionarioDao();
            carDao.deleteFuncionario(Integer.parseInt(tfInserirId.getText()));
            preencherTabelaFuncionario();
        }
        if (selecionado.equalsIgnoreCase("Franquia")) {
            FranquiaDao carDao = DaoFactory.createFranquiaDao();
            carDao.deleteById(Integer.parseInt(tfInserirId.getText()));
            preencherTabelaFranquia();
        }

    }

    private void ComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox13;
    private javax.swing.JTextField Fcep;
    private javax.swing.JButton bAddCarro;
    private javax.swing.JButton bAddCliente;
    private javax.swing.JButton bAddFranquia;
    private javax.swing.JButton bAddFuncionario;
    private javax.swing.JButton bDeletarId;
    private javax.swing.JButton bSair1;
    private javax.swing.JButton bSalvarCarro;
    private javax.swing.JButton bSalvarFranquia;
    private javax.swing.JButton bSalvarfuncionario;
    private javax.swing.JButton bVoltarCarro;
    private javax.swing.JButton bVoltarCliente;
    private javax.swing.JButton bVoltarFranquia;
    private javax.swing.JButton bVoltarFuncionario;
    private javax.swing.JButton bVoltarTabela;
    private javax.swing.JTextField cCep;
    private javax.swing.JTextField cCpf;
    private javax.swing.JTextField cData;
    private javax.swing.JTextField cEmail;
    private javax.swing.JTextField cIdade;
    private javax.swing.JTextField cNome;
    private javax.swing.JTextField cargoField;
    private javax.swing.JTextField cepField;
    private javax.swing.JTextField cpfField;
    private javax.swing.JTextField dataNascField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fGerente;
    private javax.swing.JTextField fTotalF;
    private javax.swing.JTextField idadeField;
    private javax.swing.JPanel jAddCarro;
    private javax.swing.JPanel jAddCliente;
    private javax.swing.JPanel jAddFranquia;
    private javax.swing.JPanel jAddFuncionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jDeletar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jMenuPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jSalvarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfCor;
    private javax.swing.JTextField tfInserirId;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables


}
