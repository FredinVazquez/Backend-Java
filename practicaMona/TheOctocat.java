package practicaMona;

public class TheOctocat {
    //  Atributos:
    private String name;
    private String suitColor;
    private String suit;
    private String objects;
    private double height;
    private int age;


    public TheOctocat(String name, String suitColor, String suit, String objects , double height, int age){
        this.name = name;
        this.suitColor = suitColor;
        this.suit = suit;
        this.objects = objects;
        this.height = height;
        this.age = age;
    }

    // Métodos:
    public void accionRealizar(){
        System.out.printf("Se está portando adorable con su traje " + this.suit + " de color" + this.suitColor);
    }

    public void hacerPasatiempo(){
        System.out.printf("Está conviviendo con los usuarios de Github.");
    }

    public void comer(){
        System.out.printf(this.name + " empezó a comer atún en lata, la suficiente cantidad para un octocat de " + this.age);
    }

    public void descansar(){
        System.out.printf(this.name + " se dispone de tomar una siesta en el cuarto de algún usuario de github," +
                "y gracias a su altura de " +this.height + " puede estar en cualquier lado.");
    }

    public void jugar(){
        System.out.printf(this.name + " comenzó a jugar con los objetos alrededor, debido a que " + this.objects);
    }

    public void demostrarHabilidad(){
        System.out.printf(this.name + " está escuchando y apoyando a los usuarios de la plataforma");
    }

    //Getters
    public String getName() {return name;}
    public double getHeight() {return height;}
    public String getObjects() {return objects;}
    public String getSuit() {return suit;}
    public int getAge() {return age;}
    public String getSuitColor() {return suitColor;}
}
