
import com.mycompany.conjuntosdedcoumentos.CertificadoCesion;
import com.mycompany.conjuntosdedcoumentos.DocumentacionEnBlanco;
import com.mycompany.conjuntosdedcoumentos.OrdenPedido;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JackStv
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
        documentacionEnBlanco.incluye(new OrdenPedido());
        documentacionEnBlanco.incluye(new CertificadoCesion());
        documentacionEnBlanco.incluye(new CertificadoCesion());
        DocumentacionCliente documentacionCliente_01 = new DocumentacionCliente("ED HM");
        DocumentacionCliente documentacionCliente_02 = new DocumentacionCliente("Wnely");
        DocumentacionCliente documentacionCliente_03 = new DocumentacionCliente("Ed");

        documentacionCliente_01.visuliza();
        documentacionCliente_02.visuliza();
        documentacionCliente_03.visuliza();
        
    }

}
