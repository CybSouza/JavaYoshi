package continuada2;

import java.util.Scanner;

public class AppAlerta {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Cpu cpu = new Cpu();
        Alerta alerta = new Alerta();

        cpu.setModelo("Celeron");

        alerta.setValorAlertaTemperatura(200.0);
        alerta.setCpu(cpu);

        Thread thread = new Thread() {
            @Override
            public void run() {

                int opcaoMenu = 0;
                do {
                    boolean bool = alerta.hasAlerta();
                    if (bool) {
                        System.out.println("ALERTA! CPU atingiu nível crítico!");
                    }

                    System.out.println("\nO uso de CPU:\n"
                            + "1 - Aumentou \n"
                            + "2 - Diminuiu \n"
                            + "3 - Manteve-se \n"
                            + "4 - sair\n");

                    opcaoMenu = leitor.nextInt();
                    switch (opcaoMenu) {
                        case 1:
                            cpu.aumentarTemperatura();
                            break;
                        case 2:
                            cpu.diminuirTemperatura();
                            break;
                        case 3:
                            break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            break;
                    }
                } while (opcaoMenu != 4);
            }
        };
        thread.start();
    }
}
