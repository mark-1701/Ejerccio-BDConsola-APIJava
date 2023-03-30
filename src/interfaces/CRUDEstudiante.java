package interfaces;

public interface CRUDEstudiante {
    public void listar();
    public void add(String nombre, String apellido, int edad, int nota_promedio);
    public void edit(int id, String nombre, String apellido, int edad, int nota_promedio);
    public void eliminar(int id);
}
