package entradassaidasjanelas;

import javax.swing.JOptionPane;

public class EntradasSaidasJanelas {

    public static void main(String[] args) {
      String top = JOptionPane.showInputDialog("manda o nome");
     
      int idade = Integer.parseInt(
             JOptionPane.showInputDialog("manda a idade"));
      String conc = "nome: "+ top +"  idade:"+ idade +"";
      JOptionPane.showMessageDialog(null, conc);
    }
    
}
 