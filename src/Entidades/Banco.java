/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Hugo
 */
public class Banco {
 
    private String nome;
    private String endereço;
    private String cep;
    private String cidade;
    private String estado;

    public Banco(String nome, String endereço, String cep, String cidade, String estado) {
        this.nome= nome;
        this.endereço = endereço;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Banco() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
