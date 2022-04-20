package practicaMona;

public class Minertocat extends TheOctocat{
    public Minertocat(String name, String suitColor, String suit, String objects , double height, int age){
        super(name, suitColor, suit,objects , height, age);
    }

    @Override
    public void accionRealizar() {
        System.out.printf(getName()+" está minando y buscando objetos piedras o minerales valiosos.");
    }

    @Override
    public void hacerPasatiempo() {
        System.out.printf(getName()+" ha decidido apreciar y observar los minerales y piedras más valiosos" +
                "que ha conseguido durante la mina.");
    }

    @Override
    public void comer() {
        System.out.printf(getName()+" a decidido parar y comenzó a comer su emparedado que se preparó momentos " +
                "antes de venir a minar.");
    }

    @Override
    public void descansar() {
        System.out.printf(getName()+" se siente agotado, por lo que procede a acomodarse en una parte de la mina " +
                ", y gracias a su "+getSuit()+" "+getSuitColor()+" puede protegerse de heridas debido a que " +
                "este es muy resistente.");
    }

    @Override
    public void jugar() {
        super.jugar();
        System.out.printf(" está desgastado");
    }

    @Override
    public void demostrarHabilidad() {
        System.out.printf(getName()+" ha decidido desmotrar cuánto puede minar, por lo cual está " +
                "aplicando sus técnicas secretas para minar lo más rápido posible.");
    }
}
