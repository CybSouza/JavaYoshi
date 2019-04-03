/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletimmitico;
public class BoletimEscolar {
    private String nomeAluno;
    private String nomeDisciplina;
    private double nota1;
    private double nota2;
    private int numeroAulas;
    private int NumeroFaltas;

    public BoletimEscolar(String nomeAluno, String nomeDisciplina) {
        this.nomeAluno = nomeAluno;
        this.nomeDisciplina = nomeDisciplina;
    }

    public BoletimEscolar(String nomeAluno, String nomeDisciplina, double nota1, double nota2, int numeroAulas, int NumeroFaltas) {
        this.nomeAluno = nomeAluno;
        this.nomeDisciplina = nomeDisciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.numeroAulas = numeroAulas;
        this.NumeroFaltas = NumeroFaltas;
    }
    
    
    public void registrarFalta(){
    NumeroFaltas++;
    } 
    public double getFrequencia(){
    return (numeroAulas-NumeroFaltas)*100/numeroAulas;
    }
    
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public double getNota1() {
        return nota1;
    }
    
    public double getNota2() {
        return nota2;
    }

    public int getNumeroAulas() {
        return numeroAulas;
    }

    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }

    public int getNumeroFaltas() {
        return NumeroFaltas;
    }    

    @Override
    public String toString() {
        return "BoletimEscolar{ " + "nomeAluno: " + nomeAluno + ", nota1: " + nota1 + ", nota2: " + nota2 + ", Frequência: "+ getFrequencia()+"}";
    }
    
    
}
