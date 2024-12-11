package org.example;

public class Triatleta extends Pessoa implements Nadador, Ciclista, Corredor{
    public Triatleta(String nome){
        super(nome);
    }
    public void aquecer(){
        System.out.println(this.getNome() + "está aquecendo");
    }
    public  void nadar(){
        System.out.println(this.getNome() + "nadando");
    }
    public void pedalar(){
        System.out.println(this.getNome() + " esta pedalando");
    }
    public void correr(){
        System.out.println(this.getNome() + "correndo");
    }
    public void pace(double time){
        System.out.println(this.getNome() + " tem o pace de " + time + " min/km");
    }
}
