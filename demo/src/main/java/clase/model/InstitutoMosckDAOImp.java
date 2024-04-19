package clase.model;

import java.sql.Connection;
import java.util.List;

public class InstitutoMosckDAOImp implements InstitutoDAO{

    @Override
    public Connection connect() {
        return null;
    }

    @Override
    public void insertar(Connection conn, Alumno a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }

    @Override
    public void insertar(Connection conn, List<Alumno> alumnos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }

    @Override
    public void actualizar(Connection conn, Alumno al) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
    }

    @Override
    public void borrar(Connection conn, Alumno al) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borrar'");
    }

    @Override
    public List<Alumno> listarAlumnos(Connection conn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarAlumnos'");
    }

    @Override
    public List<Alumno> listarAlumnos(Connection conn, int edad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarAlumnos'");
    }
    
}
