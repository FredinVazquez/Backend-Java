package practicaMona;

public class Carlostocat extends TheOctocat{
    public Carlostocat(String name, String suitColor, String suit, String objects , double height, int age){
        super(name, suitColor, suit,objects , height, age);
    }

    @Override
    public void accionRealizar() {
        System.out.printf(getName()+" se ha tirado desde su avión de turno.");
    }

    @Override
    public void hacerPasatiempo() {
        System.out.printf(getName()+" está entrenando los modos de saltar desde el avión, y ordenando" +
                " su "+getSuit()+getSuitColor());
    }

    @Override
    public void comer() {
        System.out.printf(getName()+" está comiendo su plato de comida balanceado para mantenerse en forma.");
    }

    @Override
    public void jugar() {
        System.out.printf(getName()+" no puede jugar porque está entrenando y su "+getSuit()+" no puede dañarse " +
                "con juegos.");
    }

    @Override
    public void descansar() {
        System.out.printf("Después de un día de entrenamiento, se puso a dormir 3 horas para reponer energías.");
    }

    @Override
    public void demostrarHabilidad() {
        System.out.printf(getName()+" con toda la actitud, comenzó a realizar diferentes movimientos, en tierra, " +
                "demostrando los movimientos que puede hacer en el aire.");
    }
}
