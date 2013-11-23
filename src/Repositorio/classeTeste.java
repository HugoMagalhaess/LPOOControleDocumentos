/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import Entidades.Funcionario;
import Entidades.Banco;
import com.itextpdf.text.DocumentException;
import java.io.IOException;

/**
 *
 * @author Hugo
 */
public class classeTeste {
    public static void main(String[] args) throws DocumentException, IOException {
        
       //teste  o banco   
        
        RepositorioList list = new RepositorioList();
        Funcionario func = new Funcionario("Arthur PAdilha","(81) 3333-3333" );
        Banco banco = new Banco("Bradesco", "Rua Almeida Prado 255","50000-000", "Recife", "PB");
        
        list.init();
       
        func.gerarOficio(list.buscaClienteNome("Hugo"), banco, func);
  
        
    }
}
