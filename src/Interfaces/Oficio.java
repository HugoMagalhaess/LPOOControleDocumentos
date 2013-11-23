/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Banco;
import Entidades.Cliente;
import Entidades.Funcionario;
import Entidades.Banco;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hugo
 */
public class Oficio implements Documento{

    public Oficio(Cliente cliente, Banco banco, Funcionario funcionario) {
        gerarDocumento(cliente, banco, funcionario);
    }


    @Override
    public void gerarDocumento(Cliente cliente, Banco banco, Funcionario funcionario) {
              Document doc = null;
        OutputStream os = null;
	
        String bank = "BANCO DO BRASIL";
        
        try {
            //cria o documento tamanho A4, margens de 2,54cm
            
            
            doc = new Document(PageSize.A4, 
                    convPontos(2.83),
                    convPontos(1.5),
                    convPontos(2.93),
                    convPontos(0.5));
			
            //cria a stream de saída
            os = new FileOutputStream("D:\\Oficio.pdf");
			
            //associa a stream de saída ao 
            PdfWriter.getInstance(doc, os);
			
            //abre o documento
            doc.open();

            //adiciona o texto ao PDF
            
            
          //  Image logoCaixa = Image.getInstance("D:\\LPOO-Projeto\\logoCaixa.png");
            //Image logoFgts = Image.getInstance("D:\\LPOO-Projeto\\logoFgts.png");
            
//            logoCaixa.setAlignment(Image.ALIGN_LEFT);
//            doc.add(logoCaixa);
//            logoFgts.setAlignment(Image.ALIGN_RIGHT);
//            doc.add(logoFgts);
//            
            
            Font f = new Font(Font.FontFamily.TIMES_ROMAN, 10);
            
            
            Paragraph cabecalho = new Paragraph("Gerência de Filial de FGTS em Recife -GIFUG/RE - Gerir Cadastro – Gestão da Base de Dados\n"
                     + "Av. Cais do Apolo, 421 - 3º Andar – Bairro do Recife\n" 
                     + "50.030-230 – Recife/PE\n\n", f);
            cabecalho.setAlignment(Paragraph.ALIGN_CENTER);
            doc.add(cabecalho);
           
            Paragraph local = new Paragraph("Local / Data do dia da geração do documento (Recife, __ de ____ de ____)",f);
            local.setAlignment(Paragraph.ALIGN_RIGHT);
            doc.add(local);
            
            Paragraph agencia =  new Paragraph("AO\n"+"BANCO " + banco.getNome() + "\n"
                                                +"Endereço:"+banco.getEndereço() + " \n"
                                                +"CEP:"+ banco.getCep()+" – "+ banco.getCidade()+" /"+banco.getEstado(),f);
            doc.add(agencia);
          
            Paragraph assunto = new Paragraph("Assunto: \n\n Senhor (a) Gerente,\n\n",f);
            doc.add(assunto);
            
            Paragraph solicitacao = new Paragraph("1\tSolicitamos enviar extrato analítico da conta vinculada do FGTS,"
                    + "desde a admissão/opção do trabalhador abaixo indicado, até a transferência dos valores à CAIXA, "
                    + "conforme dados abaixo: \n"
                    +"Empresa:"+ cliente.getEmpresa()+"\n" +
                    "CNPJ: 00.000.000/0000-00\n" +
                    "Empregado: "+ cliente.getNome()+"\n" +
                    "PIS: "+cliente.getPis() + "\n" +
                    "CTPS:" +cliente.getCtps()+"\n" +
                    "Data de Admissão/Opção: __/__/____ \n"
                    + "2      Salientamos que os referidos extratos são necessários para atendimento à demanda judicial \n" +
                    "referente ao processo Nº ____________________-____ da __ª Vara do Trabalho do Recife/PE.\n"
                    + "3      Estamos à disposição para quaisquer esclarecimentos através dos fones (81) ____-____/____.",f);
            doc.add(solicitacao);
            
            Paragraph att = new Paragraph("Atenciosamente,\n" +
                                                "\n" +
                                                "\n" +
                                                "\n" +
                                                "\n" +
                                                "Funcionário Responsável pela inclusão das informações\n" +
                                                "Cargo / Função \n" +
                                                "Gerência / Coordenação\n" +
                                                "\n" +
                                                "\n" +
                                                "\n" +
                                                "\n" +
                                                "Funcionário com função de Coordenação\n" +
                                                "Coordenador de Filial\n" +
                                                "Gerência / Coordenação",f);
            
            doc.add(att);
            
            Paragraph rodape =  new Paragraph("OUVIDORIA CAIXA: www.caixa.gov.br/ouvidoria - 0800-7257474 (para deficientes auditivos) e 0800-7262492"
                    + " (de segunda a sexta das 07 às 20 horas). ",f);
           doc.add(rodape); 
            
            
        } catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(Oficio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (doc != null){
                //fechamento do documento
                doc.close();
            }
            if (os != null) {
                try {
                    //fechamento da stream de saída
                    os.close();
                } catch (IOException ex) {
                    Logger.getLogger(Oficio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

   
    @Override
    public int convPontos(double tamanho) {
        return  (int)(tamanho * 28.34645669291339);
    }
}
