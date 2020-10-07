package business.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import model.Dummy00;

/**
 * Session Bean implementation class sessionBean
 */
@Stateless
@LocalBean
public class sessionBean {
	Dummy00 dummy = new Dummy00();
    /**
     * Default constructor. 
     */
    public sessionBean() {
        // TODO Auto-generated constructor stub
    }
    public void escribir () {
    	
    	
    }

}
