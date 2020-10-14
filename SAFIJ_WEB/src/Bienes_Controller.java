import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.unicomer.inhouse.adminhoth.entities.controllers.EJBAccessException;
import com.unicomer.inhouse.adminhoth.model.MnttoBcoCtaModel;
import com.unicomer.opos.inhouse.cashCreditCard.entities.CccBankAccount;
import com.utec.epro.clients.BienesFacadeLocal;
import com.utec.epro.entities.Bienes;

@SuppressWarnings("deprecation")
@ViewScoped
@ManagedBean(name = "BienesController")
public class Bienes_Controller implements Serializable {

	private static final long serialVersionUID = 1L;
	private Bienes actualBienes = new Bienes(); 
	public Bienes bienes;
	private List<Bienes> bienesListAll = new ArrayList<Bienes>();
	@EJB
	private BienesFacadeLocal bienesFacadeLocal;	
	

	
}
