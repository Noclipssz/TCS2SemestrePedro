package model.entities;

public class Franquia {
    private Integer idFranquia;
    private String cep;
    private String nomeDono;
    private String gerente;
    private String numeroFuncionarios;

    public Franquia() {
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

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(String numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Franquia(Integer idFranquia, String cep, String nomeDono, String gerente, String numeroFuncionarios) {
        this.idFranquia = idFranquia;
        this.cep = cep;
        this.nomeDono = nomeDono;
        this.gerente = gerente;
        this.numeroFuncionarios = numeroFuncionarios;
    }
}

