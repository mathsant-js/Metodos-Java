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
public class Exerc4 {
    public static void main(String []args) {
        // Chamada do método hipotenusa
        hipotenusa();
    }
    
    // Método que calcula o valor da hipotenusa
    static void hipotenusa() {
        // Declaração das variáveis e os seus valores de entrada
        double hip;
        double base = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Digite o valor da base."
                )
        );
        double altura = Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Digite o valor da altura."
                )
        );
        // Calculando o valor da hipotenusa
        hip = (Math.pow(base, 2) + Math.pow(altura, 2));
        hip = Math.sqrt(hip);
        // Mostrando o valor da hipotenusa
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hip);
    }
}