package model;

public class Pessoas {
    private String nome;
    private int idade;
    private int datanasc;
    private String email;
    private String nu;
    private String sn;

    public Pessoas(String nome, int idade, int datanasc, String email, String nu, String sn) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setDatanasc(datanasc);
        this.setEmail(email);
        this.setNu(nu);
        this.setSn(sn);
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

    public int getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(int datanasc) {
        this.datanasc = datanasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNu(){
        return nu;
    }
    
    public void setNu(String nu){
        this.nu = nu;
    }
    
    public String getSn(){
        return sn;
    }
    
    public void setSn(String sn){
        this.sn = sn;
    }
    
    public String toStringNu(){
        String r = getNu();
        return r;
    }
    public String toStringSn(){
        String r = getSn();
        return r;
    }
}
