package analisesaude;

import javax.swing.JOptionPane;

public class AnaliseSaude {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("nome");
        String comer = JOptionPane.showInputDialog("o que vc mais costuma comer?\n C -carnes\n V - verduras\n L- legumes\n F- frutas\n T - fast food\n NDA - nem queira saber");
        comer = comer.toUpperCase();
        switch(comer){
            case "C":
                JOptionPane.showMessageDialog(null, "Dieta rica em proteína");
             break;          
            case "V":           
            case "L":
                JOptionPane.showMessageDialog(null, "Dieta rica em vitaminas");
             break;
            
            case "F":
                JOptionPane.showMessageDialog(null, "Dieta rica em fibras");
             break;
            
            case "T":
                JOptionPane.showMessageDialog(null, "Dieta rica em doenças");
             break;
            
            case "NDA":
                JOptionPane.showMessageDialog(null, "Só Jesus na causa!");
             break;
            
        }
    }
    
}
