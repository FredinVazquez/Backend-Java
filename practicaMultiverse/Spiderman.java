
// Clase base:
public class Spiderman {
    // Atributos
    private String nombre;
    private String colorTraje1_Base;
    private String colorTraje2_Contornos;
    private String colorTraje3_Detalles;
    private int edad;
    private String patronTraje;
    private double altura;
    private String genero;
    private String descripcion;

    // Constructor por omisión:
    public Spiderman(){}

    // Constructor para inicializar
    public Spiderman(String n,String c1,String c2, String c3, int edad, String patron, double h, String genero,
                     String descripcion){
        this.nombre = n;
        this.colorTraje1_Base = c1;
        this.colorTraje2_Contornos = c2;
        this.colorTraje3_Detalles = c3;
        this.edad = edad;
        this.patronTraje = patron;
        this.altura = h;
        this.genero = genero;
        this.descripcion = descripcion;
    }

    // Getters
    public String getNombre() {return nombre;}
    public String getColorTraje1_Base() {return colorTraje1_Base;}
    public String getColorTraje2_Contornos() {return colorTraje2_Contornos;}
    public String getColorTraje3_Detalles() {return colorTraje3_Detalles;}
    public int getEdad() {return edad;}
    public String getPatronTraje() {return patronTraje;}
    public double getAltura() {return altura;}
    public String getGenero() {return genero;}
    public String getDescripcion() {return descripcion;}


    // Método para mostrar información personal.
    public String mostrarInformacion(){
        String d =
                "\n     Información acerca de " + getNombre() +
                        " \n\n Descripción: "+getDescripcion()+". \n\n"+
                        " \n  Edad de "+getNombre()+", actualmente: "+getEdad()+
                        " \n  Altura: "+getAltura()+" [cm]"+
                        " \n  Género: "+getGenero()+
                        " \n\n     Datos de su traje: \n" +
                        " \n  Color Primario, base del traje: "+getColorTraje1_Base()+
                        " \n  Color Secundario del traje: "+getColorTraje2_Contornos()+
                        " \n  Color de los detalles del traje: "+getColorTraje3_Detalles()+
                        " \n  Patron (decoración) del traje: "+getPatronTraje()+"\n\n"
                ;
        return d;
    }


}
