/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Banco;
import Entidades.Cliente;
import Entidades.Funcionario;
import Entidades.Banco;

/**
 *
 * @author Hugo
 */
public interface Documento {
    
    
    public void gerarDocumento(Cliente cliente, Banco banco,Funcionario funcionario);
    public int convPontos( double tamanho);
}
