package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the parentesco database table.
 * 
 */
@Entity
@Table(name="parentesco")
@NamedQuery(name="Parentesco.findAll", query="SELECT p FROM Parentesco p")
public class Parentesco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="parentesco_id")
	private int parentescoId;

	@Column(name="parentesco_estado")
	private int parentescoEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="parentesco_fecha_crea")
	private Date parentescoFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="parentesco_fecha_modifica")
	private Date parentescoFechaModifica;

	@Column(name="parentesco_nombre")
	private String parentescoNombre;

	@Column(name="parentesco_usuario_crea")
	private int parentescoUsuarioCrea;

	@Column(name="parentesco_usuario_modifica")
	private int parentescoUsuarioModifica;

	//bi-directional many-to-one association to PersonalContacto
	@OneToMany(mappedBy="parentesco")
	private List<PersonalContacto> personalContactos;

	public Parentesco() {
	}

	public int getParentescoId() {
		return this.parentescoId;
	}

	public void setParentescoId(int parentescoId) {
		this.parentescoId = parentescoId;
	}

	public int getParentescoEstado() {
		return this.parentescoEstado;
	}

	public void setParentescoEstado(int parentescoEstado) {
		this.parentescoEstado = parentescoEstado;
	}

	public Date getParentescoFechaCrea() {
		return this.parentescoFechaCrea;
	}

	public void setParentescoFechaCrea(Date parentescoFechaCrea) {
		this.parentescoFechaCrea = parentescoFechaCrea;
	}

	public Date getParentescoFechaModifica() {
		return this.parentescoFechaModifica;
	}

	public void setParentescoFechaModifica(Date parentescoFechaModifica) {
		this.parentescoFechaModifica = parentescoFechaModifica;
	}

	public String getParentescoNombre() {
		return this.parentescoNombre;
	}

	public void setParentescoNombre(String parentescoNombre) {
		this.parentescoNombre = parentescoNombre;
	}

	public int getParentescoUsuarioCrea() {
		return this.parentescoUsuarioCrea;
	}

	public void setParentescoUsuarioCrea(int parentescoUsuarioCrea) {
		this.parentescoUsuarioCrea = parentescoUsuarioCrea;
	}

	public int getParentescoUsuarioModifica() {
		return this.parentescoUsuarioModifica;
	}

	public void setParentescoUsuarioModifica(int parentescoUsuarioModifica) {
		this.parentescoUsuarioModifica = parentescoUsuarioModifica;
	}

	public List<PersonalContacto> getPersonalContactos() {
		return this.personalContactos;
	}

	public void setPersonalContactos(List<PersonalContacto> personalContactos) {
		this.personalContactos = personalContactos;
	}

	public PersonalContacto addPersonalContacto(PersonalContacto personalContacto) {
		getPersonalContactos().add(personalContacto);
		personalContacto.setParentesco(this);

		return personalContacto;
	}

	public PersonalContacto removePersonalContacto(PersonalContacto personalContacto) {
		getPersonalContactos().remove(personalContacto);
		personalContacto.setParentesco(null);

		return personalContacto;
	}

}