package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the personal_contactos database table.
 * 
 */
@Entity
@Table(name="personal_contactos")
@NamedQuery(name="PersonalContacto.findAll", query="SELECT p FROM PersonalContacto p")
public class PersonalContacto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="contactos_id")
	private int contactosId;

	@Column(name="contacto_telefono_fijo")
	private String contactoTelefonoFijo;

	@Column(name="contacto_telefono_movil")
	private String contactoTelefonoMovil;

	@Column(name="contactos_direccion")
	private String contactosDireccion;

	@Column(name="contactos_estado")
	private int contactosEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="contactos_fecha_crea")
	private Date contactosFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="contactos_fecha_modifica")
	private Date contactosFechaModifica;

	@Column(name="contactos_nombre")
	private String contactosNombre;

	@Column(name="contactos_usuario_crea")
	private int contactosUsuarioCrea;

	@Column(name="contactos_usuario_modifica")
	private int contactosUsuarioModifica;

	//bi-directional many-to-one association to Parentesco
	@ManyToOne
	@JoinColumn(name="contactos_parentesco_id")
	private Parentesco parentesco;

	//bi-directional many-to-one association to PersonalPersona
	@ManyToOne
	@JoinColumn(name="contactos_persona_id")
	private PersonalPersona personalPersona;

	public PersonalContacto() {
	}

	public int getContactosId() {
		return this.contactosId;
	}

	public void setContactosId(int contactosId) {
		this.contactosId = contactosId;
	}

	public String getContactoTelefonoFijo() {
		return this.contactoTelefonoFijo;
	}

	public void setContactoTelefonoFijo(String contactoTelefonoFijo) {
		this.contactoTelefonoFijo = contactoTelefonoFijo;
	}

	public String getContactoTelefonoMovil() {
		return this.contactoTelefonoMovil;
	}

	public void setContactoTelefonoMovil(String contactoTelefonoMovil) {
		this.contactoTelefonoMovil = contactoTelefonoMovil;
	}

	public String getContactosDireccion() {
		return this.contactosDireccion;
	}

	public void setContactosDireccion(String contactosDireccion) {
		this.contactosDireccion = contactosDireccion;
	}

	public int getContactosEstado() {
		return this.contactosEstado;
	}

	public void setContactosEstado(int contactosEstado) {
		this.contactosEstado = contactosEstado;
	}

	public Date getContactosFechaCrea() {
		return this.contactosFechaCrea;
	}

	public void setContactosFechaCrea(Date contactosFechaCrea) {
		this.contactosFechaCrea = contactosFechaCrea;
	}

	public Date getContactosFechaModifica() {
		return this.contactosFechaModifica;
	}

	public void setContactosFechaModifica(Date contactosFechaModifica) {
		this.contactosFechaModifica = contactosFechaModifica;
	}

	public String getContactosNombre() {
		return this.contactosNombre;
	}

	public void setContactosNombre(String contactosNombre) {
		this.contactosNombre = contactosNombre;
	}

	public int getContactosUsuarioCrea() {
		return this.contactosUsuarioCrea;
	}

	public void setContactosUsuarioCrea(int contactosUsuarioCrea) {
		this.contactosUsuarioCrea = contactosUsuarioCrea;
	}

	public int getContactosUsuarioModifica() {
		return this.contactosUsuarioModifica;
	}

	public void setContactosUsuarioModifica(int contactosUsuarioModifica) {
		this.contactosUsuarioModifica = contactosUsuarioModifica;
	}

	public Parentesco getParentesco() {
		return this.parentesco;
	}

	public void setParentesco(Parentesco parentesco) {
		this.parentesco = parentesco;
	}

	public PersonalPersona getPersonalPersona() {
		return this.personalPersona;
	}

	public void setPersonalPersona(PersonalPersona personalPersona) {
		this.personalPersona = personalPersona;
	}

}