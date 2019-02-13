package bolsafamilia;

import javax.swing.JOptionPane;

public class BolsaFamilia {

    public static void main(String[] args) {
        String resp, cidade, msg;
        int fmenor,fpne,pmaior;
        double soma;
        /*
        Crie um projeto Java chamado BolsaFamilia.
a) Pergunte o nome do Responsável pela familia
b) Pergunte a cidade onde a família mora
c) Pergunte a quantidade de filhos menores de 18 anos
d) Pergunte a quantidade de filhos PNE
e) Pergunte a quantidade de pessoas maiores de 60 anos
f) Exiba uma frase informando sobre a Bolsa Família como a seguir:

A família do responsável A vai receber um total de R$B por mês
- Valor pelos menores de 18 anos: C
- Valor pelos PNE: D
- Valor pelos idosos: E
Cidade: F

OBS: Valor de C: 12,50 p/ filho. Valor de D: 14,00 p/ filho. Valor de E: 10 p/ idoso. Valor de B: Soma C+D+E.
        */
       resp= JOptionPane.showInputDialog("qual o responsável pela família?");
       cidade= JOptionPane.showInputDialog("moram em qual cidade?");
        fmenor = Integer.parseInt(JOptionPane.showInputDialog("qtd filhos menores de idade"));
        fpne = Integer.parseInt(JOptionPane.showInputDialog("qtd de filhos PNE"));
        pmaior = Integer.parseInt(JOptionPane.showInputDialog("qtd pessoas maiores de 60 anos"));
        soma = (12.5*fmenor)+(14*fpne)+(10*pmaior);
        
        msg = "A família do responsável "+resp+" vai receber um total de R$"+soma+" por mês\n" +
            "- Valor pelos menores de 18 anos: "+(12.5*fmenor)+"\n" +
            "- Valor pelos PNE: "+(14*fpne)+"\n" +
            "- Valor pelos idosos: "+(10*pmaior)+"\n" +
            "Cidade: "+cidade+"";
        
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
