package amigospizza;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AmigosPizza {

    public static void main(String[] args) {
        /*pergunte qts amigos vão rachar a pizza
        pergunte o sabor da pizza
        pergunte o valor da pizza
        exiba a frase 'a pizza de SABOR custa R$X e cada amigo vai pagar R$Y'
              
        */
        String sabor, frase; double valor, outro; int qtd;
        DecimalFormat df = new DecimalFormat("0.##");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("quantos amigos vão rachar a pizza?");
        qtd = scan.nextInt();
        System.out.println("qual o sabor?");
        //quando se tem uma sequencia de texto nós usamos o nextline, porém ele não funciona se for precedido por um valor numérico. então,
        //a gambiarra é usar um scanner separado para o nextline
        sabor = new Scanner(System.in).nextLine();
        System.out.println("qual o valor da pizza?");
        valor = scan.nextDouble();
        outro = valor/qtd;
        
        frase = String.format("A Pizza de %s custa R$%s e cada amigo vai pagar %s",sabor,valor,df.format(outro));
        System.out.println(frase);
    }
    
}
