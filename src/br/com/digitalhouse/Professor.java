package br.com.digitalhouse;

public abstract class Professor {

    private String nomeProfessor;
    private String sobreNomeProfessor;
    private Integer tempoCasa;
    private Integer codigoProfessor;

    public Professor(String nomeProfessor, String sobreNomeProfessor, Integer tempoCasa, Integer codigoProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.sobreNomeProfessor = sobreNomeProfessor;
        this.tempoCasa = tempoCasa;
        this.codigoProfessor = codigoProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSobreNomeProfessor() {
        return sobreNomeProfessor;
    }

    public void setSobreNomeProfessor(String sobreNomeProfessor) {
        this.sobreNomeProfessor = sobreNomeProfessor;
    }

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }



}
