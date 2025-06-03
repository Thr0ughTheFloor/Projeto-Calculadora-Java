package com.senai.Calculator;

public class User {
    private String Username;
    private String Senha;
    private Historico historico;

    public User(String Username, String Senha){
        this.Username = Username;
        this.Senha = Senha;
        this.historico = new Historico();
    }

    public void setUser(String User) {
        this.Username = User;
    }

    public String getUser() {
        return Username;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getSenha() {
        return Senha;
    }

    public Historico getHistorico() {
        return historico;
    }
}
