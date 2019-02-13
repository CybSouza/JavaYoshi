package sayajins;

import java.util.Scanner;

public class Sayajins {
    /*
    2. Crie um projeto Java chamado Sayajins.
a) Pergunte ao usuário a força (ki) base de um guerreiro Sayajin.
b) Pergunte o nome do guerreiro Sayajin.
c) Exiba na tela seus niveis de força de acordo com as transformações que um Sayajin pode sofrer:

Níveis de poder do Sayajin NOME:
Ki na forma base: A
Ki em Super Sayajin: B
Ki em Super Sayajin 2: C
Ki em Super Sayajin 3: D
Ki em Deus Super Sayajin: E
Ki em Super Sayajin Blue: F

Nota: Onde A é o ki informada em a). B é Ax50. C é Ax100. D é Ax500. E é Ax1000. F é Ax50000.
    */

    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        String nome; double ki;
        
        System.out.println( "qual o KI base do guerreiro?");
        ki = scan.nextDouble();
        
        System.out.println("qual o nome do guerreiro?");
        nome = new Scanner(System.in).nextLine();
        
        System.out.println("Níveis de poder do Sayajin "+nome+":\n" +
            "Ki na forma base: "+ki+"\n" +
            "Ki em Super Sayajin: "+(ki*50)+"\n" +
            "Ki em Super Sayajin 2: "+(ki*100)+"\n" +
            "Ki em Super Sayajin 3: "+(ki*500)+"\n" +
            "Ki em Deus Super Sayajin: "+(ki*1000)+"\n" +
            "Ki em Super Sayajin Blue: "+(ki*50000)+"");       
    }
    
}
