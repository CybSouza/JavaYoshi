package contaBancaria.conta;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Cybelle";
        cliente.sobrenome = "Souza";
        Conta conta = new Conta();
        conta.titular = cliente;
        conta.numero = 12345;
        conta.saldo = 500; 
        
        Cliente cli2 = new Cliente();
        cli2.nome = "teste";
        cli2.sobrenome = "testando";
        Conta c2 = new Conta();
        c2.titular = cli2;
        c2.numero = 23456;
        c2.saldo = 100;
     
        c2.exibirDadosConta();
        boolean teste = c2.saca(100);
        if (teste) {
            System.out.println("funfou");
        } else {
            System.out.println("n funfou");
        }
    }   
}
