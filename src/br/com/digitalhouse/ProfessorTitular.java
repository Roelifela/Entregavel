package br.com.digitalhouse;

public class ProfessorTitular extends Professor {

    private String especialidade;


    public ProfessorTitular(String nomeProfessor, String sobreNomeProfessor, Integer tempoCasa, Integer codigoProfessor, String especialidade) {
        super(nomeProfessor, sobreNomeProfessor, tempoCasa, codigoProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {

        this.especialidade = especialidade;
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
