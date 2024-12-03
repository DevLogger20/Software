/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrdemServicoModel {
    
    Connection conector = Conector.conector();

    public OrdemServicoModel() {
        // Initialize the connection using the Conector class
        this.conector = Conector.conector();
    }

    public void salvarOrdemServico(int idCliente, String numeroOrdemServico, String dataOrdemServico, String equipamento, String defeito, String servico, String tecnico, String status, double valor) {
        // Corrected SQL statement to use the exact column names
        String sql = "INSERT INTO os (id_cliente, numeroOrdemServico, dataOrdemServico, equipamento, defeito, servico, tecnico, status, valor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = conector.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            stmt.setString(2, numeroOrdemServico);
            stmt.setString(3, dataOrdemServico);
            stmt.setString(4, equipamento);
            stmt.setString(5, defeito);
            stmt.setString(6, servico);
            stmt.setString(7, tecnico);
            stmt.setString(8, status);
            stmt.setDouble(9, valor);
            
            stmt.executeUpdate();
            System.out.println("Ordem de serviço salva com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar ordem de serviço: " + e.getMessage());
        }
    }
    
    public String getNextNumeroOrdemServico() {
        // Corrected SQL statement to use the exact column names
        String sql = "SELECT MAX(numeroOrdemServico) FROM os"; 
        int nextId = 1; // Default to 1 if no orders exist
        
        try (PreparedStatement stmt = conector.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                nextId = rs.getInt(1) + 1; // Increment the max ID found
            }
        } catch (SQLException e) {
            System.out.println("Erro ao recuperar próximo número da ordem de serviço: " + e.getMessage());
        }
        
        return String.valueOf(nextId); // Return just the next ID as a string
    }
}

