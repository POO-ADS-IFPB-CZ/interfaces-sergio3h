package org.example;
/*Classe Pessoa e Triatleta
Interfaces Nadador, corredor e ciclista
 */
public class Main {
    public static void main(String[] args) {
        Pessoa roberto = new Pessoa("Roberto");
        roberto.setNome("Roberto");
        Triatleta triRoberto = new Triatleta("Roberto");
        triRoberto.setNome("Roberto");
        triRoberto.pedalar();
        triRoberto.pace(4.5);
    }
}