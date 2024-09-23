package br.com.alex.screenmatch.principal;

import br.com.alex.screenmatch.modelos.Filme;
import br.com.alex.screenmatch.modelos.Serie;
import br.com.alex.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        var filmeDoAlex = new Filme("DogVille", 2003);
        filmeDoAlex.avalia(7);
        Serie lost = new Serie("Lost", 2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoAlex);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme){
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());

            }
        }

        List<String> buscarPorNome = new ArrayList<>();
        buscarPorNome.add("Mimi");
        buscarPorNome.add("Alex");
        buscarPorNome.add("Ted");
        buscarPorNome.add("Mila");

        System.out.println(buscarPorNome);

        Collections.sort(buscarPorNome);
        System.out.println("Após ordenação");
        System.out.println(buscarPorNome);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
