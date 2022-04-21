package practicaMona;

public class Luchadortocat extends TheOctocat{
    public Luchadortocat(String name, String suitColor, String suit, String objects , double height, int age){
        super(name, suitColor, suit,objects , height, age);
    }


    @Override
    public void accionRealizar() {
        System.out.printf(getName()+" está haciendo movimientos de lucha y peleando con su sombra (haciendo sombra).");
    }

    @Override
    public void hacerPasatiempo() {
        System.out.printf(getName()+"ha comenzado a entrenar y preparar su "+ getSuit()+" "+getSuitColor()
                +" para su próximo reto.");
    }

    @Override
    public void comer() {
        super.comer();
    }

    @Override
    public void descansar() {
        System.out.printf("Después de entrenar, "+getName()+" decidió descansar en su lugar preferido, su cuarto.");
    }

    @Override
    public void jugar() {
        System.out.printf(getName()+" se puso a jugar con su sombra, como un gatito.");
    }

    @Override
    public void demostrarHabilidad() {
        System.out.printf(getName()+" está realizando marometas en el aire y saltando a grandes alturas.");
    }
}
