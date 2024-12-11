package org.example;

public class Pessoa {
    private String nome, endereço;

    public Pessoa(String nome) {
        this.setNome(nome);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereço;
    }
    public void setEndereço(String endereço){
        this.endereço = endereço;
    }
}
