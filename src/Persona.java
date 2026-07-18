public class Persona {
    public int edad;
    public String nombre;
    public double altura;

    public Persona(){
        edad=18;
        nombre="desconocido";
        altura=1.80;
    }
    public Persona(int edad, String nombre, double altura){
        this.edad=edad;
        this.nombre=nombre;
        this.altura=altura;
    }

    public int dameedad(){
        return edad;
    }

    public String damenombre(){
        return nombre;
    }

    public String damedatos(){
        return "Nombre: " + nombre +"\nedad: "+ edad +"\nEs alto: "+ altura;
    }

    public boolean esalto(){
        return altura>1.75;
    }
}
