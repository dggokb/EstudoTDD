import java.util.ArrayList;
import java.util.List;

public class CriandoUmaLista {
    private List<Integer> lista = new ArrayList<Integer>();

    public CriandoUmaLista() {
        this.lista.add(2);
        this.lista.add(2);
    }

    public int somaDeValoresDeUmaLista() {
        return lista.get(0) + lista.get(1);
    }
}

