/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.controller;

import apps.model.UsuarioModel;

/**
 *
 * @author rafap
 */
public class LoginController {
    
    private UsuarioModel usuarioModel;
    
    public LoginController() {
        this.usuarioModel = new UsuarioModel();
    }
    
    public boolean verificarLogin(String username, String senha) {
        
        return usuarioModel.verificarCredenciais(username, senha);
        
    }
    
}
