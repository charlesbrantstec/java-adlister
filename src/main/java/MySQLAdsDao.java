import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;


public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }
//TODO:Your methods should retrieve ads from the database and insert new ads into the database
    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> ads = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM ads");
        while (result.next()) {
            ads.add(new Ad(result.getLong("id"),
                           result.getLong("user_id"),
                           result.getLong("title"),
                           result.getLong("description")));
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String query = String.format("INSERT INTO albums (user_id, title, desrciption) VALUES (%d, '%s', '%s')",ad.getUserId(),ad.getTitle());
        Statement statement = connection.createStatement();
        statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        if (rs.next()) {
            System.out.println("Inserted a new Ad! New id: " + rs.getLong(0));
        }


//        return null;
    }
}
