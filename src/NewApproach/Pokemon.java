package NewApproach;

public class Pokemon {

    public String name;
    public String type;
    public int hp;


    public Pokemon(String name){
        this.name = name;
    }
    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public Pokemon(String name, String type, int hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
