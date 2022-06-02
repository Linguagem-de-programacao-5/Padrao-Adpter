public class Anexo {

    IArquivo arquivo;
    ArquivoAdapter persistencia;

    public Anexo() {
        arquivo = new ArquivoWord();
        persistencia = new ArquivoAdapter(arquivo);
    }

    public void setArquivo(String arquivoWord){
        arquivo.setArquivo(arquivoWord);
        persistencia.salvarArquivo();
    }

    public String geArquivo(){
        return persistencia.recuperarArquivo();
    }

    public String getExtensaoArquivo(){
        String[] arquivoSeparado = persistencia.recuperarArquivo().split("\\.");
        return arquivoSeparado[1];
    }

    public String geArquivoSalvo(){
        return persistencia.getArquivo();
    }
    public String getExtensaoSalva(){
        String[] arquivoSeparado = persistencia.getArquivo().split("\\.");
        return arquivoSeparado[1];
    }
}
