package dao;

import java.util.*;
import transfertObject.*;

/**
 *
 * @author Philippe-K
 */

public interface DAOClient
{
    ArrayList<Client> selectClients();
    // ArrayList<Client> selectClients(String nom, String prénom);
    boolean insertClient(Client cl);
    boolean updateClient(Client cl);
    boolean deleteClient(int idCl);
}