// TODO: 2019-05-17
// TODO: Create attack (attack String name; Int Damage;)

public class attack {
    private long id;
    private String name;
    private int damage;

    public attack(long attackId, String attackName,  int attackDamage,){
        this.id = attackId;
        this.name = attackName;
        this.damage = attackDamage;
    }
    public String toString(){
        return String.format("This Pokemon used %s attack and caused %s damage", this.name, ths.damage);
    }
}
