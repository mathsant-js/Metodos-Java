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
public class Exerc2 {
    public static void main(String []args) {
        // Declaração de variáveis
        double numero1;
        double numero2;
        // Entrada dos valores dos números
        numero1 = Double.parseDouble(JOptionPane.showInputDialog(
                null,"Digite o primeiro número")
        );
        numero2 = Double.parseDouble(JOptionPane.showInputDialog(
                null,"Digite o segundo número")
        );
        // Chamando método para calcular a diferença dos números digitados
        diferenca(numero1, numero2);
    }
    
    // Método que calcula a diferença entre os dois números digitados
    static void diferenca(double n1, double n2) {
        double dif;
        if (n1 > n2) {
            dif = n1 - n2;
            JOptionPane.showMessageDialog(
    null, "O primeiro número que é " + n1 +" é maior.\nE a diferença é de " + dif
            );
        } else if (n2 > n1) {
            dif = n2 - n1;
            JOptionPane.showMessageDialog(
    null, "O segundo número que é " + n2 +" é maior.\nE a diferença é de " + dif
            );
        // Caso os números sejam iguais, é falado que eles são iguais
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais, "
                    + "porque a diferença é de 0.");
        }
    }
}