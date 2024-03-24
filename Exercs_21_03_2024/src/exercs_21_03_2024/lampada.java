/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercs_21_03_2024;

// Método para apresentar mensagens em janela gráfica
import javax.swing.JOptionPane;
/**
 *
 * @author Matheus Santana
 */
public class lampada {
    public static void main(String []args) {
        // Declaração de variáveis
        int opcao;
        String estadoLampada = "Apagada";
        
        // Usuário digita se quer que a lampada seja acesa ou apagada
        opcao = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Estado da lampada: " +estadoLampada
                            + "\n1 - Acender a lâmpada"
                            + "\n2 - Apagar a lâmpada")
        );
            // Condicional para ver se o usuário quer que a lâmpada fique acesa ou apagada
            if (opcao == 1) {
                acesa(estadoLampada);
                mostrarEstado(opcao);
            } else if (opcao == 2) {
                apagar(estadoLampada);
                mostrarEstado(opcao);
            } else {
                JOptionPane.showMessageDialog(
    null, "O número digitado não corresponde com os valores disponibilizados,"
                + " a lâmpada continuará apagada.");
            }
    }
    
    // Método para acender a lâmpada
    static String acesa(String t) {
        t = "acesa";
        return t;
    }
    
    //Método para apagar a lâmpada
    static String apagar(String t) {
        t = "apagada";
        return t;
    }
    
    // Método para mostrar se a lâmpada está acesa ou apagada
    static void mostrarEstado(int l) {
       if (l == 1) {
           JOptionPane.showMessageDialog(null, "A lâmpada está acesa.");
       } else {
           JOptionPane.showMessageDialog(null, "A lâmpada está apagada.");
       }
    }
}