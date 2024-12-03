/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apps.controller;

import apps.model.OrdemServicoModel;

public class OrdemServicoController {
    
    private OrdemServicoModel model;

    public OrdemServicoController() {
        this.model = new OrdemServicoModel();
    }

    public void salvarOrdemServico(int idCliente, String numeroOrdemServico, String dataOrdemServico, String equipamento, String defeito, String servico, String tecnico, String status, double valor) {
        // Validate mandatory fields
        if (equipamento.isEmpty() || defeito.isEmpty() || tecnico.isEmpty() || status.isEmpty()) {
            System.out.println("Todos os campos obrigatórios devem ser preenchidos.");
            return; // Exit if validation fails
        }

        // Validate the order number and date fields
        if (numeroOrdemServico.isEmpty() || dataOrdemServico.isEmpty()) {
            System.out.println("Número da ordem de serviço e data devem ser preenchidos.");
            return; // Exit if validation fails
        }

        // Additional validation for status (if necessary)
        if (!isValidStatus(status)) {
            System.out.println("Status inválido.");
            return; // Exit if status is invalid
        }

        // Call the model to save the order
        model.salvarOrdemServico(idCliente, numeroOrdemServico, dataOrdemServico, equipamento, defeito, servico, tecnico, status, valor);
        System.out.println("Ordem de serviço salva com sucesso.");
    }

    private boolean isValidStatus(String status) {
        // Define valid statuses
        String[] validStatuses = {"Aguardando Aprovação", "Aguardando Peças", "Aguardando Retirada", "Na Bancada para Serviço", "Retirado pelo Cliente"};
        
        for (String validStatus : validStatuses) {
            if (validStatus.equals(status)) {
                return true; // Status is valid
            }
        }
        return false; // Status is invalid
    }
    
    public String getNextNumeroOrdemServico() {
        return model.getNextNumeroOrdemServico(); // Call model method to get next order number
    }
    
}
