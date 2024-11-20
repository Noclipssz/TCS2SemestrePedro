package model.entities;

public class Car {
    private Integer id;
    private String valor;
    private String cor;
    private String modelo;
    private int ano;
    private String marca;
    private String placa;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", valor='" + valor + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }

    public Car() {}

    public Car(Integer id, String valor, String cor, String modelo, Integer ano, String marca, String placa) {
        this.id = id;
        this.valor = valor;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


