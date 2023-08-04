package org.example.controller;



public class Controller implements IController, IControllerFull {
    int id;
    String nome;

    public Controller(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Controller() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNomeReal() {
        return null;
    }

    @Override
    public int getIdReal() {
        return 0;
    }

    @Override
    public String getNomeReal2() {
        return null;
    }

    @Override
    public int getIdReal2() {
        return 0;
    }
}
