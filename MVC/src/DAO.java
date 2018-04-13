import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface DAO {
    Connection getCon();
    boolean update (String current_user, Controller cont, Connection connection);
    boolean delete (String current_user, Controller cont, Connection connection);
    List select (Connection connection) throws SQLException;
    boolean insert (Controller cont, Connection connection);

}
