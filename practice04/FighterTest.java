public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit) 
        System.out.println("f : Unit's baby");

        if (f instanceof Fightable) 
        System.out.println("f : Fightable's interface");

        if (f instanceof Movable) 
        System.out.println("f : Movable's interface");

        if (f instanceof Attackable) 
        System.out.println("f : Attackable's interface");

        if (f instanceof Object) 
        System.out.println("f : Object's baby");
    }    
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) { }
    public void attack(Unit u) { }
}
class Unit {
    int currentHP;
    int x;
    int y;
}
interface Fightable extends Movable, Attackable { }
interface Movable { void move(int x, int y); }
interface Attackable { void attack(Unit u); }