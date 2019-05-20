// TODO: 2019-05-17
// TODO: Create Attack (Attack String name; Int Damage;)

public class Attack {
    private long id;
    private String name;
    private int damage;

    public Attack(long attackId, String attackName, int attackDamage){
        this.id = attackId;
        this.name = attackName;
        this.damage = attackDamage;
    }
    public String toString(){
        return String.format("This Pokemon used %s Attack and caused %s damage", this.name, this.damage);
    }
}
