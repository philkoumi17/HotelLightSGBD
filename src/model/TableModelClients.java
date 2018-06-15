package model;

import javax.swing.table.*;
import java.util.*;
import transfertObject.*;

/**
 *
 * @author Philippe-K
 */

public class TableModelClients extends AbstractTableModel
{
    private ArrayList<Client> myList = new ArrayList<Client>();
    private String[] colNames = {"Cl_Id", "Nom", "Prénom", "Adresse", "CP", "Ville", "Pays", "DDN"};
    
    public TableModelClients(ArrayList<Client> myList)
    {
        this.myList = myList;
    }
    
    @Override
    public int getRowCount()
    {
        return myList.size();
    }

    @Override
    public int getColumnCount()
    {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Client myCli = myList.get(rowIndex);
        switch(columnIndex)
        {
            case 0: return myCli.getCl_Id();
            case 1: return myCli.getCl_Nom();
            case 2: return myCli.getCl_Prénom();
            case 3: return myCli.getCl_Adresse();
            case 4: return myCli.getCl_CP();
            case 5: return myCli.getCl_Ville();
            case 6: return myCli.getCl_Pays().getP_Nom();
            case 7: return myCli.getCl_NaissBE();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int col)
    {
        return colNames[col];
    }
    
    @Override
    public Class getColumnClass(int c)
    {
        // return getValueAt(0, c).getClass(); ! provoque une erreur quand la table est vide et qu'il y a un sorter !
        switch (c)
        {
            case 0 : return Integer.class;
            case 1 : return String.class;
            case 2 : return String.class;
            case 3 : return String.class;
            case 4 : return String.class;
            case 5 : return String.class;
            case 6 : return String.class;
            case 7 : return String.class;
        }
        return null;
    }
    
    public void setMyList(ArrayList myList)
    {
        this.myList = myList;
        this.fireTableDataChanged();
    }
    
    public ArrayList<Client> getMyList()
    {
        return myList;
    }
    
    public Client getMyList(int index)
    {
        return myList.get(index);
    }
}