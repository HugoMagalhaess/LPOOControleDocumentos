/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Banco;
import Entidades.Banco;
import Entidades.Cliente;
import Entidades.Funcionario;


/**
 *
 * @author Hugo
 */
public class ComunicadoInterno implements Documento{
        @Override
    public void gerarDocumento(Cliente cliente, Banco banco, Funcionario funcionario) {
        //falta implementar modelo
    }

    @Override
    public int convPontos(double tamanho) {
        return  (int)(tamanho * 28.34645669291339);
    }

 
}

