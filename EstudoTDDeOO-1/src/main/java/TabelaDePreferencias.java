public class TabelaDePreferencias {
    public double getValorDaPreferencia(String preferencia) {
        if (preferencia == "Vegetariano")
            return 100;
        if (preferencia == "Oriental")
            return 150;
        if (preferencia == "Francesa")
            return 250;
        return 0;
    }
}
