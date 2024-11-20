package model.entities;

public class Nota {
    private int id;
    private int idFranquia;
    private int idCliente;
    private int idFuncionario;
    private int idCarro;
    private int dataCompra;


    public Nota(int id, int idFranquia, int idCliente, int idFuncionario, int idCarro, int dataCompra) {
        this.id = id;
        this.idFranquia = idFranquia;
        this.idCliente = idCliente;
        this.idFuncionario = idFuncionario;
        this.idCarro = idCarro;
        this.dataCompra = dataCompra;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFranquia() {
        return idFranquia;
    }

    public void setIdFranquia(int idFranquia) {
        this.idFranquia = idFranquia;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public int getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(int dataCompra) {
        this.dataCompra = dataCompra;
    }
}
