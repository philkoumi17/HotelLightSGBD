package transfertObject;

import java.util.Objects;

/**
 *
 * @author Philippe-K
 */

public class Reservation
{
    private int resId;
    private Client cliRes;
    private Chambre chRes;
    private Planning plRes;
    private int NbPers;

    public Reservation(){}

    public Reservation(int resId, Client cliRes, Chambre chRes, Planning plRes, int NbPers)
    {
        this.resId = resId;
        this.cliRes = cliRes;
        this.chRes = chRes;
        this.plRes = plRes;
        this.NbPers = NbPers;
    }
    
    /**
     * @return the resId
     */
    public int getResId()
    {
        return resId;
    }

    /**
     * @param resId the resId to set
     */
    public void setResId(int resId)
    {
        this.resId = resId;
    }
    
    /**
     * @return the cliRes
     */
    public Client getCliRes()
    {
        return cliRes;
    }

    /**
     * @param cliRes the cliRes to set
     */
    public void setCliRes(Client cliRes)
    {
        this.cliRes = cliRes;
    }

    /**
     * @return the chRes
     */
    public Chambre getChRes()
    {
        return chRes;
    }

    /**
     * @param chRes the chRes to set
     */
    public void setChRes(Chambre chRes)
    {
        this.chRes = chRes;
    }

    /**
     * @return the plRes
     */
    public Planning getPlRes()
    {
        return plRes;
    }

    /**
     * @param plRes the plRes to set
     */
    public void setPlRes(Planning plRes)
    {
        this.plRes = plRes;
    }

    /**
     * @return the NbPers
     */
    public int getNbPers()
    {
        return NbPers;
    }

    /**
     * @param NbPers the NbPers to set
     */
    public void setNbPers(int NbPers)
    {
        this.NbPers = NbPers;
    }

    @Override
    public boolean equals(Object objet)
    {
        if(objet instanceof Reservation)
        {
            Reservation res = (Reservation)objet;
            if(cliRes.equals(res.getCliRes()) && res.equals(chRes.getCh_Num()) && plRes.equals(res.getPlRes()))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.cliRes);
        hash = 73 * hash + Objects.hashCode(this.chRes);
        hash = 73 * hash + Objects.hashCode(this.plRes);
        return hash;
    }
}