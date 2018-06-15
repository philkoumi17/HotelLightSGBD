package model;

import javax.swing.*;
import java.util.*;
import transfertObject.*;

/**
 *
 * @author Philippe-K
 */

public class ListModelPays extends AbstractListModel
{
    private ArrayList<Pays> myList;

    public ListModelPays(ArrayList myList)
    {
        this.myList = myList;
    }
    
    public Object getElementAt (int index)
    {
        return myList.get(index).getP_Nom();
    }

    public int getSize()
    {
        return myList.size();
    }
    
    public void setMyList(ArrayList<Pays> myList)
    {
        this.myList = myList;
        this.fireContentsChanged(this, 0, getSize());
    }
    
    public ArrayList<Pays> getMyList()
    {
        return myList;
    }
    
    public Pays getMyList(int index)
    {
        return myList.get(index);
    }
}