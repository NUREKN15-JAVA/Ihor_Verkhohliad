package ua.nure.verkhohliad.db;

import ua.nure.verkhohliad.User;
import ua.nure.verkhohliad.db.DatabaseException;

import java.util.Collection;

public interface UserDAO {
    User create(User user) throws DatabaseException;

    User find(Long id) throws DatabaseException;

    void update(User user) throws DatabaseException;

    void delete(User user) throws DatabaseException;

    Collection<User> findAll() throws DatabaseException;

    void setConnectionFactory(ConnectionFactory connectionFactory);
}
