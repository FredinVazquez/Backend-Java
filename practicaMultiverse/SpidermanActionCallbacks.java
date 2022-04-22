
// Ataques de los superheroes
public interface SpidermanActionCallbacks {

    // Ataque con contacto
    public void ataqueConContacto(Screen s);

    // Ataque a corta distancia
    public void ataqueCortaDistancia(Screen s);

    // Ataque con equipo
    public void habilidadEquipamiento(Screen s);

    // Movilidad
    public void movilidad(Screen s);

    // Sentido arácnido
    public void sentidoAracnido(Screen s);


    // Información - Descripción
    public void presentacion(Screen s);
    public String descripcionATK1();
    public String descripcionATK2();
    public String equipamiento();
    public String transportarse();
    public String sAranido();

}
