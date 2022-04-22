// Librerias para la manipulación de la imagen con Javaswing y java awt que son para GUI

// PeterParker

public class PeterParker extends Spiderman implements SpidermanActionCallbacks{
    //Llamando al constructor heredado:
    public PeterParker(String n,String c1,String c2, String c3, int edad, String patron, double h, String genero,
                       String descripcion){
        super(n,c1,c2,c3,edad,patron,h,genero,descripcion);
    }

    // Implementando la interfaz:

    // Descripciones:
    @Override
    public String descripcionATK1() {
        String d = "Fuerza física del hombre araña es suficiente para levantar y tirar objetos tan pesados como la " +
                "mayoría de los automóviles con facilidad. Sus golpes serían fatales para un ser humano normal.\n\n";
        return d;
    }
    @Override
    public String descripcionATK2() {
        String d = "Este es un poder el cual le permitía producir telarañas " +
                "desde los antebrazos y lanzarlas a voluntad.\n\n";
        return d;
    }
    @Override
    public String equipamiento() {
        String d = "Telaraña orgánica - Equipamiento\n\n";
        return d;
    }
    @Override
    public String transportarse() {
        String d = "Trepa muros y columpiarse con su telaraña gracias a las construcciones de alrededor.\n\n";
        return d;
    }
    @Override
    public String sAranido() {
        String d = "Tienen un sentido arácnido, que es una habilidad pre-cognitiva que les advierte de un peligro inminente.\n\n";
        return d;
    }

    // Informacion personaje
    @Override
    public void presentacion(Screen s) {
        s.setVisible(true);
        s.out("\t\t\tPeter Parker\n","BOLD",30,Colors.black);
        s.out(mostrarInformacion(),"Courier",15,Colors.black);
        s.showImage("src\\Images\\Peter\\PeterParker.jpg",600,400);
        s.setBounds(400,0,650,700);

    }


    // Ataques:
    @Override
    public void ataqueConContacto(Screen s) {
        s.repaint();
        s.out("\n\n     Combate cuerpo a cuerpo - Fuerza sobrehumana\n","BOLD",20,Colors.RoyalBlue);
        s.out(descripcionATK1(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\Peter\\1.gif");
        s.setBounds(400,0,650,700);
    }

    @Override
    public void ataqueCortaDistancia(Screen s) {
        s.repaint();
        s.out("\n\n     Telaraña orgánica\n","Courier",20,Colors.RoyalBlue);
        s.out(descripcionATK2(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\Peter\\2.gif");
        s.setBounds(400,0,650,700);
    }

    @Override
    public void habilidadEquipamiento(Screen s) {
        s.repaint();
        s.out("\n\n     Equipamiento de lanza telaraña\n","Courier",20,Colors.RoyalBlue);
        s.out(equipamiento(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\Peter\\3.gif");
        s.setBounds(400,0,650,700);
    }

    @Override
    public void movilidad(Screen s) {
        s.repaint();
        s.out("\n\n     Movilidad\n","Courier",20,Colors.RoyalBlue);
        s.out(transportarse(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\Peter\\4.gif");
        s.setBounds(400,0,650,700);
    }

    @Override
    public void sentidoAracnido(Screen s) {
        s.repaint();
        s.out("\n\n     Sentido Aracnido\n","Courier",20,Colors.RoyalBlue);
        s.out(sAranido(),"BOLD",14,Colors.black);
        s.showImage("src\\Images\\Peter\\5.gif");

        s.setBounds(400,0,650,700);
        s.out("\n","BOLD",30,Colors.black);
    }

}
