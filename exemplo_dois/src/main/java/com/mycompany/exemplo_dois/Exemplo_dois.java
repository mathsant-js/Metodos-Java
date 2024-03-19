/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo_dois;

import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Exemplo_dois {

    public static void main(String[] args) {
        int t;
        String p;
        digite();
        p = JOptionPane.showInputDialog(null, "Digite uma palavra qualquer: ");
        t = tamanho(p);
        JOptionPane.showMessageDialog(null, p + " possui " + t + " caracteres");
    }
    
    static void digite() {
        JOptionPane.showMessageDialog(null, "Digite uma palavra");
    }
    
    static int tamanho(String x) {
        return x.length();
    }
}
