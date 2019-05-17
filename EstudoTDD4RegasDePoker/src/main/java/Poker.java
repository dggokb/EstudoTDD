import java.util.List;

public class Poker {
    public String buscaDuasCartasIguais(List<Integer> list) {
        return buscaDeDuasCartasIguais(list);
    }

    public String buscaTresCartasIguais(List<Integer> list) {
        return buscaDeTresCartasIguais(list);
    }

    public String buscaDeDoisParesIguaisOuFullHouse(List<Integer> list) {
        return buscaDoisParesOuFullHouse(list);
    }

    public String buscaDeDuasCartasIguais(List<Integer> list) {
        String achouDuasCartasIguais = "";
        int valorDaCarta = list.get(0);
        int posicao = 1;

        while (posicao != 5) {
            for (int i = posicao; i < list.size(); i++) {
                if (valorDaCarta == list.get(i)) {
                    achouDuasCartasIguais = "Duas";
                }
            }
            valorDaCarta = list.get(posicao);
            posicao += 1;
        }
        return achouDuasCartasIguais;
    }

    public String buscaDeTresCartasIguais(List<Integer> list) {
        String achouTresCartasIguais = "";
        String cartaEncontrada = "Nenhuma Carta";
        int valorDaCarta = list.get(0);
        int contador = 0;
        int posicao = 1;

        while (posicao != 5) {
            for (int i = posicao; i < list.size(); i++) {
                if (valorDaCarta == list.get(i)) {
                    if (contador == 2) {
                        cartaEncontrada = "Tres";
                        contador = 0;
                    }
                    contador += 1;
                }
            }
            valorDaCarta = list.get(posicao);
            posicao += 1;
        }
        return cartaEncontrada;
    }

    public String buscaDoisParesOuFullHouse(List<Integer> list) {
        String umPar = "";
        String cartaEncontrada = "Nenhuma Carta";
        int valorDaCarta = list.get(0);
        int contador = 0;
        int posicao = 1;
        int ultimaCarta = 0;

        while (posicao != 5) {
            for (int i = posicao; i < list.size(); i++) {
                if (valorDaCarta == list.get(i)) {
                    contador += 1;
                    if (contador == 1) {
                        umPar = "UmPar";
                        ultimaCarta = list.get(i);
                    }
                    if (contador == 2 && umPar == "UmPar" && ultimaCarta != valorDaCarta)
                        cartaEncontrada = "DoisPares";
                    if (contador == 3)
                        cartaEncontrada = "FullHouse";
                }
            }
            valorDaCarta = list.get(posicao);
            posicao += 1;
        }

        return cartaEncontrada;
    }


    public String buscaCartasEmSequencia(List<Integer> list) {
        String achouFlush = "";
        int cont = 0;
        int maiorCarta = list.get(0);
        int cartaATrocar = 0;
        int posicao = 0;

        while (posicao != 4) {
            for (int i = posicao; i < list.size(); i++) {
                if (maiorCarta < list.get(i)) {
                    cartaATrocar = maiorCarta;
                    maiorCarta = list.get(i);
                    list.set(i, cartaATrocar);
                    list.set(i - cont, maiorCarta);
                    if(cartaATrocar == maiorCarta){
                        achouFlush = "NADA";
                    }
                }
                cont += 1;
            }
            System.out.println(list);
            posicao += 1;
            maiorCarta = list.get(posicao);
            cont=0;
        }
        return "Flush";
    }
}
