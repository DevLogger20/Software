/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package software;

import apps.model.ClienteModel;
import javax.swing.JOptionPane;
import apps.controller.ClienteController;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import apps.model.ClienteModel.Cliente;
/**
 *
 * @author rafap
 */
public class TelaCadastroClientes extends javax.swing.JPanel {
    private ClienteController controller;
    private ClienteModel clienteModel;

    /**
     * Creates new form CadastroClientes
     */
    public TelaCadastroClientes() {
        initComponents();
        controller = new ClienteController();
        clienteModel = new ClienteModel();
        loadClientes();
    }

    private void loadClientes() {
        List<Cliente> clientes = clienteModel.getAllClientes();
    
    // Create a table model and set it to jTable1
    DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"ID", "Nome", "Endereco", "Telefone", "Email"}, 0);
    
    for (Cliente cliente : clientes) {
        tableModel.addRow(new Object[]{
            cliente.getId(),
            cliente.getNome(),
            cliente.getEndereco(),
            cliente.getTelefone(),
            cliente.getEmail()
        });
    }
    
    jTable1.setModel(tableModel); // Set the model to jTable1
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PesquisarCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Id_Cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NomeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EnderecoCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TelefoneCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EmailCliente = new javax.swing.JTextField();
        adicionar = new javax.swing.JButton();
        EditarCliente = new javax.swing.JButton();
        ExcluirCliente = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        PesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("* Campos obrigatorios");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Jose de Assis", "", "99999-1234", "jose@email.com"},
                {"5", "Joaquim Junior", null, "99999-8888", "jojunior@email.com"},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "nome ", "endereco", "fone", "email"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Id Cliente");

        Id_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_ClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("* Nome");

        NomeCliente.setText("jTextField3");
        NomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeClienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereco");

        EnderecoCliente.setText("jTextField4");
        EnderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnderecoClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("* Telefone");

        TelefoneCliente.setText("jTextField5");

        jLabel6.setText("E-mail");

        EmailCliente.setText("jTextField6");

        adicionar.setText("Adicionar");
        adicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        EditarCliente.setText("Editar");
        EditarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarClienteActionPerformed(evt);
            }
        });

        ExcluirCliente.setText("Excluir");
        ExcluirCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(PesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(EnderecoCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Id_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(EditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(ExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Id_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(EmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarClienteActionPerformed

    private void Id_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Id_ClienteActionPerformed

    private void EnderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnderecoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnderecoClienteActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
       
        
        String nome = this.NomeCliente.getText();
        String endereco = this.EnderecoCliente.getText();
        String telefone = this.TelefoneCliente.getText();
        String email = this.EmailCliente.getText();

        controller.salvarCliente(nome, endereco, telefone, email);
        
        JOptionPane.showMessageDialog(this, "Cliente adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        clearFields();
        loadClientes();
        selectLastAddedClient();
        
    }//GEN-LAST:event_adicionarActionPerformed

    private void clearFields() {
        NomeCliente.setText("");
        EnderecoCliente.setText("");
        TelefoneCliente.setText("");
        EmailCliente.setText("");
    }
    
    private void EditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarClienteActionPerformed
        
    // Verificar se o campo Id_Cliente está vazio
    String idClienteText = Id_Cliente.getText();
    if (idClienteText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O ID do cliente não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
        return; // Sai do método se o ID estiver vazio
    }
    
    // Coletar dados dos campos
    int idCliente;
    try {
        idCliente = Integer.parseInt(idClienteText); // Tenta converter o texto para inteiro
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID do cliente inválido. Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        return; // Sai do método se a conversão falhar
    }

    String nome = NomeCliente.getText();
    String endereco = EnderecoCliente.getText();
    String telefone = TelefoneCliente.getText();
    String email = EmailCliente.getText();

    // Validar campos obrigatórios
    if (nome.isEmpty() || telefone.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nome e Telefone são campos obrigatórios.", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Chamar o método de edição no controlador usando a instância
    controller.editarCliente(idCliente, nome, endereco, telefone, email);
    
    // Mensagem de sucesso
    JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    
    // Limpar campos e recarregar a tabela
    clearFields();
    
    // Recarregar a lista de clientes para refletir as mudanças
    loadClientes(); 
    
    // Selecionar a linha do cliente editado após recarregar a tabela
    selectClientRowById(idCliente);
        
    }//GEN-LAST:event_EditarClienteActionPerformed

    private void selectClientRowById(int id) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    for (int i = 0; i < model.getRowCount(); i++) {
        if ((int) model.getValueAt(i, 0) == id) { // Assuming ID is in the first column (index 0)
            jTable1.setRowSelectionInterval(i, i); // Selects the row
            jTable1.scrollRectToVisible(jTable1.getCellRect(i, 0, true)); // Scrolls to make it visible
            break;
        }
    }
}
    
    private void selectLastAddedClient() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    // Check if there are any rows in the table
    if (model.getRowCount() > 0) {
        int lastRowIndex = model.getRowCount() - 1; // Get the index of the last row
        jTable1.setRowSelectionInterval(lastRowIndex, lastRowIndex); // Selects the last row
        jTable1.scrollRectToVisible(jTable1.getCellRect(lastRowIndex, 0, true)); // Scrolls to make it visible
    }
}
    
    private void NomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeClienteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // Get selected row index
    int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow != -1) { // Ensure a row is selected
        // Retrieve data from selected row
        int id = (int) jTable1.getValueAt(selectedRow, 0); // Assuming ID is in the first column
        String nome = (String) jTable1.getValueAt(selectedRow, 1);
        String endereco = (String) jTable1.getValueAt(selectedRow, 2);
        String telefone = (String) jTable1.getValueAt(selectedRow, 3);
        String email = (String) jTable1.getValueAt(selectedRow, 4);

        // Populate fields with selected client data
        Id_Cliente.setText(String.valueOf(id)); // Assuming IdCliente is a JTextField
        NomeCliente.setText(nome); // Assuming nomeField is a JTextField for name
        EnderecoCliente.setText(endereco); // Assuming enderecoField is a JTextField for address
        TelefoneCliente.setText(telefone); // Assuming telefoneField is a JTextField for phone
        EmailCliente.setText(email); // Assuming emailField is a JTextField for email
    }
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void ExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirClienteActionPerformed
        // Verificar se o campo Id_Cliente está vazio
    String idClienteText = Id_Cliente.getText();
    if (idClienteText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O ID do cliente não pode estar vazio.", "Erro", JOptionPane.ERROR_MESSAGE);
        return; // Sai do método se o ID estiver vazio
    }
    
    int idCliente;
    try {
        idCliente = Integer.parseInt(idClienteText); // Tenta converter o texto para inteiro
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID do cliente inválido. Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        return; // Sai do método se a conversão falhar
    }

    // Confirmar exclusão
    int confirm = JOptionPane.showConfirmDialog(this, 
        "Tem certeza que deseja excluir o cliente com ID " + idCliente + "?",
        "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.YES_OPTION) {
        // Chamar o método de exclusão no controlador
        controller.excluirCliente(idCliente);
        
        // Mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        // Limpar campos e recarregar a tabela
        clearFields();
        loadClientes(); // Recarregar a lista de clientes para refletir as mudanças
    }
        
    }//GEN-LAST:event_ExcluirClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarCliente;
    private javax.swing.JTextField EmailCliente;
    private javax.swing.JTextField EnderecoCliente;
    private javax.swing.JButton ExcluirCliente;
    private javax.swing.JTextField Id_Cliente;
    private javax.swing.JTextField NomeCliente;
    private javax.swing.JTextField PesquisarCliente;
    private javax.swing.JTextField TelefoneCliente;
    private javax.swing.JButton adicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
