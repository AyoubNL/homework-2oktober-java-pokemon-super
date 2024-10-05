package nl.novi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Today " + LocalDate.now());
        System.out.println("You will train a Pokemon");
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 20, 100, "pikka", "berries");
        FirePokemon charmander = new FirePokemon("Charmander", 20, 100, 50, 70);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 15, 100, false, 2);
        GrassPokemon bellossom = new GrassPokemon("Bellossom", 10, 100, true, false);

        pikachu.speaks();
        pikachu.eat();
        pikachu.sound();

        charmander.speaks();
        charmander.flameThrower(21);
        charmander.waterDefense(51);

        squirtle.speaks();
        squirtle.sun();
        squirtle.fireDefense(squirtle.fireresistance);

        bellossom.speaks();
        bellossom.terrain(bellossom.getGrassTerrain());
        bellossom.weather(bellossom.getRain());


        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(pikachu);
        pokemonList.add(charmander);
        pokemonList.add(squirtle);
        pokemonList.add(bellossom);

        for (Pokemon p : pokemonList){
           p.speaks();
        }
    }


}

