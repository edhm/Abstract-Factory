
import com.mycompany.conjuntosdedcoumentos.Documentacion;
import com.mycompany.conjuntosdedcoumentos.DocumentacionEnBlanco;
import com.mycompany.conjuntosdedcoumentos.Documento;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JackStv
 */
public class DocumentacionCliente extends Documentacion {

    public DocumentacionCliente(String informacion) {
        documentos = new ArrayList<Documento>();
        DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
        List<Documento> documentosEnBlanco = documentacionEnBlanco.getDocuemntos();
        for (Documento documento : documentosEnBlanco) {
            Documento copiDocumento = documento.duplica();
            copiDocumento.rellena(informacion);
            documentos.add(copiDocumento);
        }
    }

    public void visuliza() {
        documentos.forEach(documento -> {
            documento.visualiza();
        });

    }

    public void imprime() {
        documentos.forEach(documento -> {
            documento.imprime();
        });
    }

}
