package trabalhadorhomeoffice;



public class main {

    public static void main(String[] args) {
        /*
        Em outra classe com método main, instancie 2 objetos do tipo Trabalhador 
        e invoque todos os métodos criados neles de formas diferentes para obter diferentes saídas. 
        Exemplos: faça um deles exibir o que tem a receber sem ter registrado o valor da hora. 
        
        Ou faça um rec eber várias vezes e outro poucas. 
        
        Ou faça um receber e exiba seu ganho e depois inicie outro mês nele e exiba seu ganho novamente.
        */
        Trabalhador t1 = new Trabalhador();
       System.out.println("\n dados do trabalhador 1: \n");
        //não configurou o valor/hora
        t1.exibirValorAReceber();
        
        t1.definirValorHora(12.00);
        t1.registrarHorasTrabalhadas(2);
        //exibe a qtd de registros (1), e o calculo de horas (12 reais* 2 horas = 24)
        t1.exibirValorAReceber();
        
        t1.registrarHorasTrabalhadas(4);
        t1.registrarHorasTrabalhadas(5.5);
        t1.registrarHorasTrabalhadas(0.5);
        //4 registros, 12 horas *12 reais = 144
        t1.exibirValorAReceber();
        
        System.out.println("\ndados do trabalhador 2: \n");
         Trabalhador t2 = new Trabalhador();
        t2.exibirValorAReceber();
        
        //configurando valores
        t2.definirValorHora(10.00);
        t2.registrarHorasTrabalhadas(12);
        t2.exibirValorAReceber();
        
        //zerando tudo
        t2.iniciarNovoMes();    
        t2.exibirValorAReceber();
        
        t2.definirValorHora(20);       
        t2.registrarHorasTrabalhadas(0.5);
        t2.registrarHorasTrabalhadas(1.4);
        t2.exibirValorAReceber();
        
        
        
    }
    
}
