package bancogetset;
public class BancoGetSet {

    public static void main(String[] args) {
        //não vai funcionar porque a classe possui contrutores
        //ContaCorrente conta1 = new ContaCorrente();
        
        ContaCorrente conta2 = new ContaCorrente("Chaves");
        ContaCorrente conta3 = new ContaCorrente("Lelê");
        
        ContaCorrente conta4 = new ContaCorrente("Eike Batista", 900_000);
        ContaCorrente conta5 = new ContaCorrente("Jessica Alba", 3_900_000);
        
        contaPoupanca poupanca1 = new contaPoupanca();
        contaPoupanca poupanca2 = new contaPoupanca("Kesha", 9_000);
        
        
    }
    
}
