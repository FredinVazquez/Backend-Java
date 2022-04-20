package practicaMona;

public class Gobble_o_tron extends TheOctocat{

    public Gobble_o_tron(String name, String suitColor, String suit, String objects , double height, int age){
        super(name, suitColor, suit,objects , height, age);
    }

    @Override
    public void accionRealizar() {
        System.out.printf(super.getName()+" está en los laboratorios de la plataforma y escondiendo el control");
    }

    @Override
    public void hacerPasatiempo() {
        System.out.printf(super.getName()+"Empezó a esconderse detras de los equipos de trabajo.");
    }

    @Override
    public void descansar() {
        System.out.printf(super.getName()+" encontró un lugar para dormir 8 horas dentro de las instalaciones, " +
                "en una zona donde gracias a su "+super.getSuit()+" "+super.getSuitColor()+" puede camuflajearse");
    }

    @Override
    public void jugar() {
        System.out.printf(super.getName() + " está jugando con " +super.getObjects()+" y con los animales de la zona.");
    }

    @Override
    public void demostrarHabilidad() {
        System.out.printf("Gracias a su "+super.getSuit()+" "+super.getSuitColor()+", "+super.getName()+" se ha" +
                "camuflajeado en las instalaciones.");
    }
}
