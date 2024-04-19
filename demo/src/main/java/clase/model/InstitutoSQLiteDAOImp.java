package clase.model;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class InstitutoSQLiteDAOImp implements InstitutoDAO {
    private static final String DATABASE_NAME = "mybasedatos.db";
    private static final String JDBC_URL = "jdbc:sqlite:%s";

    @Override
    public Connection connect() throws Exception {
        URL resource = InstitutoSQLiteDAOImp.class.getResource(DATABASE_NAME);
        String path = new File(resource.toURI()).getAbsolutePath();
        String url = String.format(JDBC_URL, path);
        Connection conn = DriverManager.getConnection(url);
        return conn;
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