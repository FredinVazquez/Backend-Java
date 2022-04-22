
// Gwen Stacy

public class GwendolynStacy extends Spiderman implements SpidermanActionCallbacks{
    //Llamando al constructor heredado:
    public GwendolynStacy(String n,String c1,String c2, String c3, int edad, String patron, double h, String genero,
                       String descripcion){
        super(n,c1,c2,c3,edad,patron,h,genero,descripcion);
    }

    // Implementando la interfaz:
    // Descripciones:
    @Override
    public String descripcionATK1() {
        String d = "Gwen es una hábil luchadora de estilo libre. Sin embargo, aprendió la mayoría de sus " +
                "movimientos de las películas de Kung-Fu.\n\n";
        return d;
    }
    @Override
    public String descripcionATK2() {
        String d = "Ella es propietaria de lanza-telarañas creado por Janet Van Dyne (luchadora retirada), con estos " +
                "ha podido aprovecar para usarlos en combato a corta y media distancia.\n\n";
        return d;
    }
    @Override
    public String equipamiento() {
        String d = "Tiene una posesión de un reloj de pulsera que le ayuda a viajar a otros multiversos debido a los acontecimientos de Spider-Verse. \n\n";
        return d;
    }
    @Override
    public String transportarse() {
        String d = "Debido a su habilidad, puede escalar muros y gracias a su laza telarañas columpiarse por" +
                " medio de los edificios.\n\n";
        return d;
    }
    @Override
    public String sAranido() {
        String d = "Spider-Woman posee un sentido extrasensorial o sentido arácnido que le avisa de los potenciales " +
                "peligros inmediatos con una sensación de hormigueo en la parte posterior de la cabeza.\n\n";
        return d;
    }

    // Informacion personaje
    @Override
    public void presentacion(Screen s) {
        s.setVisible(true);

        s.out("\t\t\tGwendolyn Stacy\n\n","BOLD",30,Colors.black);
        s.out(mostrarInformacion(),"Courier",15,Colors.black);
        s.showImage("src\\Images\\Gwen\\SpiderGwen.jpg",380,400);
        s.setBounds(400,0,650,700);
    }


    // Ataques:
    @Override
    public void ataqueConContacto(Screen s) {
        s.repaint();
        s.out("\n\n     Lucha cuerpo a cuerpo\n","BOLD",20,Colors.pink);
        s.out(descripcionATK1(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\Gwen\\1.jpg");
        s.setBounds(400,0,650,700);
    }

    @Override
    public void ataqueCortaDistancia(Screen s) {
        s.repaint();
        s.out("\n\n     Lucha con lanza telarañas\n","BOLD",20,Colors.pink);
        s.out(descripcionATK1(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\Gwen\\2.gif",600,300);
        s.setBounds(400,0,650,700);
    }

    @Override
    public void habilidadEquipamiento(Screen s) {
        s.repaint();
        s.out("\n\n     Viajar a otros universos\n","BOLD",20,Colors.pink);
        s.out(descripcionATK1(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\Gwen\\3.jpg",600,300);
        s.setBounds(400,0,650,700);
    }

    @Override
    public void movilidad(Screen s) {
        s.repaint();
        s.out("\n\n     Trepar muros y columpiarse\n","BOLD",20,Colors.pink);
        s.out(descripcionATK1(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\Gwen\\4.gif");
        s.setBounds(400,0,650,700);
    }

    @Override
    public void sentidoAracnido(Screen s) {
        s.repaint();
        s.out("\n\n     Sentido Arácnido\n","BOLD",20,Colors.pink);
        s.out(descripcionATK1(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\Gwen\\5.gif");
        s.setBounds(400,0,650,700);
        s.out("\n","BOLD",30,Colors.black);
    }
}
