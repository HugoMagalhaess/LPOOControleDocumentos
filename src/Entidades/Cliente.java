/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Hugo
 */
public class Cliente {
    
    private  String nome;
    private  String cpf;
    private  String pis;
    private  String pff;
    private  String ctps;
    private String banco;
    private String empresa;

    public Cliente() {
    }

    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getPff() {
        return pff;
    }

    public void setPff(String pff) {
        this.pff = pff;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
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

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public Cliente(String nome, String cpf, String pis, String pff, String ctps, String banco) {
        this.nome = nome;
        this.cpf = cpf;
        this.pis = pis;
        this.pff = pff;
        this.ctps = ctps;
        this.banco = banco;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
   
    
}
