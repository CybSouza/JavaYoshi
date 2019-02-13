package contaBancaria.conta;

public class Conta {
    int numero = 0;
    Cliente titular = null;
    double saldo = 0;
    
    void exibirDadosConta(){
        System.out.println("\nnúmero da conta: "+this.numero);
        System.out.println("titular: "+this.titular.nome);
        System.out.println("saldo atual: "+this.saldo+"\n");
    }
    
    void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        if (novoSaldo<0) {
            System.out.println("Sem saldo suficiente para sacar "+quantidade+". Saldo atual: " + this.saldo);
        } else {
            this.saldo = novoSaldo;
            System.out.println("Saque de "+quantidade+" efetuado com sucesso. Saldo atual: " + this.saldo);
        }
    }
    
    void deposita(double quantidade){
        this.saldo+=quantidade;
        System.out.println("depósito de "+quantidade+" efetuado. Saldo atual: "+ this.saldo);
    }
    
    void transfere(Conta destino, double valor){
        this.saldo-=valor;
        destino.saldo+=valor;
        System.out.println("transferência efetuada.");
        
    }
}
