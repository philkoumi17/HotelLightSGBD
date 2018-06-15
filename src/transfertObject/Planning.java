package transfertObject;

import java.text.*;
import java.util.*;

/**
 *
 * @author Philippe-K
 */

public class Planning
{
    private int Pl_Id;
    private Date Pl_Date;

    public Planning(){}

    public Planning(int Pl_Id, Date Pl_Date)
    {
        this.Pl_Id = Pl_Id;
        this.Pl_Date = Pl_Date;
    }

    /**
     * @return the Pl_Id
     */
    public int getPl_Id()
    {
        return Pl_Id;
    }

    /**
     * @param Pl_Id the Pl_Id to set
     */
    public void setPl_Id(int Pl_Id)
    {
        this.Pl_Id = Pl_Id;
    }

    /**
     * @return the Pl_Date
     */
    public Date getPl_Date()
    {
        return Pl_Date;
    }

    /**
     * @param Pl_Date the Pl_Date to set
     */
    public void setPl_Date(Date Pl_Date)
    {
        this.Pl_Date = Pl_Date;
    }
    
    public String getPl_DateBE()
    {
        String tmp;

        if(this.Pl_Date == null)
        {
            tmp = "";
        }
        else
        {
            SimpleDateFormat dateParser = new SimpleDateFormat("dd/MM/yyyy");
            tmp = dateParser.format(this.Pl_Date);
        }
        return tmp;
    }
}