/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author rafap
 */
public class ClienteModel {
    private Connection connection;
    
    
    public ClienteModel() {
        try {
            connection =
DriverManager.getConnection("jdbc:postgresql://localhost:5432/PostgreSQL 17",
"postgres", "123");
} catch (SQLException e) {
System.out.println("Erro ao conectar ao banco de dados: " +
e.getMessage());

}
}
// Método para salvar um cliente no banco de dados
public void salvarCliente(String nome, String endereco, String telefone,
String email) {
String sql = "INSERT INTO clientes (nome, endereco, telefone, email) VALUES (?, ?, ?, ?)";
try {
PreparedStatement stmt = connection.prepareStatement(sql);
stmt.setString(1, nome);
stmt.setString(2, endereco);
stmt.setString(3, telefone);
stmt.setString(4, email);
stmt.executeUpdate();
} catch (SQLException e) {
System.out.println("Erro ao salvar cliente: " + e.getMessage());
}
}
    
}
