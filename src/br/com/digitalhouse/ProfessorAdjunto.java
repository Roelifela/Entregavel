package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor {

    public Integer horasMonitoria;


    public ProfessorAdjunto(String nomeProfessor, String sobreNomeProfessor, Integer tempoCasa, Integer codigoProfessor, Integer horasMonitoria) {
        super(nomeProfessor, sobreNomeProfessor, tempoCasa, codigoProfessor);
        this.horasMonitoria = horasMonitoria;
    }
}
