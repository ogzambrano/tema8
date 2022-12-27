public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(28);
        persona.setNombre("oscar");
        persona.setTelefono("123-456789");
        System.out.println(
                "nombre:"+persona.getNombre()+
                " edad:"+persona.getEdad()+
                " telefono:"+persona.getTelefono());
    }
}

class Persona{
    private int edad=0;
    private String nombre="";
    private String telefono="";

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}