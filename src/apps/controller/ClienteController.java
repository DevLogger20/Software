/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.controller;

import apps.model.ClienteModel;

public class ClienteController {
    
    private ClienteModel model;

    public ClienteController() {
        this.model = new ClienteModel();
    }

    public void salvarCliente(String nome, String endereco, String telefone, String email) {
        // Validate mandatory fields
        if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
            System.out.println("Todos os campos obrigatórios devem ser preenchidos.");
            return; // Exit if validation fails
        }

        // Call the model to save the client
        model.salvarCliente(nome, endereco, telefone, email);
        System.out.println("Cliente salvo com sucesso.");
    }
    
    
    public void editarCliente(int idCliente, String nome, String endereco, String telefone, String email) {
    model.editarCliente(idCliente, nome, endereco, telefone, email);
    }
    
    public void excluirCliente(int idCliente) {
    model.excluirCliente(idCliente);
}

    
}
