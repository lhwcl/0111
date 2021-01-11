package jiekou;

public class Test {
    public static void main(String[] args) {
        Door door=new AlermDoor();
        door.open();
        Alerm adoor=new AlermDoor();
        adoor.alerm();
        door.close();
    }
}
