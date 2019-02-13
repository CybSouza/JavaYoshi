package textossimples;

import java.util.Scanner;

public class TextosSimples {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);  
        
        double flutuante; int inteiro; String texto;
        
        int num1 = 10; int num2 = 15;
        
        System.out.println("soma: " + (num1+num2));
        System.out.println("sub: " + (num1-num2));
        System.out.println("mult: " + (num1*num2));
        System.out.println("div: " + (num1/num2));
        
        System.out.println("um double");
        flutuante = scan.nextDouble();
        
        System.out.println("um inteiro");
        inteiro = scan.nextInt();
        
        texto = String.format("double: %s, int: %s", flutuante, inteiro);
        System.out.println(texto);
        
        String outra = "testando  ";
        outra+= texto;
        System.out.println(outra);
    }   
}
