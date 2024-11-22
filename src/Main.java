import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
                //== igual
                //!= es distinto (diferente)6
                //< menor
                //> mayor
                //>=
                //<=
        if (numero <= dato){
            JOptionPane.showMessageDialog(null,"El numero es menor o igual a 5");
        }else {
            JOptionPane.showMessageDialog(null,"El numero es mayor a 5");
        }
    }
}