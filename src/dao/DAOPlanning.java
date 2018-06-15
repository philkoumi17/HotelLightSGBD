package dao;

import java.util.*;
import transfertObject.*;

/**
 *
 * @author Philippe-K
 */

public interface DAOPlanning
{
    ArrayList<Planning> selectPlanning();
    Date selectDateMin();
    Date selectDateMax();
    Planning selectPlanning(Date uneDate);
}