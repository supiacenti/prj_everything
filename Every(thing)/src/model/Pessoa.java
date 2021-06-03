package model;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String datanasc;
    private String email;

    public Pessoa(String n, int i, String dn, String em) {
        this.setNome(n);
        this.setIdade(i);
        this.setDatanasc(dn);
        this.setEmail(em);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
