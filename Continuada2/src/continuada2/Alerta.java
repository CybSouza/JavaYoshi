package continuada2;

public class Alerta {

    private Double valorAlertaTemperatura;
    private Cpu cpu;

    public void setValorAlertaTemperatura(Double valorAlertaTemperatura) {
        this.valorAlertaTemperatura = valorAlertaTemperatura;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public boolean hasAlerta() {
        return cpu.getTemperaturaAtual() >= this.valorAlertaTemperatura;
    }
}
