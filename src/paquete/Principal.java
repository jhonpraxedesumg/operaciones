package paquete;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("DIGITA UN NUMERO\t"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("DIGITA UN NUMERO\t"));

        Operaciones op = new Operaciones();

        op.sumar(n1,n2);
        op.restar(n1,n2);
        op.multiplicar(n1,n2);
        op.dividir(n1,n2);
        op.resultados();
    }
}
