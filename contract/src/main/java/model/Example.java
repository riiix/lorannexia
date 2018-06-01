package model;

/**
 * <h1>The Class Example.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Example {

    /** The cox. */
    private final int cox;
    
    /** The coy. */
    private final int coy;

    /** The Nom_Element. */
    private String   Nom_Element;
    
    /** The ID_Map. */
    private final int ID_Map;
    
    

    /**
     * Instantiates a new example.
     *
     * @param id
     *            the id
     * @param name
     *            the name
     */
    public Example(final int cox,final int coy, final int ID_Map,String Nom_Element) {
        super();
        this.cox = cox;
        this.coy = coy;
        this.Nom_Element = Nom_Element;
        this.ID_Map = ID_Map;
    }

    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
       /* String[][] map= new String[20][12];
    	for(int i=0;i<12<i++) {
    		for(int j=0;j<20;j++) {
    			String[j][i]=
    		}*/
    	
    	
    	return (this.Nom_Element +":"+this.cox +";"+this.coy+"\n");
    	}
    }

