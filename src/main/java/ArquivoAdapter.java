public class ArquivoAdapter extends ArquivoPDF{

    private IArquivo arquivoWord;

    public ArquivoAdapter(IArquivo  arquivoWord) {
        this.arquivoWord = arquivoWord;
    }

    public void salvarArquivo(){
        String[] arquivoSeparado = arquivoWord.getArquivo().split("\\.");
        this.setArquivo(arquivoSeparado[0]+".pdf");
    }

    public String recuperarArquivo(){
        return arquivoWord.getArquivo();
    }
}
