package continuada2;

public class Cpu {

    private Double temperaturaAtual = 0.0;
    private String modelo;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void aumentarTemperatura() {
        if ((this.temperaturaAtual + 20) <= 300) {
            this.temperaturaAtual += 20.0;
        }
    }

    public void diminuirTemperatura() {
        if ((this.temperaturaAtual - 20) >= 0) {
            this.temperaturaAtual -= 20.0;
        }
    }
}
