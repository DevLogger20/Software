/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.Classes;
import java.time.LocalDate;
/**
 *
 * @author rafap
 */
public class Date {
    public static void main(String[] args) {
        // Obter a data atual
        LocalDate dataAtual = LocalDate.now();

        // Extrair ano, mês e dia
        int ano = dataAtual.getYear();
        int mes = dataAtual.getMonthValue();
        int dia = dataAtual.getDayOfMonth();

        // Exibir a data atual
        System.out.println(dia + "/" + mes + "/" + ano);
    }
    
}
