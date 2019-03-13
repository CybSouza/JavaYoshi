package papagaio.cybelle.souza;

public class Papagaio {

    int quantidadeRepeticoes = 0;
    String nome = "";

    void definirRepeticoes(int qtd) {
        quantidadeRepeticoes = qtd;
    }

    void definirNome(String novoNome) {
        nome = novoNome;
    }

    void repetir(String frase) {
        String resposta;

        if ("".equals(nome)) {
            System.out.println("Papagaio só repete se tiver um nome");
        } else if(this.quantidadeRepeticoes == 0) {
            System.out.println("O papagaio ainda não foi orientado a repetir.");
        } else {
            for (int i = 0; i < quantidadeRepeticoes; i++) {
                resposta = String.format("O papagaio %s diz: %s.", nome.toUpperCase(), frase.toUpperCase());
                System.out.println(resposta);
            }
        }
    }
}
