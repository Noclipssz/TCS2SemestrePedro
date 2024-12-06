package model.entities;

public class Franquia {
    private Integer idFranquia;
    private String cep;
    private String Gerente;
    private String numeroFuncionarios;

    public Franquia() {}

    public Franquia(Integer idFranquia, String cep, String Gerente, String numeroFuncionarios) {
        this.idFranquia = idFranquia;
        this.cep = cep;
        this.Gerente = Gerente;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getIdFranquia() {
        return idFranquia;
    }

    public void setIdFranquia(Integer idFranquia) {
        this.idFranquia = idFranquia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getGerente() {
        return Gerente;
    }

    public void setGerente(String nomeDono) {
        this.Gerente = nomeDono;
    }

    public String getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(String numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
}

