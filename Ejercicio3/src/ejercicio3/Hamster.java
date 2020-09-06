package ejercicio3;
public class Hamster extends Animal{
     int cantidad_pulgas;

    public Hamster(String nombre, String alimento, int edad,int cantidad_pulgas) {
        super(nombre, alimento, edad);
        this.cantidad_pulgas = cantidad_pulgas;
    }

    public int getCantidad_pulgas() {
        return cantidad_pulgas;
    }

    public void setCantidad_pulgas(int cantidad_pulgas) {
        this.cantidad_pulgas = cantidad_pulgas;
    }

    public void mostrar(){
        System.out.println(getNombre() + "-"+getAlimento()+"-"+getEdad()+"-"+getCantidad_pulgas());
    }
    
}
