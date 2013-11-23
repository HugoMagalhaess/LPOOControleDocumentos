/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import Entidades.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Hugo
 */
public class RepositorioList {
    
       
    public ArrayList<Cliente> clienteBD = new ArrayList<>();


//    RepositorioList(Cliente cli) {
//        init();
//    }

    public RepositorioList() {
    }

 
    public  void init(){
                 
         Cliente cliente = new Cliente("Hugo", "99999999999", "111111", "6666666", "2222","Bradesco");
         Cliente cliente2 = new Cliente("Arthur", "99999999999", "111111", "6666666", "2222","Caixa");
         clienteBD.add(cliente);
         clienteBD.add(cliente2);
     }
    
     public Cliente buscaClienteNome(String nome){
         Cliente client= new Cliente();
         for(Cliente resultado : clienteBD){
             if(resultado.getNome().equals(nome)){
                 client = resultado;
                 break;
         }
        
        }
        return client;
     }
 
     public Cliente buscaClienteCPF(String cpf){
         Cliente client= new Cliente();
         for(Cliente resultado : clienteBD){
             if(resultado.getCpf().equals(cpf)){
                 client = resultado;
                 break;
             }
         }
         
         return client;
    
     }
     
}
