// Librerias para la manipulación de la imagen con Javaswing y java awt que son para GUI
import javax.swing.*;
import java.awt.Image;

public class Spiderverse {

    static Screen s = new Screen();

    public static void main(String[] args) {
        // Pantalla:
        Dialog d = new Dialog();
        String str="Nothing";
        boolean flag = true;

        while (flag)
        {
            str = d.readString("¿Qué versión de SpiderMan deseas ver?\n > SpiderMan Peter Parker : P || Peter" +
                        "\n > SpiderMan Miles Morales: M || Miles \n > Spider Gwen (Gwendolyn Stacy): G || Gwen" +
                    "\n > Salir: Cualquier tecla");
            s.cls();

            switch (str){
                case "P":
                case "Peter":
                case "p":
                    peter();
                    break;

                case "Miles":
                case "M":
                case "m":
                    miles();
                    break;

                case "Gwen":
                case "G":
                case "g":
                    gwen();
                    break;

                default:
                    flag = false;
                    s.setVisible(true);
                    s.setBounds(300,200,900,300);
                    s.out("\t  Gracias por usar la aplicación","BOLD",50,Colors.black);
                    break;

            }
            try{
                Thread.sleep(10000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }

    // Métodos estáticos - Personajes:
    static public void peter(){
        PeterParker peter = new PeterParker(
                "Peter Parker","Rojo","Azul","Blanco y Negro",26,"Telarañas",
                1.68,"Masculino",
                "Peter Parker obtuvo sus poderes en una excursión de la secundaria a Osborn Industries, Inc., " +
                        "donde le mordió una araña expuesta al recinto de la fórmula Oz. Quedó impregnando con los poderes " +
                        "proporcionales a los de una araña."

        );

        peter.presentacion(s);
        peter.ataqueConContacto(s);
        peter.ataqueCortaDistancia(s);
        peter.habilidadEquipamiento(s);
        peter.movilidad(s);
        peter.sentidoAracnido(s);
    }

    static public void gwen(){
        GwendolynStacy gwen = new GwendolynStacy(
                "Gwendolyn Stacy","Negro","Blanco","Rosa",17,"Colores sólidos",1.65,
                "Femenino","Después de ser mordida por una araña de ingeniería genética, Gwen recibió " +
                "superpoderes de tipo arácnido. La luchadora contra el crimen retirada Janet van Dyne le dio un traje y " +
                "un juego de Lanza-Telarañas."
        );

        gwen.presentacion(s);
        gwen.ataqueConContacto(s);
        gwen.ataqueCortaDistancia(s);
        gwen.habilidadEquipamiento(s);
        gwen.movilidad(s);
        gwen.sentidoAracnido(s);

    }

    static public void miles(){
        MilesMorales miles = new MilesMorales(
                "Miles Morales","Negro","Rojo","Blanco",17,"Colores sólidos y Telarañas",
                1.57,"Masculino","Mientras Miles y su tío discutían las oportunidades que la escuela " +
                "podría abrir para su futuro, la araña genéticamente mejorada con la fórmula OZ salió del bolso y mordió " +
                "a Miles en la mano."
        );

        miles.presentacion(s);
        miles.ataqueConContacto(s);
        miles.ataqueCortaDistancia(s);
        miles.habilidadEquipamiento(s);
        miles.movilidad(s);
        miles.sentidoAracnido(s);
    }
}
