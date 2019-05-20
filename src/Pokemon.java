public class Pokemon {

    private long id;
    private String name;
    private String type;
    private int hp;

    public Pokemon(long pokemonId, String pokemonName, String pokemonType, int pokemonHp){
    this.id = pokemonId;
    this.name = pokemonName;
    this.type = pokemonType;
    this.hp = pokemonHp;
    }

    public String toString(){
        return String.format(" id: %s \n Pokemon: %s \n Type: %s \n Current hp: %s \n",this.id, this.name, this.type, this.hp);
    }

//    public long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public int getHp() {
//        return hp;
//    }
//
//
//    public void setHp(int hp) {
//        this.hp = hp;
//    }
//
}
