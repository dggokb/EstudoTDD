package java;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletornico {
    private double valorASacar;

    private int contadorDeNotas;
    private String moeda;
    List<Cedula> listaDeCedulas = new ArrayList<Cedula>();

    public CaixaEletornico(int valorASacar) {
        this.listaDeCedulas.add(new Cedula(50, 50));
        this.listaDeCedulas.add(new Cedula(10, 50));
        this.listaDeCedulas.add(new Cedula(5, 50));
        this.valorASacar = valorASacar;
        this.contadorDeNotas = contadorDeNotas;
        this.moeda = moeda;
    }

    public void valorASacar() {
        if (valorASacar % 5 == 0)
            verificacaoDeCedulas();
        else
            System.out.print("Opa só temos notas multiplas de 5, por favor realize um novo saque\n");
    }

    public void valorASacar(String moeda) {
        if (moeda == "Dolar") {
            this.valorASacar = this.valorASacar / 3.96;
            verificacaoDeCedulas();
        }
    }

    private void verificacaoDeCedulas() {
        for (int i = 0; i < listaDeCedulas.size(); i++) {
            int valorDaCedula = listaDeCedulas.get(i).getValorDaCedula();
            contadorDeNotas = 0;
            while (valorASacar >= valorDaCedula && listaDeCedulas.get(i).getQuantidadeDeCedulas() != 0) {
                contadorDeNotas += 1;
                listaDeCedulas.get(i).setQuantidadeDeCedulas(listaDeCedulas.get(i).getQuantidadeDeCedulas() - 1);
                this.valorASacar -= valorDaCedula;
            }
            System.out.print("Foram sacadas: " + contadorDeNotas + " de: " + listaDeCedulas.get(i).getValorDaCedula() + "\n");
        }
    }

    public double getValorASacar() {
        return valorASacar;
    }

    public void setValorASacar(double valorASacar) {
        this.valorASacar = valorASacar;
    }
}
