package practicaMona;

public class VersionesOctocat {
    public static void main(String[] args) {
        // Primera versión:
        TheOctocat p1 = new Gobble_o_tron(
                "Daker","negro","traje de pulpo clásico","control a distancia",
                52.23,8);

        // Segunda versión
        TheOctocat p2 = new Jetpacktocat(
                "July","negro","traje de pulpo clásico","Jetpack",
                52.23,8);

        // Tercera versión
        TheOctocat p3 = new Minertocat("Jake","azul marino","traje de minero (tirantes)","pico de minar",
                52.23,8);

        // Cuarta versión
        TheOctocat p4 = new Luchadortocat("OctoMan","azul zafiro","traje de luchador y su mascara","mascara de luchador",
                52.23,8);

        // Quinta versión
        TheOctocat p5 = new Topguntocat(
                "Frost","verde fuerte","traje de aviador y su mascara","mascara de luchador",
                52.23,8);

        // Sexta versión
        TheOctocat p6 = new Carlostocat("Charly","azul claro","traje de paracaidista y sus lentes","paracaídas",
                52.23,8);

        // Presentación de cada Octocat
        p1.presentacion();
        p2.presentacion();
        p3.presentacion();
        p4.presentacion();
        p5.presentacion();
        p6.presentacion();
    }



}
