public class CreateAttack {

    private static Attack[] Attacks = new Attack[2];

    public static void main(String[] args) {
        Attacks[0] = createAttack(1, "thunder shock", 40);
        Attacks[1] = createAttack(2, "leaf throw", 20);
        display(Attacks);
    }
    private static Attack createAttack(int id, String name, int damage){
        Attack Attack = new Attack(id, name, damage);
        return Attack;
    }
    private static void display(Attack[] Attacks) {
        for (Attack attack : Attacks){
            System.out.println(attack);
        }
    }
}
