package trabalhadorhomeoffice;

public class Trabalhador {

    double horasTtrabalhadasMes = 0;
    double valorHora = 0;
    int contadorRegistros = 0;

    void definirValorHora(double novoValor) {
        this.valorHora = novoValor;
    }

    void registrarHorasTrabalhadas(double horas) {
        this.horasTtrabalhadasMes += horas;
        contadorRegistros++;
    }

    void iniciarNovoMes() {
        System.out.println("novo mês iniciado!");
        this.horasTtrabalhadasMes = 0;
        contadorRegistros = 0;
    }

    void exibirValorAReceber() {
        if (valorHora == 0) {
            System.out.println("Valor da hora ainda não configurado!");
        } else {
            String frase = String.format("Até o momento, você fez %s registros de horas e tem R$%s para receber.", contadorRegistros, (horasTtrabalhadasMes * valorHora));
            System.out.println(frase);
        }
    }
}
