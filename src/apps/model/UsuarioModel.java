/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.model;
import java.sql.*;

/**
 *
 * @author rafap
 */
public class UsuarioModel {
    
    private Connection connection;
public UsuarioModel() {
try {
connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PostgreSQL 17",
"postgres", "123");
} catch (SQLException e) {
System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
}
}
public boolean verificarCredenciais(String username, String senha) {
String sql = "SELECT * FROM usuarios WHERE username = ? AND senha = ?";
try {
PreparedStatement stmt = connection.prepareStatement(sql);
stmt.setString(1, username);
stmt.setString(2, senha);
ResultSet rs = stmt.executeQuery();
return rs.next(); // Retorna true se o usuário for encontrado
} catch (SQLException e) {
System.out.println("Erro ao verificar credenciais: " + e.getMessage());
return false;
}
}
 
}
