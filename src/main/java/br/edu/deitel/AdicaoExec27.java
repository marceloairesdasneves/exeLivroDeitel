package br.edu.deitel;

import javax.swing.JOptionPane;
public class AdicaoExec27 {
    public static void main(String[] args) {
        int A, B, RESULTADO;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));

        RESULTADO = A + B;
        JOptionPane.showMessageDialog(null, "O resultado da adição é: " + RESULTADO);

    }
}
