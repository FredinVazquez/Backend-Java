package practicaHarry;

public class PersonajesHarryPotter {
    public static void main(String[] args) {
        // Instancia de objetos
        HarryPotter harryPotter = new HarryPotter(41,"Harry James Potter","31 de Julio de 1980","Masculino",
                "Gryffindor","Dementor","Problemas al lidiar con emociones",
                "Subestima situaciones","Ira");
        RonWeasley ronWeasley = new RonWeasley(32,"Ronald Billius Weasley","1 de marzo de 1980","Masculino","Gryffindor",
                "Acromántula","Estudiante muy flojo","Celos de habilidades","No pone seriedad en las cosas");
        LordVoldemort lordVoldemort = new LordVoldemort(71,"Lord Voldemort","31 de diciembre de 1926","Masculino",
                "Slytherin","Su cadaver","Pánico a la muerte","Miedo a la profecia","Falta de sabiduría");
        RubeusHagrid rubeusHagrid = new RubeusHagrid(89,"Rubeus Hagrid","6 de diciembre de 1929","Masculino","Gryffindor",
                "Ver muerto a Harry, o cualquier amigo","Criaturas extrañas o peligrosas","Ser descuidado","Distante " +
                "en relaciones");
        HermioneGranger hermioneGranger = new HermioneGranger(42,"Hermione Jean Granger","19 de Septiembre de 1979","Femenino",
                "Gryffindor","La profesora McGonagall diciéndole que reprobó todo","Mente cerrada de acuerdo a sus pensamientos","Sus emociones podrían" +
                "nublar su juicio","Subestimar situaciones");



        // Mostrar sus datos:
        harryPotter.showDetails();
        ronWeasley.showDetails();
        lordVoldemort.showDetails();
        rubeusHagrid.showDetails();
        hermioneGranger.showDetails();

    }
}

/*
* Referencias
* https://elgrancomedor.foroactivo.com/t531-boggarts-de-los-personajes
* https://www.bloghogwarts.com/personajes/
* */
