public class CreatePokemon {

    private static Pokemon[] pokemons = new Pokemon[18];

    public static void main(String[] args) {
        pokemons[0] = createAPokemon(1, "Pikachu", "electric", 35,1);
        pokemons[1] = createAPokemon(2, "Charmander", "fire", 39, 1);
        pokemons[2] = createAPokemon(3, "Squirtle", "water", 44,1);
        pokemons[3] = createAPokemon(4, "Geodude", "rock",40, 1);
        pokemons[4] = createAPokemon(5, "Rhyhorn", "rock", 80, 1);
        pokemons[5] = createAPokemon(6, "Onix", "rock", 35, 1);
        pokemons[6] = createAPokemon(7, "Mankey", "fighting", 40,1);
        pokemons[7] = createAPokemon(8, "Machop","fighting", 70, 1);
        pokemons[8] = createAPokemon(9, "Hitmonchan", "fighting", 50,1);
        pokemons[9] = createAPokemon(10, "Poliwag", "water",40,1);
        pokemons[10] = createAPokemon(11, "Staryu", "water", 30,1);
        pokemons[11] = createAPokemon(12, "Gyarados", "water", 95, 1);
        pokemons[12] = createAPokemon(13, "Vulpix", "fire", 38,1);
        pokemons[13] = createAPokemon(14, "Growlith", "fire", 55, 1);
        pokemons[14] = createAPokemon(15, "Ponyta", "fire", 50, 1);
        pokemons[15] = createAPokemon(15, "Jolteon", "electric", 65,1);
        pokemons[16] = createAPokemon(16, "Zapdos", "electric", 90, 1);
        pokemons[17] = createAPokemon(17, "Voltorb", "electric", 40,1);
        list(pokemons);
    }
    private static Pokemon createAPokemon(int id, String name, String type, int hp, int lvl){
        Pokemon pokemon = new Pokemon(id, name, type, hp, lvl);
        return pokemon;
    }

    private static void list(Pokemon[] pokemons) {
        for (Pokemon pokemon : pokemons){
            System.out.println(pokemon);
        }
    }
}
