package NewApproach;

public class MainGame{

    public static void main(String[] args) {
        //Test
        Electric Pikachu = new Electric("Pikachu");
        Pikachu.setHp(45);
        System.out.println(Pikachu.getName());
        System.out.println(Pikachu.getType());
        System.out.println(Pikachu.getHp());
        Fire Charmander = new Fire("Charmander");
        System.out.println(Charmander.getName());
        System.out.println(Charmander.getType());
        Water Squirtle = new Water("Squirtle");
        System.out.println(Squirtle.getName());
        System.out.println(Squirtle.getType());
    }

}
