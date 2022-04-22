
// Miles Morales

public class MilesMorales extends Spiderman implements SpidermanActionCallbacks{
    //Llamando al constructor heredado:
    public MilesMorales(String n,String c1,String c2, String c3, int edad, String patron, double h, String genero,
                          String descripcion){
        super(n,c1,c2,c3,edad,patron,h,genero,descripcion);
    }

    // Implementando la interfaz:
    // Descripciones:
    @Override
    public String descripcionATK1() {
        String d = "El toque Miles puede paralizar a sus enemigos durante un tiempo; irónicamente también puede " +
                "paralizar a Electro.\n\n";
        return d;
    }
    @Override
    public String descripcionATK2() {
        String d = "También puede liberar grandes ráfagas de energía que incapacitan a los que lo rodean.\n\n";
        return d;
    }
    @Override
    public String equipamiento() {
        String d = "Miles, incluyendo su ropa, pueden mezclarse en su entorno, lo que le permite acercarse " +
                "sigilosamente a sus enemigos.\n\n";
        return d;
    }
    @Override
    public String transportarse() {
        String d = "Miles se aferra a cualquier superficie usando sólo sus yemas de los dedos y pies." +
                " Además, su gran fuerza le permite saltar varios metros y balancearse gracias a su lanzatelarañas.\n\n";
        return d;
    }
    @Override
    public String sAranido() {
        String d = "Cuando hay peligros presentes, Miles siente un zumbido en la cabeza como una especie de sistema " +
                "de alerta.\n\n";
        return d;
    }

    // Informacion personaje
    @Override
    public void presentacion(Screen s) {
        s.setVisible(true);

        s.out("\t\t\tMiles Morales\n","BOLD",30,Colors.black);
        s.out(mostrarInformacion(),"Courier",15,Colors.black);
        s.showImage("src\\Images\\MilesMorales\\MilesMorales.jpg",600,400);
        s.setBounds(400,0,650,700);
    }


    // Ataques:
    @Override
    public void ataqueConContacto(Screen s) {
        s.repaint();
        s.out("\n\n     Toque Venenoso\n","BOLD",20,Colors.RoyalBlue);
        s.out(descripcionATK1(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\MilesMorales\\1.gif");
        s.setBounds(400,0,650,700);
    }

    @Override
    public void ataqueCortaDistancia(Screen s) {
        s.repaint();
        s.out("\n\n     Toque Eléctrico\n","BOLD",20,Colors.RoyalBlue);
        s.out(descripcionATK2(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\MilesMorales\\2.gif");
        s.setBounds(400,0,650,700);
    }

    @Override
    public void habilidadEquipamiento(Screen s) {
        s.repaint();
        s.out("\n\n     Camuflaje - Equipamiento\n","BOLD",20,Colors.RoyalBlue);
        s.out(equipamiento(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\MilesMorales\\3.jpg",500,450);
        s.setBounds(400,0,650,700);
    }

    @Override
    public void movilidad(Screen s) {
        s.repaint();
        s.out("\n\n     Escala-Muros y Lanzatelarañas:\n","BOLD",20,Colors.RoyalBlue);
        s.out(transportarse(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\MilesMorales\\4.gif");
        s.setBounds(400,0,650,700);
    }

    @Override
    public void sentidoAracnido(Screen s) {
        s.repaint();
        s.out("\n\n     Sentido Arácnido:\n","BOLD",20,Colors.RoyalBlue);
        s.out(transportarse(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\MilesMorales\\5.jpg");
        s.setBounds(400,0,650,700);
        s.out("\n","BOLD",30,Colors.black);
    }
}
