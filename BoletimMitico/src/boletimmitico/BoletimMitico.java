package boletimmitico;
public class BoletimMitico {

    public static void main(String[] args) {
        BoletimEscolar boletim = new BoletimEscolar("cybelle", "java", 10,9,10,0);
        
        System.out.println(boletim.getFrequencia());
        
        boletim.setNumeroAulas(10);
        boletim.registrarFalta();
        boletim.registrarFalta();       
        System.out.println(boletim);
        
        boletim.registrarFalta();
        boletim.registrarFalta();
        boletim.registrarFalta();
        System.out.println(boletim);
    }
    
}
