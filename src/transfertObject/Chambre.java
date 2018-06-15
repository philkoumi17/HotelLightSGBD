package transfertObject;

/**
 *
 * @author Philippe-K
 */

public class Chambre
{
    private int Ch_Num, Ch_Couchage;
    private boolean Ch_Bain, Ch_Douche, Ch_WC;

    public Chambre(){}

    public Chambre(int Ch_Num, boolean Ch_Bain, boolean Ch_Douche, boolean Ch_WC, int Ch_Couchage)
    {
        this.Ch_Num = Ch_Num;
        this.Ch_Bain = Ch_Bain;
        this.Ch_Douche = Ch_Douche;
        this.Ch_WC = Ch_WC;
        this.Ch_Couchage = Ch_Couchage;
    }

    /**
     * @return the Ch_Num
     */
    public int getCh_Num()
    {
        return Ch_Num;
    }

    /**
     * @param Ch_Num the Ch_Num to set
     */
    public void setCh_Num(int Ch_Num)
    {
        this.Ch_Num = Ch_Num;
    }

    /**
     * @return the Ch_Couchage
     */
    public int getCh_Couchage()
    {
        return Ch_Couchage;
    }

    /**
     * @param Ch_Couchage the Ch_Couchage to set
     */
    public void setCh_Couchage(int Ch_Couchage)
    {
        this.Ch_Couchage = Ch_Couchage;
    }

    /**
     * @return the Ch_Bain
     */
    public boolean isCh_Bain()
    {
        return Ch_Bain;
    }

    /**
     * @param Ch_Bain the Ch_Bain to set
     */
    public void setCh_Bain(boolean Ch_Bain)
    {
        this.Ch_Bain = Ch_Bain;
    }

    /**
     * @return the Ch_Douche
     */
    public boolean isCh_Douche()
    {
        return Ch_Douche;
    }

    /**
     * @param Ch_Douche the Ch_Douche to set
     */
    public void setCh_Douche(boolean Ch_Douche)
    {
        this.Ch_Douche = Ch_Douche;
    }

    /**
     * @return the Ch_WC
     */
    public boolean isCh_WC()
    {
        return Ch_WC;
    }

    /**
     * @param Ch_WC the Ch_WC to set
     */
    public void setCh_WC(boolean Ch_WC)
    {
        this.Ch_WC = Ch_WC;
    }

    @Override
    public String toString()
    {
        if(Ch_Num == 0)
        {
            return "*";
        }
        else
        {
            return String.valueOf(Ch_Num);
        }
    }
}