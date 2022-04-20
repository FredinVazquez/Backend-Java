package practicaMona;

public class Jetpacktocat extends TheOctocat{
    public Jetpacktocat(String name, String suitColor, String suit, String objects , double height, int age){
        super(name, suitColor, suit,objects , height, age);
    }

    @Override
    public void accionRealizar() {
        System.out.printf(getName()+" ha comenzado su vuelvo alrededor de la gran cuidad, GitHubCity, y con su " +
                "tamaño de "+getHeight()+" [cm] logra efectos increibles.");
    }

    @Override
    public void hacerPasatiempo() {
        System.out.printf(getName()+" ha decidio viajar a su parque preferido usando su "+getObjects());
    }

    @Override
    public void comer() {
        System.out.printf(getName()+" está comiendo su almuerzo en el gran edificio de las Github.");
    }

    @Override
    public void descansar() {
        System.out.printf(getName()+" decidió quitarse su "+getObjects()+" para tomar una siesta de 30 minutos.");
    }

    @Override
    public void jugar() {
        System.out.printf(getName()+" está en el cielo jugando con las aves de la ciudad, su traje "+getSuit()+" " +
                "lo hace parecer un ave.");
    }

    @Override
    public void demostrarHabilidad() {
        System.out.printf("Gracias a su "+getSuit()+" "+getSuitColor()+" logra hacer efectos increibles en el cielo" +
                " junto con las demás aves de color "+getSuitColor()+".");
    }
}
