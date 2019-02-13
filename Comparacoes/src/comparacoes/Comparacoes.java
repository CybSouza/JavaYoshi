package comparacoes;

import java.util.Scanner;

public class Comparacoes {
    public static void main(String[] args) {
        //== se chama IS A, e verifica se OS DOIS OBJETOS SÃO O MESMO OBJETO
        System.out.println(10==10);
        System.out.println(7!=10);
        System.out.println("digite uma palavra");
        String palavra = new Scanner(System.in).next();
        //para se verificar se são iguais, usa-se o .equals
        //ele verifica se os objetos TEM O MESMO VALOR, mesmo sendo diferentes
        System.out.println("amor".equals(palavra));
        //comparando textos independentemente de estarem em caixa alta ou baixa
        //usa-se .equalsIgnoreCase()  
        //objeto anonimo
        System.out.println(palavra.equalsIgnoreCase("amor"));
        System.out.println("amor".equalsIgnoreCase(palavra));
        
    }
    
}
