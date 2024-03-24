/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercs_21_03_2024;

// Método para apresentar mensagens em janela gráfica
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Exercs_21_03_2024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaração de variáveis
        String nome;
        double nota1 = 0.0;
        double nota2 = 0.0;
        double media = 0.0;
        // Entrada do nome
        nome = JOptionPane.showInputDialog(null, "Digite o seu nome");
        // Entrada das notas utilizando o método lerNota
        nota1 = lerNota("Digite a primeira nota", nota1);
        nota2 = lerNota("Digite a segunda nota", nota2);
        // Chamando método que calcula a média
            calcularMedia(media, nota1, nota2, nome);
    }
    
    // Método que serve para ler as notas digitadas;
    static double lerNota(String mensagem, double a) {
        a = Double.parseDouble(JOptionPane.showInputDialog(mensagem));
        return a;
    }
    
    /* Método que calcula a média do aluno, e que retorna o seu nome, 
    a sua média e mostra se ele foi aprovado ou reprovado
    */
    static void calcularMedia(double m, double c, double d, String n) {
        m = (c + d) / 2;
            if (m >= 7.0) {
                JOptionPane.showMessageDialog(
                null, "O aluno(a) " + n + "\nMédia de nota é de: " + m
                                   + "\n" + n + " Aprovado(a)!"
                );
            } else {
                JOptionPane.showMessageDialog(
                null, "O aluno(a) " + n + "\nMédia de nota é de: " + m
                                   + "\n" + n + " Reprovado(a)!"
                );
            }
    }
}