package ejercicio3;
public class Animal {

    private String nombre,alimento;
    private int edad;

    public Animal(String nombre,String alimento,int edad){
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}