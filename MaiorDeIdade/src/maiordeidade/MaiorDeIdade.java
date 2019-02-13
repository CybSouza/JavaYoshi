package maiordeidade;

import javax.swing.JOptionPane;

public class MaiorDeIdade {
        /* Crie um projeto em Java que:
        a) Solicite o nome do usuário
        b) Solicite a idade do usuário
        c) Caso a idade do usuário for menor que 18, exibir
           "NOME, Vai jogar playstation"
        d) Caso a idade for maior ou igual a 18, exibir
           "Bem vindo ao Bahamas, NOME" */
    public static void main(String[] args) {
        String nomeUsuario; int idadeUsuario;
        
        nomeUsuario = JOptionPane.showInputDialog("informe seu nome");
        idadeUsuario = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade"));
        
        if (idadeUsuario>=18) {
            JOptionPane.showMessageDialog(null, "Bem vindo ao Bahamas, "+ nomeUsuario);
            
        } else {
            JOptionPane.showMessageDialog(null, nomeUsuario+", Vai jogar playstation");
        }
        
    }
    
}
