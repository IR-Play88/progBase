package clase.model;

import java.sql.Connection;
import java.util.List;

public interface InstitutoDAO {
    public Connection connect() throws Exception;
    public void insertar(Connection conn, Alumno a);
    public void insertar(Connection conn, List<Alumno> alumnos);
    public void actualizar(Connection conn, Alumno al);
    public void borrar(Connection conn, Alumno al);
    public List<Alumno> listarAlumnos(Connection conn);
    public List<Alumno> listarAlumnos(Connection conn, int edad);
}

