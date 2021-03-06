package main.services;

import main.model.connection.ManagementSystem;
import main.model.dao.PublicationsDao;
import main.model.dao.PublicationsDaoImpl;
import main.model.pojo.Publications;

import java.util.List;

/**
 * Created by admin on 24.04.2017.
 */
public class PublicationsService implements PublicationsServiceInterface {
    private static PublicationsDao publicationsDao = new PublicationsDaoImpl();

    public List<Publications> getAll() {

        return publicationsDao.getAll();
    }

    public Publications get(Integer id) {

        return publicationsDao.getById(id);
    }
    public void update(Publications publication){
        publicationsDao.updatePublication(publication);
    }

    public void delete(Integer id) {

        publicationsDao.deletePublication(id);
    }

    public void insert(Integer user_id, String name, String genre, String text) {
        publicationsDao.insertPublication(user_id, name, genre, text);
    }
    public List<Publications> getUsersPublications(Integer userId){
        return publicationsDao.getUsersPublications(userId);
    }
}
