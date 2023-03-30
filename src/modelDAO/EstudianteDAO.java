package modelDAO;

import config.Conexion;
import interfaces.CRUDEstudiante;
import java.sql.*;
import model.Estudiante;

public class EstudianteDAO implements CRUDEstudiante{

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Estudiante e = new Estudiante();

    @Override
    public void listar() {
        String sql = "select * from estudiante";
        try {
            //Inicializa la base de datos
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " 
                        + rs.getString(3) + " - " + rs.getInt(4) + " - " + rs.getInt(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void add(String nombre, String apellido, int edad, int nota_promedio) {

        String query = "INSERT INTO estudiante VALUES (0,?,?,?,?);";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, edad);
            ps.setInt(4, nota_promedio);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void edit(int id, String nombre, String apellido, int edad, int nota_promedio) {

        String query = "UPDATE estudiante set nombre=?, apellido=?, edad=?, nota_promedio=? WHERE id=?;";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, edad);
            ps.setInt(4, nota_promedio);
            ps.setInt(5, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE from estudiante WHERE id=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
