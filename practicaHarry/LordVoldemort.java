package practicaHarry;

public class LordVoldemort {
    // Atributos - Abstracción del personaje
    private String casa, genero, nombre, boggart, patronus, fechaNacimiento;
    private String[] debilidades = new String[3];
    private int edad;

    // Sobrecarga del constructor
    public LordVoldemort(){
    };

    public LordVoldemort(int edad, String nombre, String fechaNacimiento, String genero, String casa,
                      String boggart, String debilidad1,String debilidad2,String debilidad3){
        this.edad = edad;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.casa =  casa;
        this.boggart = boggart;
        this.debilidades[0] = debilidad1;
        this.debilidades[1] = debilidad2;
        this.debilidades[2] = debilidad3;
    }

    // Método para mostrar los datos:
    public void showDetails(){
        System.out.printf(nombre + " es un " );
        System.out.printf((genero=="Femenino")?"mujer":"hombre");
        System.out.printf(" de: " + edad + " años. \n Su casa es " + casa +", y cuyo boggart es: " +boggart +". \n" +
                "Sus debilidades más notables son: \n");
        for (String str: debilidades) {
            System.out.println("  > "+str);
        }
        System.out.printf("\n\n");
        return;
    }
}
