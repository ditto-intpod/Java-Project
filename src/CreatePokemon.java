public class CreatePokemon {

    private static Pokemon[] pokemons = new Pokemon[18];

    public static void main(String[] args) {
        pokemons[0] = createAPokemon(1, "Pikachu", "electric", 3);
        pokemons[1] = createAPokemon(2, "Charmander", "fire", 39);
        pokemons[2] = createAPokemon(3, "Squirtle", "water", 4);
        pokemons[3] = createAPokemon(4, "Geodude", "rock",40);
        pokemons[4] = createAPokemon(5, "Rhyhorn", "rock", 80);
        pokemons[5] = createAPokemon(6, "Onix", "rock", 35);
        pokemons[6] = createAPokemon(7, "Mankey", "fighting", 4);
        pokemons[7] = createAPokemon(8, "Machop","fighting", 70);
        pokemons[8] = createAPokemon(9, "Hitmonchan", "fighting", 5);
        pokemons[9] = createAPokemon(10, "Poliwag", "water",4);
        pokemons[10] = createAPokemon(11, "Staryu", "water", 3);
        pokemons[11] = createAPokemon(12, "Gyarados", "water", 95);
        pokemons[12] = createAPokemon(13, "Vulpix", "fire", 3);
        pokemons[13] = createAPokemon(14, "Growlith", "fire", 55);
        pokemons[14] = createAPokemon(15, "Ponyta", "fire", 50);
        pokemons[15] = createAPokemon(15, "Jolteon", "electric", 6);
        pokemons[16] = createAPokemon(16, "Zapdos", "electric", 90);
        pokemons[17] = createAPokemon(17, "Voltorb", "electric", 4);
        list(pokemons);
    }
    private static Pokemon createAPokemon(int id, String name, String type, int hp){
        Pokemon pokemon = new Pokemon(id, name, type, hp);
        return pokemon;
    }

    private static void list(Pokemon[] pokemons) {
        for (Pokemon pokemon : pokemons){
            System.out.println(pokemon);
        }
    }
}
