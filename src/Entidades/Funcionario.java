/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import com.itextpdf.text.DocumentException;
import java.io.IOException;
import Interfaces.Oficio;
import Repositorio.RepositorioList;


/**
 *
 * @author Hugo
 */
public class Funcionario {
    private String nome;
    private String matricula;
    private String cpf;
    private String login;
    private String senha;
    private String telefone;

    public Funcionario(String nome,String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //public void geraDocumento(Cliente cliente, Banco banco, int tipoDocumento) throws DocumentException, IOException{
    public void gerarOficio(Cliente cliente, Banco banco, Funcionario funcionario) throws DocumentException, IOException{
        Oficio documento = new Oficio(cliente, banco,funcionario);
        
    }
   
    public void gerarParecer(){}
    public  void  gerarComunicadoInterno(){}
    
    
    public Cliente buscaCliente(String nome){
      
        RepositorioList list = new RepositorioList();
         
        return list.buscaClienteNome(nome);
        
       
        
    }
}
