package sample;
//ALASTER NEHEMIAS ERAZO ARAGON
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    private static Persona[] listaPersonas = {
            new Persona("David","Delcid",21),
            new Persona("Alaster","Erazo",24),
            new Persona("Juan","Velis",22),
            new Persona("Josue","Cordoba",20),
            new Persona("Yarince","Padilla",27),
            new Persona("Oscar","Diaz",25),
            new Persona("Orlando","Calix",22),

    };

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static void buscarPorPosicion(String nombre) {
        int i = 0;
        while (i < listaPersonas.length){
            if (listaPersonas[i].nombre.startsWith(nombre)) {
                System.out.println(listaPersonas[i].nombre+" "+listaPersonas[i].apellido+" "+listaPersonas[i].edad);
            }
            else if (listaPersonas[i].nombre.equalsIgnoreCase(nombre)) {
                System.out.println(listaPersonas[i].nombre+" "+listaPersonas[i].apellido+" "+listaPersonas[i].edad);
            }
            else if (listaPersonas[i].nombre.endsWith(nombre)) {
                System.out.println(listaPersonas[i].nombre+" "+listaPersonas[i].apellido+" "+listaPersonas[i].edad);
            }
            i++;

        }
    }


}
