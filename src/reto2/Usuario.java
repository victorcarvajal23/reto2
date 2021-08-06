package reto2;

public class Usuario {

    String nombre;
    private int identificacion;
    private String email;
    int edad;
    private String area;
    boolean jefe;
    float salario;

    public Usuario(String nombre, int identificacion, String email, int edad, String area, boolean jefe) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.edad = edad;
        this.area = area;
        this.jefe = jefe;
        float base = 908526 * 4;
        
        switch (area) {
            case "desarrollo":
                if (jefe == true) {
                    salario = 4500000 + 2500000;
                } else {
                    salario = 4500000;
                }
                break;
            case "administrativa":
                if (jefe == true) {
                    salario = 3500000 + 3000000;
                } else {
                    salario = 3500000;
                }
                break;
            default:
                salario = 0;
                break;
        }

        if (salario > base) {
            salario = salario * 0.91f;
        } else {
            salario = salario * 0.92f;
        }
    }

    public void info() {
        System.out.println("Nombre: " + nombre + "\nIdentificacion: " + identificacion + "\nEmail: " + email + "\nEdad: " + edad + "\nArea: " + area + "\nSalario: " + salario + "\n");
    }

}
