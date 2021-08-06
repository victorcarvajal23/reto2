package reto2;

public class Reto2 {

    public static void main(String[] args) {
        Usuario obj = new Usuario("Lucia Gomez", 1097000000, "lucia.gomez@correo.com", 25, "desarrollo", false);

        obj.info();
        Usuario obj2 = new Usuario("Lucia Gomez", 1097000000, "lucia.gomez@correo.com", 25, "desarrollo", true);

        obj2.info();
        Usuario obj3 = new Usuario("Lucia Gomez", 1097000000, "lucia.gomez@correo.com", 25, "administrativa", false);

        obj3.info();
        Usuario obj4 = new Usuario("Lucia Gomez", 1097000000, "lucia.gomez@correo.com", 25, "administrativa", true);

        obj4.info();
        
    }

}
