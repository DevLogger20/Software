/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.model;
import java.sql.*;
import apps.model.Conector;
/**
 *
 * @author rafap
 */
public class UsuarioModel {
    
    Connection conector= Conector.conector();

public boolean verificarCredenciais(String usuario, String senha) {
    String sql = "SELECT * FROM logins WHERE usuario = ? AND senha = ?";
    try {
        PreparedStatement stmt = conector.prepareStatement(sql);
        stmt.setString(1, usuario);
        stmt.setString(2, senha);
        ResultSet rs = stmt.executeQuery();
        return rs.next(); // Retorna true se o usuário for encontrado
    } catch (SQLException e) {
        System.out.println("Erro ao verificar credenciais: " + e.getMessage());
        return false;
    }
}
 
public void cadastroUsuario(Integer id_usuario, String nome, Integer fone, String senha, String logon, String perfil) {
    String sql = "INSERT INTO usuario (id_usuario, nome, fone, senha, logon, perfil) VALUES (?, ?, ?, ?, ?, ?)";
    try {
        PreparedStatement stmt = conector.prepareStatement(sql);
        stmt.setInt(1, id_usuario);
        stmt.setString(2, nome);
        stmt.setInt(3, fone);
        stmt.setString(4, senha);
        stmt.setString(5, logon);
        stmt.setString(6, perfil);
        
        stmt.executeUpdate();
        
        System.out.println("Usuário cadastrado com sucesso.");
    } catch (SQLException e) {
        System.out.println("Erro ao cadastrar usuário!: " + e.getMessage());
    }
}

}


