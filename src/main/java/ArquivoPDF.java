import java.util.Arrays;
public class ArquivoPDF implements IArquivo{

    private String arquivo;

    @Override
    public String getArquivo() {
        return this.arquivo;
    }

    @Override
    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}
