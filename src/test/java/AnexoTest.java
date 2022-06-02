import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnexoTest {

    @Test
    void deveRetornarAnexoDocx(){
        Anexo anexo = new Anexo();
        anexo.setArquivo("atividadeLP5.docx");
        assertEquals("atividadeLP5.docx",anexo.geArquivo());
    }


    @Test
    void deveRetornarExtensaoDocx(){
        Anexo anexo = new Anexo();
       anexo.setArquivo("atividadeLP5.docx");
       assertEquals("docx",anexo.getExtensaoArquivo());
    }

    @Test
    void deveRetornarAnexoPdf(){
        Anexo anexo = new Anexo();
        anexo.setArquivo("atividadeLP5.docx");
        assertEquals("atividadeLP5.pdf", anexo.geArquivoSalvo());
    }

    @Test
    void deveRetornarExtensaoPdf(){
        Anexo anexo = new Anexo();
        anexo.setArquivo("atividadeLP5.docx");
        assertEquals("pdf",anexo.getExtensaoSalva());
    }

}