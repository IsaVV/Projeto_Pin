package br.com.pin.controllers;

public class Usuario {
    public String nickname;
    private String senha;

    Usuario(String nickname, String senha) {
        this.nickname = nickname;
        this.senha = senha;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
