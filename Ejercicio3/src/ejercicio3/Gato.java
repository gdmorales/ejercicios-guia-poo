package ejercicio3;
public class Gato extends Animal {

    String color_ojos;

    public Gato(String nombre, String alimento, int edad, String color_ojos) {
        super(nombre, alimento, edad);
        this.color_ojos = color_ojos;
    }

    public String getColor_ojos() {
        return color_ojos;
    }

    public void setColor_ojos(String color_ojos) {
        this.color_ojos = color_ojos;
    }

    public void mostrar(){
        System.out.println(getNombre() + "-"+getAlimento()+"-"+getEdad()+"-"+getColor_ojos());
    }
}
