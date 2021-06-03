package model;

import javax.swing.JOptionPane;

public class Usuario extends Pessoa implements Seguranca{
    private String nomeusuario;
    private String senha;

    public Usuario(String nomeusuario, String senha, String n, int i, String dn, String em) {
        super(n, i, dn, em);
        this.nomeusuario = nomeusuario;
        this.senha = senha;
    }
    
    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public boolean validar(){
        if(this.getNomeusuario().equals("") || this.getSenha().equals("") || this.getNome().equals("")
                || Integer.toString(this.getIdade()).equals("") || this.getDatanasc().equals("")
                || this.getEmail().equals("")){
            JOptionPane.showMessageDialog(null, "Insira uma informação válida.");
            super.setNome("");
            super.setIdade(0);
            super.setDatanasc("");
            super.setEmail("");
            this.setNomeusuario("");
            this.setSenha("");
            return false;
        } else
            return true;
    }
    
    public String toString(){
        String a = "";
        a += "Nome: " + getNome() + "\n"
                + "Idade: " + getIdade() + "\n"
                + "Data de Nascimento: " + getDatanasc() + "\n"
                + "E-mail: " + getEmail() + "\n"
                + "Nome de usuário: " + getNomeusuario();
        return a;
    }
    
    
}