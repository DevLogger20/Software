/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteModel {
    private Connection connection;

    public ClienteModel() {
        // Initialize the connection using the Conector class
        this.connection = Conector.conector();
    }

    // Método para salvar um cliente no banco de dados
    public void salvarCliente(String nome, String endereco, String telefone, String email) {
        String sql = "INSERT INTO clientes (nome, endereco, telefone, email) VALUES (?, ?, ?, ?)";
        try {
            // Ensure that the connection is established before preparing the statement
            if (connection != null) {
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, nome);
                stmt.setString(2, endereco);
                stmt.setString(3, telefone);
                stmt.setString(4, email);
                stmt.executeUpdate();
                System.out.println("Cliente salvo com sucesso.");
            } else {
                System.out.println("Conexão não estabelecida. Não foi possível salvar o cliente.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao salvar cliente: " + e.getMessage());
        }
      
    }
    
    
     public void salvarCliente(String nome, String endereco, String telefone, String email) {
        String sql = "INSERT INTO clientes (nome, endereco, telefone, email) VALUES (?, ?, ?, ?)";
        try {
            // Ensure that the connection is established before preparing the statement
            if (connection != null) {
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, nome);
                stmt.setString(2, endereco);
                stmt.setString(3, telefone);
                stmt.setString(4, email);
                stmt.executeUpdate();
                System.out.println("Cliente salvo com sucesso.");
            } else {
                System.out.println("Conexão não estabelecida. Não foi possível salvar o cliente.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao salvar cliente: " + e.getMessage());
        }
      
    }
 
    
    public List<Cliente> getAllClientes() {
    List<Cliente> clientes = new ArrayList<>();
    String sql = "SELECT id_cliente, nome, endereco, telefone, email FROM clientes"; // Adjusted column names
    
    try {
        if (connection != null) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                int id = rs.getInt("id_cliente"); // Use the correct column name
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                
                clientes.add(new Cliente(id, nome, endereco, telefone, email));
            }
        }
    } catch (SQLException e) {
        System.out.println("Erro ao recuperar clientes: " + e.getMessage());
    }
    
    return clientes;
    }
    
    public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Cliente(int id, String nome, String endereco, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters for each field
    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
}
    
    public void editarCliente(int idCliente, String nome, String endereco, String telefone, String email) {
    String sql = "UPDATE clientes SET nome = ?, endereco = ?, telefone = ?, email = ? WHERE id_cliente = ?";
    
    try {
        if (connection != null) {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setString(3, telefone);
            stmt.setString(4, email);
            stmt.setInt(5, idCliente); // Set the ID of the client to update
            
            stmt.executeUpdate();
            System.out.println("Cliente atualizado com sucesso.");
        } else {
            System.out.println("Conexão não estabelecida.");
        }
    } catch (SQLException e) {
        System.out.println("Erro ao atualizar cliente: " + e.getMessage());
    }
}
    
    
    
}
