import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        // 1. Utilizando o estrutura de dados Lista, desenvolva os seguintes métodos: (3
        // pontos)
        // A. Faça um método que inverta todos os elementos de uma Lista;
        // B. Faça um método que adiciona um elemento na lista de forma ordenada;
        // C. Faça um método que ao receber uma outra lista, ele retorne uma nova lista
        // com a intercalação dos elementos da lista atual com a lista informada por
        // parâmetro;
        // D. Criei uma classe com o método main e implemente os testes das alternativas
        // anteriores.

        Lista lista = new Lista(10);

        Lista listaParaIntercalar = new Lista(10);
        ArrayList listaIntercalarNormal = new ArrayList();

        lista.adiciona(10);
        lista.adiciona(15);
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(17);

        System.out.println("1) a. \n");
        System.out.println(lista);
        lista.inverte();
        System.out.println(lista);
        lista.inverte();
        System.out.println(lista);
        lista.inverte();
        System.out.println(lista);

        System.out.println("\n1) c. \n");

        listaParaIntercalar.add(10);
        listaParaIntercalar.add(20);
        listaParaIntercalar.add(30);
        listaParaIntercalar.add(40);
        listaParaIntercalar.add(50);

        listaIntercalarNormal.add(100);
        listaIntercalarNormal.add(200);
        listaIntercalarNormal.add(300);
        listaIntercalarNormal.add(400);
        listaIntercalarNormal.add(500);


        System.out.print("Lista normal: ");

        System.out.print("[");
        for (int i = 0; i < listaParaIntercalar.size() ; i++) {  // Gambiarra pra printar pq não tem no toString
            System.out.print(listaParaIntercalar.get(i)+ ", ");
        }
        System.out.print("]\n");

        System.out.print("Lista intercalada: ");

        listaParaIntercalar.intercalar(listaIntercalarNormal);
        System.out.print("[");
        for (int i = 0; i < listaParaIntercalar.size() ; i++) {  // Gambiarra pra printar pq não tem no toString
            System.out.print(listaParaIntercalar.get(i)+ ", ");
        }
        System.out.print("]\n");

        // Utilizando a estrutura de dados List (ApiJava) faça um
        // programa que faça uma lista se comportar como uma pilha, ou
        // seja a lista tem que inserir e remover na primeira posição.
        // Criei uma classe nova chamada ListaPilha utilizando como atributo
        // um objeto List e implemente o método adicionar e remover conforme
        // descrito acima. Faça uma classe com o método main e demonstre o
        // funcionamento da nova classe. (4 pontos)

        System.out.println("\n2) \n");

        ListaPilha listaPilha = new ListaPilha<>();

        listaPilha.adicionar("Leandro");
        listaPilha.adicionar("Carine");
        listaPilha.adicionar("Ronaldo");
        listaPilha.adicionar("Joaquim");

        System.out.println("4 elementos adicionados: " + listaPilha);

        listaPilha.remover();

        System.out.println("Removendo o último elemento: " + listaPilha+ "\n");

        listaPilha.adicionar("Ricardo");
        listaPilha.adicionar("Pedro");

        System.out.println("2 elementos adicionados: " + listaPilha);

        listaPilha.remover();

        System.out.println("Removendo o último elemento: " + listaPilha);

        System.out.println("\n3) A. \n");

        ListaLigada listaLigada = new ListaLigada();
        ListaLigada listaIntercalar = new ListaLigada();

        listaLigada.add(10);
        listaLigada.add(20);
        listaLigada.add(30);
        listaLigada.add(40);
        listaLigada.add(50);

        System.out.println("Lista normal: " + listaLigada);
        listaLigada.inverte();
        System.out.println("Lista invertida: " + listaLigada);
        listaLigada.inverte();
        System.out.println("Lista normal: " + listaLigada);
        listaLigada.inverte();
        System.out.println("Lista invertida: " + listaLigada);
        listaLigada.inverte();

        listaIntercalar.add(1);
        listaIntercalar.add(2);
        listaIntercalar.add(3);
        listaIntercalar.add(4);
        listaIntercalar.add(5);

        listaLigada.intercalar(listaIntercalar);

        System.out.println("\nLista intercalada: " + listaLigada);

        System.out.println("\n3) B. \n");

        ListaLigada novaLista = new ListaLigada();

        novaLista.add(1000);
        novaLista.add(2000);
        novaLista.add(3000);
        novaLista.add(4000);
        novaLista.add(5000);

        System.out.println("Nova lista sem união: " + novaLista);
        novaLista.unir(listaIntercalar);
        System.out.println("Nova lista com união: " + novaLista);

    }
}
