package practicaMona;

public class Topguntocat extends TheOctocat{
    public Topguntocat(String name, String suitColor, String suit, String objects , double height, int age){
        super(name, suitColor, suit,objects , height, age);
    }

    @Override
    public void accionRealizar() {
        System.out.printf(getName()+" junto con su "+getObjects()+" a comenzado su misión en el nombre de " +
                "su pueblo.");
    }

    @Override
    public void hacerPasatiempo() {
        System.out.printf("Para pasar el tiempo, "+getObjects()+" a empezado a entrenar sus resistencia a la " +
                "gravedad y su capacidad de vuelo.");
    }

    @Override
    public void comer() {
        super.comer();
    }

    @Override
    public void descansar() {
        System.out.printf(getName()+" está cansado, por eso volvió a su base para recostarse en su cama asignada.");
    }

    @Override
    public void jugar() {
        System.out.printf(getName()+" no tiene tiempo para jugar, lo hará en otra ocasión.");
    }

    @Override
    public void demostrarHabilidad() {
        System.out.printf(getName()+" a comenzado un vuelo empleando para técnicas de vuelo profesional, así como" +
                " las diferentes maniobras que puede hacer en el aire a la edad de "+getAge()+" años.");
    }
}
