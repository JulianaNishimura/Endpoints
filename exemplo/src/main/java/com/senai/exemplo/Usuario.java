package com.senai.exemplo;

public class Usuario {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public void Usuario(){

    }

    public void Usuario(String nome_escolhido,String cpf_escolhido,String telefone_escolhido,String email_escolhido){
        this.nome = nome_escolhido;
        this.cpf = cpf_escolhido;
        this.telefone = telefone_escolhido;
        this.email = email_escolhido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
