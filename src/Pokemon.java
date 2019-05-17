public class Pokemon {

    private long id;
    private String name;
    private String type;
    private int hp;
    private int lvl;

    public Pokemon(long pokemonId, String pokemonName, String pokemonType, int pokemonHp, int pokemonLvl){
    this.id = pokemonId;
    this.name = pokemonName;
    this.type = pokemonType;
    this.hp = pokemonHp;
    this.lvl = pokemonLvl;
    }

    public String toString(){
        return String.format(" id: %s \n Pokemon: %s \n Type: %s \n Current hp: %s \n Current lvl: %s \n",this.id, this.name, this.type, this.hp, this.lvl);
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
//    public int getLvl() {
//        return lvl;
//    }
//
//    public void setHp(int hp) {
//        this.hp = hp;
//    }
//
//    public void setLvl(int lvl) {
//        this.lvl = lvl;
//    }
}
