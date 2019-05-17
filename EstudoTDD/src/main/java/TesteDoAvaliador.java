public class TesteDoAvaliador {

    public static void main (String[] args){
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("PS3 Novo");

        leilao.adicionaNaListaDeLances(new Lance(joao,300.0));
        leilao.adicionaNaListaDeLances(new Lance(jose, 400.0));
        leilao.adicionaNaListaDeLances(new Lance(maria, 250.0));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        System.out.println(leiloeiro.getMaiorLance());
        System.out.println(leiloeiro.getMenorLance());
    }
}
