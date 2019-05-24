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
    public void getInfo(){
        System.out.format("\nName: %s \nType: %s \nHP: %s \n", this.name, this.type, this.hp);
    }

    public String getName() {
        return "Name: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return "Type: " + type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHp() {
        return "HP: " + hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
