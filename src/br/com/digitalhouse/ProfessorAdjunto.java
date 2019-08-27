package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor {

    public Integer horasMonitoria;


    public ProfessorAdjunto(String nomeProfessor, String sobreNomeProfessor, Integer tempoCasa, Integer codigoProfessor, Integer horasMonitoria) {
        super(nomeProfessor, sobreNomeProfessor, tempoCasa, codigoProfessor);
        this.horasMonitoria = horasMonitoria;
    }

    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }

    @Override
    public String toString() {
        return "ProfessorTitular{" +
                "nome= " + getNomeProfessor() + '\'' +
                "Sobrenome= " + getSobreNomeProfessor() + '\'' +
                "Codigo= " + getCodigoProfessor() + '\'' +
                '}';
    }
}
