package controler;

import java.util.Scanner;
import model.Estudiante;
import modelDAO.EstudianteDAO;

public class Controler {

    public static void main(String[] args) {
        int op = 0;
        boolean salir = true;
        Scanner in = new Scanner(System.in);
        Scanner entradaDatos = new Scanner(System.in);
        EstudianteDAO dao = new EstudianteDAO();
        Estudiante e = new Estudiante();
        String nombre = "", apellido = "";
        int id = 0, edad = 0, nota_promedio = 0;

        while (salir) {
            System.out.println("\n----------------------------");
            System.out.println("-------CRUD ESTUDIANTES-----");
            System.out.println("----------------------------");
            System.out.println("Elige alguna de las opciones\n"
                    + "1. Listar Estudiantes\n"
                    + "2. Agregar Estudiante\n"
                    + "3. Modificar Estudiante\n"
                    + "4. Eliminar estudiante\n"
                    + "5. Salir");
            System.out.print("\nIntroduce la opcion ");
            op = in.nextInt();
            System.out.println("");
            switch (op) {
                case 1:
                    dao.listar();
                    break;
                case 2:
                    System.out.print("Dame el nombre: ");
                    nombre = entradaDatos.nextLine();
                    System.out.print("Dame el apellido: ");
                    apellido = entradaDatos.nextLine();
                    System.out.print("Dame la edad: ");
                    edad = entradaDatos.nextInt();
                    System.out.print("Dame la nota promedio: ");
                    nota_promedio = entradaDatos.nextInt();
                    dao.add(nombre, apellido, edad, nota_promedio);
                    System.out.println("\nEstudiante registrado");
                    break;
                case 3:
                    System.out.print("Dame el id: ");
                    id = entradaDatos.nextInt(); entradaDatos.nextLine();
                    System.out.print("Dame el nombre: ");
                    nombre = entradaDatos.nextLine();
                    System.out.print("Dame el apellido: ");
                    apellido = entradaDatos.nextLine();
                    System.out.print("Dame la edad: ");
                    edad = entradaDatos.nextInt();
                    System.out.print("Dame la nota promedio: ");
                    nota_promedio = entradaDatos.nextInt();
                    dao.edit(id, nombre, apellido, edad, nota_promedio);
                    System.out.println("\nEstudiante modificado");
                    break;
                case 4:
                    System.out.print("Dame el id: ");
                    id = entradaDatos.nextInt(); entradaDatos.nextLine();
                    dao.eliminar(id);
                    System.out.println("\nEstudiante eliminado");
                    break;
                case 5:
                    salir = false;
                    break;
                default:
                    System.out.println("Elegiste una opcion Incorrecta");
            }
        }
    }
}
